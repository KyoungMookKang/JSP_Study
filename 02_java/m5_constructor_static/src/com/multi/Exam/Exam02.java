package com.multi.Exam;

public class Exam02 {
    public static void main(String[] args) {

        Exam02_1 d1 = new Exam02_1("카리나", "여");
        Exam02_1 d2 = new Exam02_1("신세경", "여");

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(Exam02_1.count + "명");
        System.out.println(Exam02_1.wallet + "원");

    }
}
