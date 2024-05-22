package com.multi.a_inheritance.Exam;

public class G70 extends Sedan {

    private String size;

    public G70(int price, String name, String comfortable, String size) {
        super(price, name, comfortable);
        this.size = size;
    }

    public void fastest() {
        System.out.println("제네시스 차량 중 가장 빠릅니다!");
        super.toString();
    }


    @Override
    public String toString() {
        return "G70{" + "size='" + size + ", price =" + getPrice() + ", name =" + getName(); }
}

