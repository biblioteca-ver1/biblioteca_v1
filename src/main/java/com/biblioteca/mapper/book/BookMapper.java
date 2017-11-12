package com.biblioteca.mapper.book;

import com.biblioteca.model.book.BookModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    public List<BookModel> getBookList() throws Exception;

}
