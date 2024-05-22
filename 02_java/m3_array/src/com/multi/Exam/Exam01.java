package com.multi.Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam01 {

    static int now = 0;

    public static void main(String[] args) {
        String[] titles = {"GV80", "GV70", "GV60", "G90", "G80"};
        String[] images = {"gv80.png", "gv70.png", "gv60.png", "g90.png", "g80.png"};
        String[] feature = {"7인승 suv", "5인승 suv", "전기 suv", "플래그쉽 세단", "준대형 세단"};

        int[] capacity = {7, 5, 5, 4, 5};

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("제네시스 차량 라인업");
        f.setSize(1500, 1200);
        f.getContentPane().setLayout(null);


        JLabel img = new JLabel();
        img.setIcon(new ImageIcon("img/" + images[now]));
        img.setBounds(300, 300, 750, 400); // 위치 및 크기 설정
        f.getContentPane().add(img);

        JLabel lblNewLabel_2 = new JLabel("차량 명");
        lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
        lblNewLabel_2.setBounds(200, 900, 600, 100);
        f.getContentPane().add(lblNewLabel_2);

        JLabel titles1 = new JLabel(titles[now]);
        titles1.setForeground(Color.RED);
        titles1.setFont(new Font("굴림", Font.BOLD, 25));
        titles1.setBounds(310, 900, 600, 500);
        f.getContentPane().add(titles1);


        // 평점 표시 레이블 생성 및 설정
        JLabel lblNewLabel_2_1 = new JLabel("차량 특징");
        lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 20));
        lblNewLabel_2_1.setBounds(400, 900, 600, 100);
        f.getContentPane().add(lblNewLabel_2_1);

        JLabel feature1 = new JLabel(feature[now] + "");
        feature1.setForeground(Color.RED);
        feature1.setFont(new Font("굴림", Font.BOLD, 25));
        feature1.setBounds(510, 900, 500, 100);
        f.getContentPane().add(feature1);



        JButton title = new JButton(titles[now]);
        title.setForeground(Color.WHITE);
        title.setBackground(Color.BLUE);
        title.setFont(new Font("굴림", Font.BOLD, 45));
        title.setBounds(94, 10, 400, 77);
        f.getContentPane().add(title);



        JButton btn1 = new JButton("<");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(now == 4){ // 인덱스가 4일때 첫 인덱스로 돌아가게
                    now = -1; // 밑에서 ++로 받기에 -1
                }
                now++;

                title.setText(titles[now]);
                ImageIcon icon = new ImageIcon("img/"+images[now]);
                img.setIcon(icon);

                titles1.setText(titles[now]);
                feature1.setText(feature[now] + "");

            }
        });

        btn1.setBackground(Color.WHITE);
        btn1.setFont(new Font("굴림", Font.BOLD, 40));
        btn1.setBounds(0, 390, 84, 438);
        f.getContentPane().add(btn1);



        JButton btn2 = new JButton(">");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(now == 0){ // 인덱스가 첫장으로 갔을때, 마지막 인덱스가 보이게끔 설정
                    now = 5;
                }
                now--;

                title.setText(titles[now]);
                ImageIcon icon = new ImageIcon("img/"+images[now]);
                img.setIcon(icon);

                titles1.setText(titles[now]);
                feature1.setText(feature[now] + "");

            }
        });


        btn2.setBackground(Color.WHITE);
        btn2.setFont(new Font("굴림", Font.BOLD, 40));
        btn2.setBounds(1200, 390, 84, 438);
        f.getContentPane().add(btn2);


        f.setVisible(true);


    }
}
