package com.LibManagement.service;

import com.LibManagement.repository.BookRepository;

public class BookService {
  private BookRepository bookRepository;
   public void setBookRepository(BookRepository bookRepository){
     this.bookRepository=bookRepository;
   }
   public void addBook(String bookname){
    bookRepository.saveBook(bookname);
   }

}
