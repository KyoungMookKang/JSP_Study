package com.multi.c_loop;

import javax.swing.*;

public class Exec02 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("계속 돈다");
            String choice = JOptionPane.showInputDialog("계속 하시겠습니까 y) yes n) no");

            if (choice.equals("n") || choice.equals("no")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                // return;
                // break;
            }
        }

       // System.out.println("잡히지않는다.");
    }

}
