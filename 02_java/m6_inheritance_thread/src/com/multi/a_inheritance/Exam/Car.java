package com.multi.a_inheritance.Exam;

public class Car {

    private int price;
    private String name;

    public Car(int price, String name){
        this.price = price;
        this.name = name;
    }

    public void buy() { System.out.println("차량을 구매하세요!"); }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "price=" + price + ", name='" + name + '\'' + '}';
    }

}
