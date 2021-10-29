package com.wei.cosmosweiblog.pojo;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer id;
    private String title;
    private String author;
    private String press;
    private String ISBN;
    private String path;

    public Book() {
    }

    public Book(Integer id, String title, String author, String press, String ISBN, String path) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.press = press;
        this.ISBN = ISBN;
        this.path = path;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
