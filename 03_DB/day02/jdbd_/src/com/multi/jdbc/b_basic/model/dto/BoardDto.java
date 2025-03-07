package com.multi.jdbc.b_basic.model.dto;

public class BoardDto {
    private int no;
    private String title;
    private String content;
    private int Writer;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public int getWriter() {
        return Writer;
    }

    public void setWriter(int writer) {
        Writer = writer;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", Writer=" + Writer +
                '}';
    }
}
