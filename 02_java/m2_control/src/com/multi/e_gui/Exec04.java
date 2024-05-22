package com.multi.e_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Exec04 {
    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.ORANGE);
        f.setSize(500,500);
        f.getContentPane().setLayout(null);

        JLabel nameLable1 = new JLabel("1번째 숫자");
        nameLable1.setFont(new Font("굴림",Font.BOLD,20)); // 글씨체 , 스타일(기울임, 두껍게 등), 크기
        nameLable1.setBounds(25,40,105,43); // 크기설정
        f.getContentPane().add(nameLable1);

        JTextField textfield1 = new JTextField();
        textfield1. setFont(new Font("굴림", Font.ITALIC, 20));
        textfield1.setBounds(137, 40, 284, 37);
        f.getContentPane().add(textfield1);

        JLabel nameLable2 = new JLabel("2번째 숫자");
        nameLable2.setFont(new Font("굴림",Font.BOLD,20)); // 글씨체 , 스타일(기울임, 두껍게 등), 크기
        nameLable2.setBounds(25,105,105,43); // 크기설정
        f.getContentPane().add(nameLable2);

        JTextField textfield2 = new JTextField();
        textfield2. setFont(new Font("굴림", Font.ITALIC, 20));
        textfield2.setBounds(137, 105, 284, 37);
        f.getContentPane().add(textfield2);

        JLabel imgLabel = new JLabel();
        imgLabel.setIcon(new ImageIcon("img/Image20240418150810.gif"));
        imgLabel.setBounds(38, 241, 422, 321);
        f.getContentPane().add(imgLabel);

        JButton plus = new JButton("+");

        plus.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");

                int num1 = Integer.parseInt(textfield1.getText());
                int num2 = Integer.parseInt(textfield2.getText());

                f.setTitle("더한 결과는 : " + (num1 + num2));

                textfield1.setText("");
                textfield2.setText("");

            }
        });
        plus.setForeground(Color.WHITE); // 버튼의 배경색
        plus.setBackground(Color.GREEN); // 글자의 색깔 설정
        plus.setFont(new Font("굴림", Font.BOLD, 30));
        plus.setBounds(23, 175, 107, 56); // 상하 위치, 좌우 위치, 가로, 세로
        f.getContentPane().add(plus);

        JButton minus = new JButton("-");

        minus.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");

                int num1 = Integer.parseInt(textfield1.getText());
                int num2 = Integer.parseInt(textfield2.getText());

                f.setTitle("뺄셈 결과는 : " + (num1 - num2));

                textfield1.setText("");
                textfield2.setText("");

            }
        });
        minus.setForeground(Color.WHITE);
        minus.setBackground(Color.BLUE);
        minus.setFont(new Font("굴림", Font.BOLD, 30));
        minus.setBounds(142, 175, 107, 56);
        f.getContentPane().add(minus);

        
        JButton multi = new JButton("*");

        multi.addActionListener(new AbstractAction() { // 버튼에 기능을 추가해줌 / addActionListner
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(f, "곱셈버튼을 누르셨군요.");

                int num1 = Integer.parseInt(textfield1.getText()); // 숫자값을 텍스트로 전환
                int num2 = Integer.parseInt(textfield2.getText());

                f.setTitle("곱셈 결과는 : " + (num1 * num2)); // 결과창 대신 제목란에 결과를 출력

                textfield1.setText(""); // 입력한 텍스트를 초기화해주기 위해 추가해준다.
                textfield2.setText("");

            }
        });
        multi.setForeground(Color.WHITE);
        multi.setBackground(Color.BLACK);
        multi.setFont(new Font("굴림", Font.BOLD, 30));
        multi.setBounds(266, 175, 107, 56);
        f.getContentPane().add(multi);

        
        JButton div = new JButton("/");

        div.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(f, "나눗셈 버튼을 누르셨군요.");

                int num1 = Integer.parseInt(textfield1.getText());
                int num2 = Integer.parseInt(textfield2.getText());

                f.setTitle("나눈 결과는 : " + (num1 / num2));

                textfield1.setText("");
                textfield2.setText("");

            }
        });
        div.setForeground(Color.WHITE);
        div.setBackground(Color.CYAN);
        div.setFont(new Font("굴림", Font.BOLD, 30));
        div.setBounds(385, 175, 107, 56);
        f.getContentPane().add(div);



        f.setVisible(true); // 설정한 대상을 보이게하는 명령어

    }
}
