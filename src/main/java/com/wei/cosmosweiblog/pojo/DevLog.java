package com.wei.cosmosweiblog.pojo;

public class DevLog {
    private Integer id;
    private String title;
    private String content;
    private String updateTime;

    public DevLog() {
    }

    public DevLog(Integer id, String title, String content, String updateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.updateTime = updateTime;
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
        return "Devlog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
