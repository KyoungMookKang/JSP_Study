package com.multi.b_thread;

import javax.swing.*;
import java.util.Random;

public class CarRacing extends JFrame {


    public CarRacing() {
        setTitle("숨막히는 레이싱");
        setSize(1400, 600);
        setLayout(null);// absolute layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Car car1 = new Car("img/car01.png", 100, 0);
        Car car2 = new Car("img/car02.png", 100, 150);
        Car car3 = new Car("img/car03.png", 100, 300);


        car1.start();
        car2.start();
        car3.start();

        setVisible(true);
    }

    // 내부클래스
    public class Car extends Thread {

        private int x, y;
        private JLabel label;

        public Car(String file, int x, int y) {
            ImageIcon Icon = new ImageIcon(file);
            label = new JLabel(Icon);

            this.x = x;
            this.y = y;
            label.setBounds(x, y, 150, 150);
            add(label);
        }


        @Override
        public void run() {
            Random r = new Random();
            for (int i = 0; i < 200; i++) {
                int move = r.nextInt(50); // 0~49까지 적용됨

                x = x + move;

                label.setBounds(x, y, 150, 150);

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        CarRacing car = new CarRacing();
    }
}
