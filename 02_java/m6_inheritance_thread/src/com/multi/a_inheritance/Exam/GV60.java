package com.multi.a_inheritance.Exam;

public class GV60 extends SUV {

    private String size;

    public GV60(int price, String name, String carryMore, String size) {
        super(price, name, carryMore);
        this.size = size;
    }

    public void charge() {
        System.out.println("GV60은 전기차량이라 전기를 충전해야 합니다!");
        super.toString();
    }

    @Override
    public String toString() {
        return "GV60{ " + " size = '" + size + ", price =" + getPrice() + ", name =" + getName();
    }
}

