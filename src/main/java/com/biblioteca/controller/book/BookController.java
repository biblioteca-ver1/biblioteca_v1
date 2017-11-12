package com.biblioteca.controller.book;

import com.biblioteca.model.book.BookModel;
import com.biblioteca.service.book.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BookController {
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Resource(name = "bookService")
    private BookService bookService;


    @RequestMapping(value = "/bookList", method = RequestMethod.GET)
    public ModelAndView getBookList() throws Exception {
        ModelAndView mv = new ModelAndView("bookList");
        List<BookModel> list = bookService.getBookList();

        mv.addObject("list",list);
        mv.setViewName("/bookList");

        logger.debug("========= bookList =========");
        return mv;
    }
}
