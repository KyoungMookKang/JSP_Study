package com.multi.b_conditional;

import javax.swing.*;

public class Exec03 {
    public static void main(String[] args) {

        // dialog 로 5번 띄워서 "ok)긍정, no)부정, etc)기타"

        // ok 가 몇 회, no 가 몇 회, etc 몇 회
        int ok = 0;
        int no = 0;
        int etc = 0; // for 문 안에 만들면 0으로 초기화되기때문에 밖에 값을 정해둬야함

        for (int i = 0; i < 5; i++) {
            String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타");
            if (data.equals("ok")) {
                System.out.println("긍정");
                ok++;
            } else if (data.equals("no")) {
                System.out.println("부정");
                no++;
            } else {
                System.out.println("몰루");
                etc++;
            }
        }

        System.out.println("긍정횟수: " + ok + "회");
        System.out.println("부정횟수: " + no + "회");
        System.out.println("몰루횟수: " + etc + "회");
    }
}
