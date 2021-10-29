package com.wei.cosmosweiblog.service.impl;

import com.wei.cosmosweiblog.mapper.BookDao;
import com.wei.cosmosweiblog.pojo.Book;
import com.wei.cosmosweiblog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Book queryById(Integer id) {
        return bookDao.queryById(id);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookDao.queryAllBook();
    }

    @Override
    public List<Book> searchBookByTitle(String title) {
        return bookDao.searchBookByTitle(title);
    }
}
