package com.multi.b_thread;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ThreadGrapic extends JFrame {
    JLabel count, image, day;

    CounterThread2 count2;
    TimeThread2 day2;
    ImageThread2 image2;

    public ThreadGrapic() {

        setSize(800, 500);
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        count = new JLabel("카운터");
        image = new JLabel("");
        day = new JLabel("시각");
        Font font = new Font("궁서", Font.BOLD, 30);
        count.setFont(font);
        day.setFont(font);

        add(count, BorderLayout.WEST);
        add(image, BorderLayout.EAST);
        add(day, BorderLayout.SOUTH);


        count2 = new CounterThread2();
        image2 = new ImageThread2();
        day2 = new TimeThread2();

        count2.start();
        image2.start();
        day2.start();

        setVisible(true);
    }

    class CounterThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 10; i >= 0; i--) {
                count.setText("카운트 => " + i);


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    dispose();
                    System.out.println("종료 카운트 CounterThread2");
                    return;
                }
                if(i == 0){
                JOptionPane.showMessageDialog(null, "사용 시간이 다 되었습니다. 퇴실 부탁드립니다.");
                image2.interrupt();
                day2.interrupt();
                }
            }
        }
    }

    class TimeThread2 extends Thread {
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

    class ImageThread2 extends Thread {
        @Override
        public void run() {
            String[] list = {"1.png","2.png","3.png","4.png","5.png"};
            for (int i = 0; i < list.length ; i++) {
                ImageIcon icon = new ImageIcon("img/"+list[i]);
                image.setIcon(icon);
                System.out.println("이미지 >> " + list[i]);



                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    dispose();
                    System.out.println("종료 카운트 ImageThread2");
                    return;
                }
            }
        }
    }


    static ThreadGrapic f;

    public static void main(String[] args) {

        ThreadGrapic f = new ThreadGrapic();
    }
}
