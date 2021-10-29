package com.wei.cosmosweiblog.pojo;

public class Debate {
    private int id;
    private String title;
    private String author;
    private String content;
    private String updateTime;

    public Debate() {
    }

    public Debate(int id, String title, String author, String content, String updateTime) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Debate{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
