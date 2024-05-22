package com.multi.e_gui;

import javax.swing.*;
import java.awt.*;

/*
 * 1. GUI(Graphical User Interface)란?
 * 	 - GUI는 GUI 기반 환경에서 구동시켜야 될 때만 만들고 웹에서는 html을 쓴다.
 *   - 키보드나 마우스로 들어오는 신호가 event로 동작되게 하고
 *     event를 핸들링해서 기능 구현을 함
 *   - 컨테이너 위에 컴포넌트들을 추가해서 사용함
 *
 * 2. GUI객체
 *   - AWT : OS의 컴포넌트를 그대로 사용(Java로 구현한게 X)(초기버전)
 *   - Swing : AWT보다 더 많은 종류의 컴포넌트를 제공하고 Java로 구현
 *   			(앞에 J를 붙여 AWT와 구분)
 *
 * 3. 컨테이너 객체 생성하기
 *   (1). JFrame 상속을 이용한 방법
 *   (2). 상속 받지 않고 JFrame 객체 생성하는 방법
 *
 */
public class Exec03 {


    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.ORANGE);
        f.setSize(500,500);
        f.getContentPane().setLayout(null);

        JLabel nameLable = new JLabel("이름");
        nameLable.setFont(new Font("굴림",Font.BOLD,20)); // 글씨체 , 스타일(기울임, 두껍게 등), 크기
        nameLable.setBounds(25,40,105,43); // 크기설정
        f.getContentPane().add(nameLable);

        JTextField textfield1 = new JTextField();
        textfield1. setFont(new Font("굴림", Font.ITALIC, 20));
        textfield1.setBounds(137, 40, 284, 37);
        f.getContentPane().add(textfield1);

        JLabel nameLable1 = new JLabel("전화번호");
        nameLable1.setFont(new Font("굴림",Font.BOLD,20)); // 글씨체 , 스타일(기울임, 두껍게 등), 크기
        nameLable1.setBounds(137,40,284,37); // 크기설정
        f.getContentPane().add(nameLable1);

        JTextField textfield2 = new JTextField();
        textfield2. setFont(new Font("굴림", Font.ITALIC, 20));
        textfield2.setBounds(137, 115, 284, 37);
        f.getContentPane().add(textfield2);

        JLabel nameLable2 = new JLabel("전화번호");
        nameLable2.setFont(new Font("굴림",Font.BOLD,20)); // 글씨체 , 스타일(기울임, 두껍게 등), 크기
        nameLable2.setBounds(25,200,105,43); // 크기설정
        f.getContentPane().add(nameLable2);

        JTextField textfield3 = new JTextField();
        textfield3. setFont(new Font("굴림", Font.ITALIC, 20));
        textfield3.setBounds(137, 200, 284, 37);
        f.getContentPane().add(textfield3);


        JButton btnNewButton = new JButton("확인");
        btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
        btnNewButton.setBounds(68, 305, 125, 43);
        f.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("취소");
        btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
        btnNewButton_1.setBounds(237, 305, 125, 43);
        f.getContentPane().add(btnNewButton_1);




        f.setVisible(true); // 설정한 대상을 보이게하는 명령어
    }
}
