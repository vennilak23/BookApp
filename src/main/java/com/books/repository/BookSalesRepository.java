package com.books.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.model.BookSales;


public interface BookSalesRepository extends JpaRepository<BookSales, Integer>{

	public List<BookSales> findByOrderByIdDesc(int id);

}
