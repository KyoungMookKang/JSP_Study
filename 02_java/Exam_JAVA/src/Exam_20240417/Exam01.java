package Exam_20240417;

import javax.swing.*;

public class Exam01 {
    public static void main(String[] args) {
        double weight = 22.2;
        double height = 33.3;

        System.out.println("넓이 :" + weight * height);
        JOptionPane.showMessageDialog(null,"넓이 :" + weight * height);



        int a = 25;
        int b = 3;
        int c = a + b;

        System.out.println("결과 : " + (a - b) * c);



        double temp = 25.3;
        
        if(temp <= 25){
            System.out.println("너무 더워요");
        } else {
            System.out.println("괜찮아요");
        }

    }
}
