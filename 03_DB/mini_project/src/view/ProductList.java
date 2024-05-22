package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductList {
    public void p06() {
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("첫화면");
        f.getContentPane().setBackground(Color.CYAN);

        // FlowLayout ?
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        //페이지제목
        JLabel l1 = new JLabel("p06 : 상품조회");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        l1.setFont(font);
        f.add(l1);

        /////////////////////////////////////////////////////////
        JButton b0 = new JButton("<-뒤로가기");
        JButton b1 = new JButton("필터 적용: p07()로 이동");
        // 검색버튼 구현
        //combobox
        String[] g1 = {"차종", "차종분류", "취향"};
        JComboBox combo1 = new JComboBox(g1);
        JTextField t1 = new JTextField(20); // 10은 글자수
        JButton b11 = new JButton("검색");

        //
        JButton b2 = new JButton("필터 등록: p06_1()로 이동");
        JButton b3 = new JButton("필터 수정/삭제: p06_2()로 이동");

        JButton b4 = new JButton("차량X 상세: p07_2()로 이동");

        f.add(b0);
        f.add(b1);
        f.add(combo1);
        f.add(t1);
        f.add(b11);

        f.add(b2);
        f.add(b3);
        f.add(b4);

//        b0.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                p03();
//            }
//        }); //b0.addActionListener

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilterSelect filterSelect = new FilterSelect();
                filterSelect.p07();
            }
        }); //b1.addActionListener

        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //미구현
            }
        }); //b11.addActionListener

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilterAdd filterAdd = new FilterAdd();
                filterAdd.p06_1();
            }
        }); //b2.addActionListener
//
//        b3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                p06_2();
//            }
//        }); //b3.addActionListener
//
//        b4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                p07_2();
//            }
//        }); //b3.addActionListener

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
