package com.LibManagement;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    public void bookService() {
        System.out.println("From BookService");
        bookRepository.bookRepo();
    }
}
