package com.wei.cosmosweiblog.service;

import com.wei.cosmosweiblog.pojo.Book;

import java.util.List;

public interface BookService {
    Book queryById(Integer id);

    List<Book> queryAllBook();

    List<Book> searchBookByTitle(String title);
}
