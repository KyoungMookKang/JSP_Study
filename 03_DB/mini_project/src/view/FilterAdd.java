package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilterAdd {

    public void p06_1() {
        //JFrame 정의
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("필터 등록 페이지");
        f.getContentPane().setBackground(Color.YELLOW);

        // 전체 패널에 BorderLayout 설정
        f.setLayout(new BorderLayout());

        // 상단 제목 라벨
        JLabel l1 = new JLabel("p06-1 : 필터 등록 페이지");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        l1.setFont(font);
        JPanel titlePanel = new JPanel();
        titlePanel.add(l1);
        f.add(titlePanel, BorderLayout.NORTH);

        // 질문과 라디오 버튼 그룹 패널들을 포함할 본문 패널
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1)); // 세로로 배치
        mainPanel.setBackground(Color.YELLOW);

        // 승차감에 대한 라벨과 라디오 버튼 그룹 패널
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.YELLOW);
        JLabel l2 = new JLabel("승차감에 민감하신가요?");
        JRadioButton b1 = new JRadioButton("맞습니다.");
        JRadioButton b2 = new JRadioButton("아닙니다.");
        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        panel1.add(l2);
        panel1.add(b1);
        panel1.add(b2);

        // 가진 짐에 대한 라벨과 라디오 버튼 그룹 패널
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        JLabel l3 = new JLabel("가진 짐이 많으신가요?");
        JRadioButton b3 = new JRadioButton("맞습니다.");
        JRadioButton b4 = new JRadioButton("아닙니다.");
        ButtonGroup group1 = new ButtonGroup();
        group1.add(b3);
        group1.add(b4);
        panel2.add(l3);
        panel2.add(b3);
        panel2.add(b4);

        // 탑승인원에 대한 라벨과 라디오 버튼 그룹 패널
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.YELLOW);
        JLabel l4 = new JLabel("탑승인원이 3명을 넘어가나요?");
        JRadioButton b5 = new JRadioButton("맞습니다.");
        JRadioButton b6 = new JRadioButton("아닙니다.");
        ButtonGroup group2 = new ButtonGroup();
        group2.add(b5);
        group2.add(b6);
        panel3.add(l4);
        panel3.add(b5);
        panel3.add(b6);

        // 패널들을 본문 패널에 추가
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);

        // 본문 패널을 프레임에 추가
        f.add(mainPanel, BorderLayout.CENTER);

        // 제출 버튼
        JButton submit = new JButton("제출");
        submit.setPreferredSize(new Dimension(100, 30)); // 버튼 크기 조절
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 선택된 결과 출력
                StringBuilder result = new StringBuilder("선택한 결과:\n");
                result.append("승차감에 대한 선택: ").append(b1.isSelected() ? "맞습니다." : "아닙니다.").append("\n");
                result.append("가진 짐에 대한 선택: ").append(b3.isSelected() ? "맞습니다." : "아닙니다.").append("\n");
                result.append("탑승인원에 대한 선택: ").append(b5.isSelected() ? "맞습니다." : "아닙니다.").append("\n");
                JOptionPane.showMessageDialog(null, result.toString(), "선택 결과", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // 제출 버튼을 패널에 추가하고, 패널을 프레임에 추가
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submit);
        f.add(buttonPanel, BorderLayout.SOUTH);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
