package com.multi.a_inheritance.Exam;

public class Sedan extends Car{

    private String comfortable;

    public Sedan(int price, String name, String comfortable) {
        super(price, name);
        this.comfortable = comfortable;
    }

    public void lowHeight() {

        super.buy();
        System.out.println("SUV 보다 천장높이가 낮습니다!");
    }

    public String getComfortable() {
        return comfortable;
    }

    public void setComfortable(String comfortable) {
        this.comfortable = comfortable;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "comfortable='" + comfortable + '\'' +
                '}';
    }
}
