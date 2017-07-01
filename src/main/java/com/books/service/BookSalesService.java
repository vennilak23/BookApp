package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.model.BookSales;
import com.books.repository.BookSalesRepository;



@Service
public class BookSalesService {
	
	@Autowired
	private BookSalesRepository bookSalesRepository;
	
	public void save(BookSales bookSales) {
		bookSalesRepository.save(bookSales);
	}
	
	public List<BookSales> findAll(){
		return bookSalesRepository.findAll();
	}
	
	public BookSales findOne(int salesId){
		return bookSalesRepository.findOne(salesId);
	}
	
	public List<BookSales> findAllOrders(int userId){
		return bookSalesRepository.findByOrderByIdDesc(userId);
	}
}