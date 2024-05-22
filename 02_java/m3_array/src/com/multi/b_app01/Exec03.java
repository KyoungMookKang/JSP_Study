package com.multi.b_app01;

import java.util.Random;

public class Exec03 {
    public static void main(String[] args) {

        // 1000개의 공간에 100개 숫자중에 80보다 큰값의 갯수
        Random r = new Random();

        int a[] = new int[1000];
        for(int i = 0; i < a.length; i++){
            a[i] = r.nextInt(100);
        }

        int count = 0;

        for(int n : a){

            if(n > 80){
                count++;

            }
        }
        System.out.println( "80보다 큰 값의 수 입니다." + count);
    }
}
