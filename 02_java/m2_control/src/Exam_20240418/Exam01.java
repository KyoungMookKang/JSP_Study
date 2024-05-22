package Exam_20240418;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam01 {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(450,600);
        FlowLayout flow = new FlowLayout();
        f.getContentPane().setLayout(flow);

        JButton btn = new JButton("1번");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "당첨입니다.");
            }
        });
        f.getContentPane().add(btn);

        for(int i = 2; i < 51; i++) {
            JButton btn1 = new JButton(i+"번");
            f.getContentPane().add(btn1);
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(f, "꽝입니다.");
                }
            });
        }
        f.setVisible(true);
    }
}
