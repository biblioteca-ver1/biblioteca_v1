package com.biblioteca.service.book;

import com.biblioteca.model.book.BookModel;

import java.util.List;

public interface BookService {

    public List<BookModel> getBookList() throws Exception;
}
