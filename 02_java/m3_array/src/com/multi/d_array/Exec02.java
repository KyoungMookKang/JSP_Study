package com.multi.d_array;

import java.util.Arrays;

public class Exec02 {
    public static void main(String[] args) {

        int[][] seat = new int[3][5]; // [행][열]
        // 배열을 선언순간 공간이 할당된다.
        // seat : 참조형 변수 (주소)
        System.out.println(Arrays.toString(seat)); // 출력시 행의 주소값이 출력된다.

        //   0	1	2	3	4
        //0	 0	0	0	0	0
        //1	 0	0	0	0	0
        //2	 0	0	0	0	0

        //0,0 = 1
        //0,4 = 1
        seat[0][0] = 1;
        seat[0][4] = 1;
        seat[2][4] = 1;

        for(int i = 0; i < seat.length; i++){
            for(int j = 0; j < seat[i].length; j++){

                System.out.print(seat[i][j] + " ");
            }
            System.out.println();

        }

        int[][] seat1 = new int[3][]; //행은 비우면 안됨
        //2차원 배열은 1차원 배열을 연결!
        int[] s1 = {1, 2, 3};
        int[] s2 = {1, 2, 3, 4};
        int[] s3 = {1, 2, 3, 4, 5};

        seat1[0] = s1;
        seat1[1] = s2;
        seat1[2] = s3;

        for(int i = 0; i < seat1.length; i++){
            for(int j = 0; j < seat1[i].length; j++){

                System.out.print(seat1[i][j] + " ");
            }
            System.out.println();

        }

    }
}
