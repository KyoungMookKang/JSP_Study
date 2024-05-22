package com.multi.Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam {
    static JFrame j = new JFrame();

    public static void main(String[] args) {

        j.getContentPane().setBackground(Color.GRAY);
        j.setSize(800, 1500);
        j.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton b1 = new JButton("짐이 많이 실렸으면 좋겠어요");
        b1.setFont(new Font("돋움", Font.ITALIC, 20));
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.white);

        JButton b2 = new JButton("운전이 재밌으면 좋겠어요");
        b2.setFont(new Font("돋움", Font.ITALIC, 20));
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.white);

        JButton b3 = new JButton("전기차량이 좋아요");
        b3.setFont(new Font("돋움", Font.ITALIC, 20));
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);


        j.add(b1);
        j.add(b2);
        j.add(b3);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exam.show("img/gv80.png");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exam.show("img/g70.png");
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exam.show("img/gv60.png");
            }
        });

        j.setVisible(true);
    }

    private static void show(String name) {
        ImageIcon icon = new ImageIcon(name);
        JLabel label = new JLabel();
        label.setIcon(icon);
        j.add(label);
        j.setVisible(true);
    }
}
