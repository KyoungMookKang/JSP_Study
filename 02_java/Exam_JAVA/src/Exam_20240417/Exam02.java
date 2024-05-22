package Exam_20240417;

import javax.swing.*;

public class Exam02 {
    public static void main(String[] args) {


        String weight = JOptionPane.showInputDialog("몸무게");
        String height = JOptionPane.showInputDialog("신장");

        double weight1 = Double.parseDouble(weight);
        double height1 = Double.parseDouble(height);
        double bmi = weight1 / (height1 * height1);

        System.out.println("당신의 BMI 지수는 : " + bmi);


        double nowPoint = 3000;
        double plusPoint = 33.3;

        double sum = nowPoint + plusPoint;

        System.out.println("최종 포인트는: " + sum);
    }
}
