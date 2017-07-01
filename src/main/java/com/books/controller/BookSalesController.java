package com.books.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.books.model.BookSales;
import com.books.model.User;
import com.books.service.BookSalesService;



@Controller
@RequestMapping("bookSales")
public class BookSalesController {

	@Autowired
	private BookSalesService bookSalesService;
	
	@GetMapping("/mybookSales")
	public String myBookSales(ModelMap modelMap, HttpSession session) {

		User user = (User) session.getAttribute("USER_LOGGED");
		List<BookSales> listSales = bookSalesService.findAllOrders(user.getId());
		modelMap.addAttribute("MY_ORDERS", listSales);
		return "bookSales/allSales";

	}
	
	@GetMapping
	public String list(ModelMap modelMap, HttpSession session) {

		List<BookSales> list = bookSalesService.findAll();
		System.out.println("orders:"+ list.size());
		modelMap.addAttribute("BookSales_LIST", list);
		return "bookSales/list";

	}

	@GetMapping("/cart")
	public String cart(){
		return "bookSales/cart";
	}
	
	@PostMapping("/save")
	public String save(@RequestParam("total_amount")String totalAmount, HttpSession session) {

		BookSales booksInCart = (BookSales) session.getAttribute("MY_CART_ITEMS");
		if ( booksInCart != null && booksInCart.getBookSalesItems().size() > 0) {
			double total = Double.parseDouble(totalAmount);
			booksInCart.setTotalAmount(total);
			bookSalesService.save(booksInCart);
			session.removeAttribute("MY_CART_ITEMS");			
		}		
		return "redirect:../bookSales/mybookSales";
	}	
}