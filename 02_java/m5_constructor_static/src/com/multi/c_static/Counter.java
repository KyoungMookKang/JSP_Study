package com.multi.c_static;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {

    private static int count;

//    public static int count; < 수업중 나온 결과(1)

    public static void main(String[] args) {

        JFrame f = new JFrame("카운터이다"); // 프레임의 제목
        f.setSize(400, 300); // 창의 크기 설정
        f.setLayout(new FlowLayout()); // 레이아웃 타입 = flow

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 활성화
        JLabel number = new JLabel("0");
        number.setForeground(Color.red);

        JButton plus = new JButton("1더하기");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                number.setText(count + "");
            }
        });

        JButton reset = new JButton("0으로 초기화");
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                number.setText("0");
            }
        });

        JButton minus = new JButton("1빼기");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                number.setText(count + "");
            }
        });

        Font font = new Font("궁서", Font.BOLD, 15);
        plus.setFont(font);
        reset.setFont(font);
        minus.setFont(font);

        number.setFont(new Font("궁서", Font.BOLD, 150));

        f.add(plus);
        f.add(reset);
        f.add(minus);
        f.add(number);

        f.setVisible(true); // 실행시 보이게끔
    }
}
