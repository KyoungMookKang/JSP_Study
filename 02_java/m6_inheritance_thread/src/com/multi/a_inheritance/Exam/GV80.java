package com.multi.a_inheritance.Exam;

public class GV80 extends SUV {

    private String size;

    public GV80(int price, String name, String carryMore, String size) {
        super(price, name, carryMore);
        this.size = size;
    }

    public void widest() {

        super.toString();
        System.out.println("제네시스 차량 중 가장 내부가 넓습니다!");
    }

    @Override
    public String toString() {
        return "GV80{ " + " size = '" + size + ", price =" + getPrice() + ", name =" + getName();
    }
}
