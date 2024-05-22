package com.multi.basic.Exam.day2;

import javax.swing.*;

public class Exam02 {
    public static void main(String[] args) {

        int age = 100;
        int nextAge = age+1;

        JOptionPane.showMessageDialog(null,"내년의 나이 : " + nextAge +"세 입니다.");

        if(nextAge > 100) {
            JOptionPane.showMessageDialog(null,"이제부터 시작");
        } else {
            JOptionPane.showMessageDialog(null,"아직 젊어요");
        }
    }
}
