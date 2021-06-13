package com.example.libraryapp.springbootcache.api;

import com.example.libraryapp.springbootcache.dto.Book;

public interface BookService  {
    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id);

    String deleteBook(long id);
}