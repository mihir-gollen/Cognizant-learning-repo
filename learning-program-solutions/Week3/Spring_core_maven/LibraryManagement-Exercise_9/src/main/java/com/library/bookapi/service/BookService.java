package com.library.bookapi.service;

import com.library.bookapi.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {
    private final Map<Integer, Book> bookStore = new HashMap<>();

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookStore.values());
    }

    public void addBook(Book book) {
        bookStore.put(book.getId(), book);
    }
}
