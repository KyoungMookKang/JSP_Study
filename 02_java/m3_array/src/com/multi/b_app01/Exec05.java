package com.multi.b_app01;

import javax.swing.*;

public class Exec05 {
    public static void main(String[] args) {

        String[] name = {"카리나", "신세경", "유라", "소진", "조보아"};
        ;
        int[] count = {0, 0, 0, 0, 0};

        for (int i = 0; i < 10; i++) {
            String choice = JOptionPane.showInputDialog("투표 할 사람의 번호를 골라주세요. 0)카리나, 1)신세경, 2)유라, 3)소진, 4)조보아");

            int choice2 = Integer.parseInt(choice);
            if (choice2 < 0 || choice2 > 4) {
                i--;
            } else {
                count[choice2]++;

                System.out.println("i 값 : " + i);
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "번은 " + count[i] + "표");
        }

        int max = count[0];

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                System.out.println(i + ": " + name[i]);
            }
        }
    }
}
