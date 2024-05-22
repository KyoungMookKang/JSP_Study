package com.miniproject.common.view;


import view.FilterAdd;
import view.FilterManagement;
import view.FilterSelect;
import view.ProductInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

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

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //p03();
            }
        }); //b0.addActionListener

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
                p06_1();
            }
        }); //b2.addActionListener

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p06_2();
            }
        }); //b3.addActionListener

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p07_2();
            }
        }); //b3.addActionListener

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // p06() : 상품조회

    public void p06_1() {
        //JFrame 정의
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("필터 등록 페이지");
        f.getContentPane().setBackground(Color.YELLOW);

        // FlowLayout ?
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        //페이지제목
        JLabel l1 = new JLabel("p06_1 : 필터 등록 페이지");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        l1.setFont(font);
        f.add(l1);
        /////////////////////////////////////////////////////////
        JButton b0 = new JButton("<-뒤로가기");
        JLabel l2 = new JLabel("1. 승차감에 민감하신가요?");
        //radio
        ButtonGroup g1 = new ButtonGroup();
        JRadioButton r11 = new JRadioButton("맞습니다.");
        JRadioButton r12 = new JRadioButton("아닙니다.");
        // r11 의 값을 가져와야함


        JLabel l3 = new JLabel("2. 가진 짐이 많으신가요?");
        //radio
        ButtonGroup g2 = new ButtonGroup();
        JRadioButton r21 = new JRadioButton("맞습니다.");
        JRadioButton r22 = new JRadioButton("아닙니다.");

        JLabel l4 = new JLabel("3. 탑승인원이 3명을 넘어가나요?");
        //radio
        ButtonGroup g3 = new ButtonGroup();
        JRadioButton r31 = new JRadioButton("맞습니다.");
        JRadioButton r32 = new JRadioButton("아닙니다.");
        JButton b1 = new JButton("제출: p06()로 이동");



        f.add(b0);
        f.add(l2);
        g1.add(r11);
        g1.add(r12);
        f.add(r11);
        f.add(r12);

        f.add(l3);
        g2.add(r21);
        g2.add(r22);
        f.add(r21);
        f.add(r22);

        f.add(l4);
        g3.add(r31);
        g3.add(r32);
        f.add(r31);
        f.add(r32);
        f.add(b1);

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p06();
            }
        }); //b0.addActionListener

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"필터가 등록되었습니다.");
                // 제출결과를 DB로 이동 및 저장
                presetDto presetDto = new presetDto();
                presetDto presetDto = new presetDto();
                p06();

            }
        }); //b1.addActionListener

        /////////////////////////////////////////////////////////
        //JFrame Visible처리
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    } // p06_1() : 필터등록페이지

    public void p06_2() {
        // JFrame 정의
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("필터 수정 & 삭제");
        f.getContentPane().setBackground(Color.YELLOW);

        // BorderLayout 설정
        BorderLayout layout = new BorderLayout();
        f.setLayout(layout);

        // 페이지 제목 추가
        JLabel l1 = new JLabel("p06-2 : 필터 수정 & 삭제");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        l1.setFont(font);
        f.add(l1, BorderLayout.NORTH);

        // 필터 선택 안내 문구 추가
        JLabel l2 = new JLabel("수정 및 삭제하실 필터를 선택해주세요");
        l2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        f.add(l2, BorderLayout.CENTER);

        // 라디오 버튼 추가
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1)); // 3행 1열의 그리드 레이아웃
        radioPanel.setBackground(Color.YELLOW);

        JRadioButton rb1 = new JRadioButton("1번 필터");
        rb1.setBackground(Color.YELLOW);
        JRadioButton rb2 = new JRadioButton("2번 필터");
        rb2.setBackground(Color.YELLOW);
        JRadioButton rb3 = new JRadioButton("3번 필터");
        rb3.setBackground(Color.YELLOW);

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        radioPanel.add(rb1);
        radioPanel.add(rb2);
        radioPanel.add(rb3);

        f.add(radioPanel, BorderLayout.CENTER);

        // 수정 버튼 추가
        JButton b1 = new JButton("수정");
        b1.setPreferredSize(new Dimension(80, 40)); // 크기 설정
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // FilterAdd로 이동
                p06_1();

            }
        });

        // 삭제 버튼 추가
        JButton b2 = new JButton("삭제");
        b2.setPreferredSize(new Dimension(80, 40)); // 크기 설정
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "삭제 되었습니다.");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // 가운데 정렬
        buttonPanel.add(b1);
        buttonPanel.add(b2);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        southPanel.add(buttonPanel, BorderLayout.SOUTH);

        f.add(southPanel, BorderLayout.SOUTH);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // p06_2() : 필터수정삭제페이지

    public void p07() {
        //JFrame 정의
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("첫화면");
        f.getContentPane().setBackground(Color.CYAN);

        // FlowLayout ?
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        //페이지제목
        JLabel l1 = new JLabel("p07 : 필터 적용");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        l1.setFont(font);
        f.add(l1);

        /////////////////////////////////////////////////////////
        JButton b0 = new JButton("<-뒤로가기");
        JLabel l2 = new JLabel("사용할 필터를 선택해 주세요");
        //radio
        ButtonGroup g1 = new ButtonGroup();
        JRadioButton r1 = new JRadioButton("1번 필터");
        JRadioButton r2 = new JRadioButton("2번 필터");
        JRadioButton r3 = new JRadioButton("3번 필터");

        JLabel l3 = new JLabel("선택하신 필터의 조건입니다.");
        JLabel l4 = new JLabel("/ 승차감 l4.setText()");
        JLabel l5 = new JLabel("/ 적재량 l5.setText()");
        JLabel l6 = new JLabel("/ 탑승인원 l6.setText()");

        JButton b1 = new JButton("선택: p07_1()로 이동");

        f.add(b0);
        f.add(l2);
        g1.add(r1);
        g1.add(r2);
        g1.add(r3);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);

        f.add(b1);



        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // p03();
            }
        }); //b0.addActionListener

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p07_1();
            }
        }); //b1.addActionListener
    } // p07() : 필터적용

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
                p07();
            }
        }); //b0.addActionListener

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p06();
            }
        }); //b1.addActionListener

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               p06_1();
            }
        }); //b2.addActionListener

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p06_2();
            }
        }); //b3.addActionListener

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p07_2();
            }
        }); //b4.addActionListener


        /////////////////////////////////////////////////////////

        //JFrame Visible처리
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    private int now = 0;

    public void p07_2() {
        String[] titles = {"Genesis GV80", "KIA K7", "Genesis G70", "Hyundai 아반떼", "Hyundai 투싼", "KIA 셀토스", "KIA 레이", "Genesis G80"};
        String[] images = {"img001.png", "img002.png", "img003.png", "img004.png", "img005.png", "img006.png", "img007.png", "img008.png"};
        String[] features = {"넓은 실내와 적재공간 보유", "편안한 실내와 넓은 적재공간", "뒷좌석이 협소하지만 훌륭한 주행감", "무난함의 상징", "중형 SUV의 표본", "적재량과 뒷좌석 공간이 편리함", "작지만 훌륭한 적재공간 보유", "뒷좌석에 손님을 모시기에 적합"};
        Integer[] prices = {55000, 45000, 40000, 30000, 35000, 30000, 28000, 50000};

        JFrame f = new JFrame();
        f.setSize(900, 900);
        f.setTitle("상품 정보");
        f.getContentPane().setBackground(Color.YELLOW);

        // FlowLayout ?
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        //페이지제목
        JLabel l1 = new JLabel("p07_2 : 상품정보 페이지");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        l1.setFont(font);
        f.add(l1);
        JLabel productInfoLabel = new JLabel();
        updateProductInfoLabel(productInfoLabel, titles[now], images[now], features[now], prices[now]);
        f.add(productInfoLabel);

        // 이전 상품 버튼
        JButton prevButton = new JButton("이전 상품");
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                now = (now - 1 + titles.length) % titles.length;
                updateProductInfoLabel(productInfoLabel, titles[now], images[now], features[now], prices[now]);
            }
        });
        f.add(prevButton);

        // 다음 상품 버튼
        JButton nextButton = new JButton("다음 상품");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                now = (now + 1) % titles.length;
                updateProductInfoLabel(productInfoLabel, titles[now], images[now], features[now], prices[now]);
            }
        });
        JButton b0 = new JButton("<-뒤로가기");
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p07_1();
            }
        }); //b0.addActionListener
        f.add(b0);

        f.add(nextButton);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    // 상품 정보 업데이트 메소드
    private void updateProductInfoLabel(JLabel label, String title, String image, String feature, int price) {
        label.setText("<html><center><h2>" + title + "</h2><br><img src='file:img/" + image + "' width='200'><br><p>" + feature + "</p><p>가격: " + price + "원</p></center></html>");
    }
}

