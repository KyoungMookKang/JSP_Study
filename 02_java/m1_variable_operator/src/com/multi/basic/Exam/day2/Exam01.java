package com.multi.basic.Exam.day2;

import javax.swing.*;

public class Exam01 {
    public static void main(String[] args) {

        int count = 5;
        int price = 5000;
        int total = count * price;

       JOptionPane.showInputDialog("몇잔",total);

        if(total > 20000){
            System.out.println("할인 불가능");
        } else {
            System.out.println("할인 가능");
        }
    }
}
