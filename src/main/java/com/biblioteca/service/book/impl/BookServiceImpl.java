package com.biblioteca.service.book.impl;

import com.biblioteca.mapper.book.BookMapper;
import com.biblioteca.model.book.BookModel;
import com.biblioteca.service.book.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService{
    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Resource(name = "bookMapper")
//    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookModel> getBookList() throws Exception {
        return bookMapper.getBookList();
    }
}
