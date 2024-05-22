package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilterSelect {
    public void p07() {
        // JFrame 정의
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("필터를 적용하여 검색");
        f.getContentPane().setBackground(Color.YELLOW);

        // FlowLayout 설정
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        // 페이지 제목 추가
        JLabel l1 = new JLabel("p07 : 필터 선택");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        l1.setFont(font);
        f.add(l1);

        // 필터 선택 안내 문구 추가
        JLabel l2 = new JLabel("사용할 필터를 선택해 주세요");
        l2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
        f.add(l2);

        // 라디오 버튼 추가
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

        f.add(rb1);
        f.add(rb2);
        f.add(rb3);

        JButton b1 = new JButton("선택");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"선택한 필터의 내용입니다.");
            }
        });

        f.add(b1);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
