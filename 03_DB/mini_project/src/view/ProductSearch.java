package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductSearch {
    public void p07_1() {
        //JFrame 정의
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("첫화면");
        f.getContentPane().setBackground(Color.CYAN);

        // FlowLayout ?
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        //페이지제목
        JLabel l1 = new JLabel("p07_1 : 필터 활성화시 상품조회");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        l1.setFont(font);
        f.add(l1);
        /////////////////////////////////////////////////////////
        JButton b0 = new JButton("<-뒤로가기");
        JButton b1 = new JButton("필터 적용해제: p06()로 이동");
        // 검색버튼 구현
        //combobox
        String[] g1 = {"차종", "차종분류", "취향"};
        JComboBox combo1 = new JComboBox(g1);
        JTextField t1 = new JTextField(20); // 10은 글자수
        JButton b11 = new JButton("검색");

        //
        JButton b2 = new JButton("필터 등록: p06_1()로 이동");
        JButton b3 = new JButton("필터 수정/삭제: p06_2()로 이동");
        JButton b4 = new JButton("GV80 상세: p07_2()로 이동");

        f.add(b0);
        f.add(b1);
        f.add(combo1);
        f.add(t1);
        f.add(b11);
        f.add(b2);
        f.add(b3);
        f.add(b4);


        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilterSelect filterSelect = new FilterSelect();
                filterSelect.p07();
            }
        }); //b0.addActionListener

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProductList productList = new ProductList();
                productList.p06();
            }
        }); //b1.addActionListener

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilterAdd filterAdd = new FilterAdd();
                filterAdd.p06_1();
            }
        }); //b2.addActionListener

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FilterManagement filterManagement = new FilterManagement();
                filterManagement.p06_2();
            }
        }); //b3.addActionListener

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProductInfo productInfo = new ProductInfo();
                productInfo.p07_2();
            }
        }); //b4.addActionListener


        /////////////////////////////////////////////////////////

        //JFrame Visible처리
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
