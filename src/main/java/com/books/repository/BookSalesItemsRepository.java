package com.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.model.BookSalesItems;



public interface BookSalesItemsRepository extends JpaRepository<BookSalesItems, Integer>{

}
