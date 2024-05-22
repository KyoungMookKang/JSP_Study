package com.multi.b_app01;

import java.util.Random;

public class Exec02 {
    public static void main(String[] args) {

        // 1. 공간 6개 만들기
        int num[] = new int[6];
        // 2. Random()
        Random r1 = new Random();
        // 3. 공간 만큼 돌면서 랜덤한 값을 그 공간에 담기
        for(int i = 0; i < num.length; i++){
            num[i] = r1.nextInt(45) + 1;
        }
        // 4. 출력

        for(int i : num){
            System.out.println(i);
        }




    }
}
