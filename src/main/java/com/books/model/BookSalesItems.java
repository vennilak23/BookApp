package com.books.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "book_sales_items")
public class BookSalesItems {

	@Id
	@GeneratedValue
	@Column(name = "items_id")
	private int items_id;

	@ManyToOne
	@JoinColumn(name = "book_sales_id")
	private BookSales bookSales;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "book_isbn")
	private Book book;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "order_date")
	private LocalDateTime orderDate;

	public int getItems_id() {
		return items_id;
	}

	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}

	public BookSales getBookSales() {
		return bookSales;
	}

	public void setBookSales(BookSales bookSales) {
		this.bookSales = bookSales;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
}