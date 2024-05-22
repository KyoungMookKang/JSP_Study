package Exam_20240418;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam03 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(1800,900);
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        Font font1 = new Font("굴림",Font.ITALIC,20);
        Font font2 = new Font("궁서",Font.BOLD,25);

        JLabel l1 = new JLabel();
        l1.setText("인기투표를 시작합니다.");
        l1.setFont(font2);

        JLabel l2 = new JLabel();
        l2.setText("GV80");
        l2.setFont(font1);

        JLabel l3 = new JLabel();
        l3.setText("G80");
        l3.setFont(font1);

        JLabel l4 = new JLabel();
        l4.setText("G70");
        l4.setFont(font1);

        JLabel l5 = new JLabel(); // GV80
        JLabel l6 = new JLabel(); // G80
        JLabel l7 = new JLabel(); // G70

        l5.setFont(font2);
        l5.setForeground(Color.BLACK);

        l6.setFont(font2);
        l6.setForeground(Color.BLACK);

        l7.setFont(font2);
        l7.setForeground(Color.BLACK);

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();

        ImageIcon icon1 = new ImageIcon("img/gv80.png");
        Image image = icon1.getImage();
        Image newimg = image.getScaledInstance(550,450, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(newimg);
        b1.setIcon(icon1);


        ImageIcon icon2 = new ImageIcon("img/g80.png");
        Image image1 = icon2.getImage();
        Image newimg1 = image.getScaledInstance(550,450, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newimg1);
        b2.setIcon(icon2);


        ImageIcon icon3 = new ImageIcon("img/g70.png");
        Image image2 = icon3.getImage();
        Image newimg2 = image.getScaledInstance(550,450, Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(newimg2);
        b3.setIcon(icon3);

        f.add(l1);
        f.add(b1);
        f.add(l2);
        f.add(l5);

        f.add(b2);
        f.add(l3);
        f.add(l6);

        f.add(b3);
        f.add(l4);
        f.add(l7);

        b1.addActionListener(new ActionListener() {
            int gv80 = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                gv80++;
                l5.setText(gv80 + "표");
            }
        });

        b2.addActionListener(new ActionListener() {
            int g80 = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                g80++;
                l6.setText(g80 + "표");
            }
        });

        b1.addActionListener(new ActionListener() {
            int g70 = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                g70++;
                l7.setText(g70 + "표");
            }
        });


        f.setVisible(true);

    }
}
