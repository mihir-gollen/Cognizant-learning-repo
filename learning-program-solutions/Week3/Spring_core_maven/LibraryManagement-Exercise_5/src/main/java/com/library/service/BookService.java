package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    //Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor injection used");
    }

    //Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter injection called");
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("Listing books:");
        bookRepository.fetchBooks();
    }
}
