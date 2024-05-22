package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilterManagement {
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
                FilterAdd filterAdd = new FilterAdd();
                filterAdd.p06_1();

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
    }
}
