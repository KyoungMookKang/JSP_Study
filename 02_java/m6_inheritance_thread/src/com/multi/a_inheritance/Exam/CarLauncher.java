package com.multi.a_inheritance.Exam;

public class CarLauncher {
    public static void main(String[] args) {

        GV60 no1 = new GV60(6000, "GV60", "많이 실림", "소형SUV");

        no1.charge();
        no1.getCarryMore();

        System.out.println(no1);

    }
}
