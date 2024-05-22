package com.multi.c_loop;

public class Exec01 {
    public static void main(String[] args) {
        // for
        // 초기식 ; 조건식 ; 증감식
        for (int i = 0; i < 10; i++) {
            System.out.println("반복중");
        }
        // ★

        // 무한루프
        // while(true){
//        System.out.println("반갑습니다.");
//        {

        int start = 1;
        int end = 5;

        int add = 1;

        while (start < end) { // 조건식
            System.out.println("찍어보기");
            start = start + add;
        }

        // 1부터 10까지 while

        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        int sum = 0;
        int num2 = 1;
        while (num2 <= 10) {
            System.out.println(num2);
            sum += num2;
            num2++;
        }
        System.out.println(sum);

        //for 문으로 변경

        int sum1 = 0;

        for (int i = 1; i < 10; i++) {
            sum1 += i;
            System.out.println(i);
        }
        System.out.println("\n" + sum1);

        // 0~100 짝수만 세기
        int conut = 0;
        for (int num1 = 1; num1 <= 100; num1++) {
            if (num1 % 2 == 0) {
                conut++;
                System.out.print(num1 + " ");
            }
            System.out.println("\n짝수의 갯수 " + conut);
        }

        // continue / 3의 배수만 안나오게 출력

        for(int i = 1; i < 100; i++){
            if(i %3 == 0){
                break; // skip 의 의미, 아래 로직 수행안하고 증감식으로 넘어감
            }
            System.out.println(i);
        }

        int sum3 = 0;
        for(int i = 1; i <= 1000; i++){
            if(sum3 > 100){
                break; // break 를 포함하는 블록을 종료, 반복문을 종료
            }

            if(i % 5 == 0){
                continue; // skip 의 의미, 아래 로직 수행안하고 증감식으로 넘어감
            }
            sum3 += i;
        }
        System.out.println(sum3);
    }

}
