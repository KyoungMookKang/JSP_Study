package com.multi.basic.Exam;

import javax.swing.*;

public class Exam04 {
    public static void main(String[] args) {

        String name = "홍길동";
        int Age = 200;
        double weight = 88.8;
        String live = "홍천";
        boolean programer = Boolean.parseBoolean(JOptionPane.showInputDialog("프로그래머 여부 "));
        String color = JOptionPane.showInputDialog("좋아하는 색");

        System.out.println("친구의 이름은 " + name + "이고 나이는 " + Age + "세이다.");
        System.out.println(live + "에 살고 " + "몸무게는 " + weight + "다.");
        System.out.println("좋아하는 색은 " + color + "가 들어가는 색이고, 프로그래머 여부는 " + programer + "이다.");

    }
}
