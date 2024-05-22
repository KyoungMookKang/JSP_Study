package com.multi.Exam;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Exam01Launcher extends JFrame {
    JLabel count, image, day;

    CounterEx count2;
    TimerEx day2;
    ImageEx image2;

    public Exam01Launcher() {

        setSize(800, 500);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        count = new JLabel("남은 시간");

        image = new JLabel();
        ImageIcon icon = new ImageIcon("img/img_007.png");
        image.setIcon(icon);

        day = new JLabel("지금은 시각은 : ");
        Font font = new Font("굴림", Font.ITALIC, 30);
        count.setFont(font);
        day.setFont(font);

        add(count, BorderLayout.WEST);
        add(image, BorderLayout.EAST);
        add(day, BorderLayout.SOUTH);

        count2 = new CounterEx();
        image2 = new ImageEx();
        day2 = new TimerEx();

        count2.start();
        day2.start();

        setVisible(true);

    }

    class CounterEx extends Thread {
        @Override
        public void run() {
            for (int i = 10; i >= 0; i--) {
                count.setText("카운트 => " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    dispose();
                    throw new RuntimeException(e);
                }
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "당신은 행복해졌습니다.");
                    day2.interrupt();
                }
            }
        }
    }
    class TimerEx extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                Date date = new Date();
                day.setText("시간 " + date);


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    dispose();
                    System.out.println("종료 카운트 TimeThread2");
                    return;
                }
            }
        }
    }

          static Exam01Launcher f;

            public static void main(String[] args) {

               Exam01Launcher f = new Exam01Launcher();

    }
}
