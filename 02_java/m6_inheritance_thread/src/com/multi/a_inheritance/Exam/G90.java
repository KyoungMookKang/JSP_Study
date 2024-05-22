package com.multi.a_inheritance.Exam;

public class G90 extends Sedan {

    private String size;

    public G90(int price, String name, String comfortable, String size){
        super(price, name, comfortable);
        this.size = size;
    }

    public void longest(){ System.out.println("제네시스 차량 중 가장 깁니다!");
        super.toString();
    }

    @Override
    public String toString() {
        return "G90{" + "size='" + size + ", price =" + getPrice() + ", name =" + getName(); }
    }

