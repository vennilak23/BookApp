package com.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.model.BookSalesItems;
import com.books.repository.BookSalesItemsRepository;


@Service
public class BookSalesItemsService {
	@Autowired
	private BookSalesItemsRepository bookSalesItemsRepository;

	public void save(BookSalesItems bookSalesItems) {
		bookSalesItemsRepository.save(bookSalesItems);
	}
}
