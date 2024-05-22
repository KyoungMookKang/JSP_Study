package com.multi.b_operator;

import javax.swing.*;

public class Exec02 { //psvm + Ent / main <- main 자동생성
    public static void main(String[] args) {
        // 입력 2개 받아서 dialog
        // + - * /
        int n1 = 500;
        int n2 = 25;
        int n3 = n1 / n2;
        int n7 = n3 * n1 + n2;
        System.out.println(n7);
        JOptionPane.showMessageDialog(null,"결과는 " + n7 + "입니다.");

        int n4 = 300;
        int n5 = 400;
        int n6 = n4 * n5;
        int n8 = n6 / (20);
        System.out.println(n8);
        JOptionPane.showMessageDialog(null,"결과는 " + n8 + "입니다.");


        String n9 = JOptionPane.showInputDialog("첫 숫자");
        String n0 = JOptionPane.showInputDialog("두번째 숫자");

        int nn1 = Integer.parseInt(n9);
        int nn2 = Integer.parseInt(n0);

        System.out.println(nn1 + nn2);
        System.out.println(nn1 - nn2);
        System.out.println(nn1 * nn2);
        System.out.println(nn1 / nn2);

        // n2에 담기는 수 포함
        // for 문 작성
        //1. 데이터: 입력
        String p1 = JOptionPane.showInputDialog("시작값");//5
        String p2 = JOptionPane.showInputDialog("종료값");//50



        String p3 = JOptionPane.showInputDialog("반복할 숫자");
        String p4 = JOptionPane.showInputDialog("반복할 문자");


    }
}
////1. 데이터: 입력
//String p1 = JOptionPane.showInputDialog("시작값");
//String p2 = JOptionPane.showInputDialog("종료값");
//
//int p1In = Integer.parseInt(num1);
//int p2In = Integer.parseInt(num2);
//
//for ( ; p1In <= p2In; p1In++) {
//        System.out.println(p1In);
//}
//
////1. 데이터: 입력
//String n3 = JOptionPane.showInputDialog("반복할 숫자");
//String n4 = JOptionPane.showInputDialog("반복할 문자");
//
//int p3In = Integer.parseInt(n3);
//
//for (int i = 0 ; i < p3In ; i++) {
//        System.out.println(n4);
//}