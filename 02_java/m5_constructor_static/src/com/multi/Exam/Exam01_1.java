package com.multi.Exam;

public class Exam01_1 {

    private String subject;
    private String time;
    private String name;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exam01_1{" +
                "subject='" + subject + '\'' +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Exam01_1(String subject, String time, String name) {
        this.subject = subject;
        this.time = time;
        this.name = name;
    }
}
