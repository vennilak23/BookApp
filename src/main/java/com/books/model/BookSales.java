package com.books.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "book_sales")

public class BookSales {
	@Id
	@GeneratedValue
	@Column(name = "sales_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "id")
	private User user;

	@Column(name = "total_amount")
	private double totalAmount;
	
	@Column(name = "order_date")
	private LocalDateTime orderDate;

	@Column(name = "status")
	private String status;
	
	@OneToMany(mappedBy = "bookSales", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<BookSalesItems> bookSalesItems = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<BookSalesItems> getBookSalesItems() {
		return bookSalesItems;
	}

	public void setBookSalesItems(List<BookSalesItems> bookSalesItems) {
		this.bookSalesItems = bookSalesItems;
	}
}
