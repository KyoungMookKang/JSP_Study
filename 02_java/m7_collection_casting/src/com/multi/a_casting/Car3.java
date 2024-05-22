package com.multi.a_casting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Car3 {
    static JFrame f = new JFrame();
    static HashMap<String, String> map;

    public static void main(String[] args) {

        f = new JFrame();
        f.setSize(400, 800);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton red = new JButton("---차1---");
        JButton yellow = new JButton("---차2---");
        JButton blue = new JButton("---차3---");

        f.add(red);
        f.add(yellow);
        f.add(blue);

        map = new HashMap<>();
        map.put("---차1---", "img/gv80.png");
        map.put("---차2---", "img/g80.png");
        map.put("---차3---", "img/g70.png");

        System.out.println(map);

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = e.getActionCommand();
                Car3.show(name);
            }
        });

        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = e.getActionCommand();
                Car3.show(name);
            }
        });

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = e.getActionCommand();
                Car3.show(name);
            }
        });


        f.setVisible(true);
    }

    private static void show(String name) {
        System.out.println(name);

        String img = map.get(name);
//        String img = "";
//        if(name.equals("---차1---")){
//            img = "img/gv80.png";
//        }else if(name.equals("---차2---")){
//            img = "img/g80.png";
//        }else {
//            img = "img/g70.png";
//        }
        ImageIcon icon = new ImageIcon(name);
        JLabel label = new JLabel();
        label.setIcon(icon);
        f.add(label);
        f.setVisible(true);
    }
}
