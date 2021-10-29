package com.wei.cosmosweiblog.pojo;

public class Project {
    private Integer id;
    private String name;
    private String author;
    private String usedTech;
    private String updateTime;

    public Project() {
    }

    public Project(Integer id, String name, String author, String usedTech, String updateTime) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.usedTech = usedTech;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUsedTech() {
        return usedTech;
    }

    public void setUsedTech(String usedTech) {
        this.usedTech = usedTech;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", usedTech='" + usedTech + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
