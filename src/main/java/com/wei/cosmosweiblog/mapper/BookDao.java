package com.wei.cosmosweiblog.mapper;

import com.wei.cosmosweiblog.pojo.Blog;
import com.wei.cosmosweiblog.pojo.BlogUser;
import com.wei.cosmosweiblog.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("select * from blog_book")
    List<Book> queryAllBook();

    Book queryById(Integer id);

    @Select("select count(*) from blog_book")
    int queryBookCount();

    List<Book> searchBookByTitle(String title);

}
