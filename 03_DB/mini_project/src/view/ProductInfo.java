package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductInfo {
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
        f.add(nextButton);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 상품 정보 업데이트 메소드
    private void updateProductInfoLabel(JLabel label, String title, String image, String feature, int price) {
        label.setText("<html><center><h2>" + title + "</h2><br><img src='file:img/" + image + "' width='200'><br><p>" + feature + "</p><p>가격: " + price + "원</p></center></html>");
    }
}


