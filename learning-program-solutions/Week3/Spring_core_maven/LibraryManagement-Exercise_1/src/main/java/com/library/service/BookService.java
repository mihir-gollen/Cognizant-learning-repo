package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository repo) {
        this.bookRepository = repo;
    }

    public void listBooks() {
        System.out.println("Listing books using repository...");
        bookRepository.fetchBooks();
    }
}
