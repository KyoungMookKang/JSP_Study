package com.multi.Exam;

import javax.swing.*;
import java.awt.*;

public class WriteProcessor {
    static JTextArea textArea;
    public static void main(String[] args) {


        JFrame f = new JFrame("글자 길이를 판독 해드립니다.");
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.getContentPane().setLayout(null);
        f.setLocation(200,400);

        JLabel lb = new JLabel("Characters : ");
        lb.setForeground(Color.white);
        lb.setFont(new Font("굴림", Font.ITALIC,20));
        lb.setBounds(90,150,165,65);
        f.getContentPane().add(lb);

        JLabel lb1 = new JLabel("Words : ");
        lb1.setForeground(Color.white);
        lb1.setFont(new Font("굴림", Font.ITALIC,20));
        lb1.setBounds(90,200,165,65);
        f.getContentPane().add(lb1);

        


        textArea = new JTextArea();
        textArea.setForeground(Color.white);
        textArea.setFont(new Font("굴림", Font.BOLD, 20));
        textArea.setBounds(90,300,500,500);


        f.setVisible(true);
    }
    
}
