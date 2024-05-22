package com.multi.c_app02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec01 {

    private static int count = 0;
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000, 1000);

        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);


        int[] seat = new int[500];

        for(int i = 0; i < seat.length; i++){ // 버튼을 array 갯수만큼 생성
            JButton b = new JButton(i + "");
            f.add(b); // 버튼을 레이아웃에 추가

            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String s = e.getActionCommand(); // 버튼에 발생한 이벤트를 출력
                    JOptionPane.showMessageDialog(f,s + "번이 예약되었습니다."); // 이벤트 출력 메시지

                    b.setBackground(Color.RED); // 버튼을 눌렀을 시 색 적용
                    b.setEnabled(false); // 버튼 재입력시 비활성화 하는 기능

                    int idx = Integer.parseInt(s);
                    seat[idx] = 1;
                    count++;
                }
            });


        }

        JButton pay = new JButton("결제하라우");
        f.add(pay);
        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 배열에 있는 전체 중 1이 몇개인지 세서
                // 13000원을 곱하기

//                int count = 0;
//                for (int n : seat){ // for 문을 통해 눌린 'seat' 의 값을 count 업
//                    if(n == 1){
//                        count++;
//                    }
//                }
                JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개");
                int sum = count * 13000;
                JOptionPane.showMessageDialog(f, "결제금액은  " + sum + "원");



            }
        });

        f.setVisible(true);


    }
}
