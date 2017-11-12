package com.biblioteca.model.book;

import lombok.Data;

import java.sql.Date;

@Data
public class BookModel {
    private String title;
    private String isbn;
    private String writer;
    private String pag;
    private Integer price;
    private Date publish_date;
}
