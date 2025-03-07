package com.multi.a_constructor;

public class Exam {

    private String color;
    private int price;
    private int count;

    public Exam(String color, int price, int count){
        this.color = color;
        this.price = price;
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
