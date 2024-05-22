package com.multi.a_array;

public class Ex01 {
    public static void main(String[] args) {
        int[] a = new int[200];
        a[0] = 1000;
        a[1] = 2000;
        a[2] = 3000;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        double[] a2 = new double[300];
        a2[0] = 10.1;
        a2[1] = 20.2;
        a2[2] = 30.2;
        a2[299] = 50.5;
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }


        String[] tour = { "Tokyo", "Seoul", "NewYork", "LA", "Moscow" };
        for(int i = 0; i < tour.length; i++){
            System.out.println(tour[i] + " ");
        }

        char[] color = {'B', 'R', 'G', 'Y', 'M'}; // char의 문자열은 ''로 담아야한다.
        for (char c : color){
            System.out.println(c + "첫 글자 입니다.");
        }

        double[] height = new double[5];
        height[0] = 163.5;
        height[1] = 168.3;
        height[2] = 169.2;
        height[3] = 158.7;
        height[4] = 172.1;
        for (int i = 0; i < height.length; i++) {
            System.out.println(height[i] + "cm 입니다.");
        }


    }
}
