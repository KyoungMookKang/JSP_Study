package com.multi.a_calssmake;

public class Dog {

    // 색, 종류

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private String type;

    // 동작(기능)
    public void wagTail() {
        System.out.println("강아지 꼬리 흔드는 중");
    }

    public void bark() {
        System.out.println("강아지 짖는 중");
    }

    @Override
    public String toString() {
        return "color : " + color + " type : " + type;
    }
}
