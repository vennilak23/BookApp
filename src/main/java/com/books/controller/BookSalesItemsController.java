package com.books.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.books.model.Book;
import com.books.model.BookSales;
import com.books.model.BookSalesItems;
import com.books.model.User;
import com.books.service.BookService;



@Controller
@RequestMapping("bookSalesItems")
public class BookSalesItemsController {
	@Autowired
	private BookService bookService;

	@PostMapping("/addToCart")
	public String addToCart(@RequestParam("book_id") Long isbn, @RequestParam("quantity") Integer quantity,
			HttpSession session) {

		User user = (User) session.getAttribute("USER_LOGGED");

		BookSales bookSales = (BookSales) session.getAttribute("MY_CART_ITEMS");

		// create order
		if (bookSales == null) {
			bookSales = new BookSales();
			bookSales.setUser(user);
			bookSales.setTotalAmount(0);
			bookSales.setStatus("ORDERED");
		}

		// store orderItems
		List<BookSalesItems> bookSalesItems = bookSales.getBookSalesItems();

		// If already the item is added to cart, then add the quantity

		boolean isItemExists = false;
		for (BookSalesItems item : bookSalesItems) {

			if (item.getBook().getIsbn() == isbn) {
				int totalQuantity = item.getQuantity() + quantity;
				item.setQuantity(totalQuantity);
				isItemExists = true;
			}
		}

		//If item not exists, create new Item
		if ( ! isItemExists) {

			BookSalesItems bookSalesItem = new BookSalesItems();
			bookSalesItem.setBookSales(bookSales);

			Book book = bookService.findOne(isbn);
			bookSalesItem.setBook(book);
			bookSalesItem.setQuantity(quantity);
			bookSalesItems.add(bookSalesItem);
		}

		bookSales.setBookSalesItems(bookSalesItems);

		session.setAttribute("MY_CART_ITEMS", bookSales);

		// orderService.save(order);

		return "redirect:../bookSales/cart";
	}

	@GetMapping("/list")
	public String list(HttpSession session) {
		return null;

	}

	@GetMapping("/remove")
	public String removeItemFromCart(@RequestParam("id") Integer id, HttpSession session) {

		System.out.println("Remove Item from Card:" + id);
		BookSales bookSales = (BookSales) session.getAttribute("MY_CART_ITEMS");

		if (bookSales != null && bookSales.getBookSalesItems().size() > 0) {
			List<BookSalesItems> bookSalesItems = bookSales.getBookSalesItems();
			BookSalesItems itemSelected = bookSalesItems.get(id);
			bookSalesItems.remove(itemSelected);
			bookSales.setBookSalesItems(bookSalesItems);
			session.setAttribute("MY_CART_ITEMS", bookSales);
		}

		return "redirect:../bookSales/cart";

	}

	@GetMapping("/emptycart")
	public String emptyCartid(HttpSession session) {

		session.removeAttribute("MY_CART_ITEMS");
		return "redirect:../bookSales/cart";

	}

}
