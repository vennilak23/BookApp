package com.books.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "book_ratings")

public class BookRatings {
	
	@Id
	@GeneratedValue
	@Column(name = "ratings_id")
	private int ratingsId;

	@Column(name = "rating")
	private double rating;

	@ManyToOne
	@JoinColumn(name = "isbn")
	private Book book;

	@ManyToOne
	@JoinColumn(name = "id")
	private User user;

	public int getRatingsId() {
		return ratingsId;
	}

	public void setRatingsId(int ratingsId) {
		this.ratingsId = ratingsId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

