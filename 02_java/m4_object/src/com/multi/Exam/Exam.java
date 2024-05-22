package com.multi.Exam;

import com.multi.a_calssmake.Calculator2;

public class Exam {
    public static void main(String[] args) {

        Calculator2 계산기 = new Calculator2();
        int price = 7000;
        int count1 = 5; //오전에 온 손님 수
        int count2 = 4; //오후에 온 손님 수

        int result = 계산기.add(count1, count2);
        System.out.println("총 손님수 : " + result);

        // 오전과 오후 손님수 차이
        int result2 = 계산기.minus(count1, count2);
        System.out.println("오전과 오후의 손님수 차이는 : " + result2);

        // 오전에 들어온 손님의 결제 금액은?
        int result3 = 계산기.mul(count1, price);
        System.out.println(result3);


        //오후에 들어온 손님의 총 결제 금액은?
        int result4 = 계산기.mul(count2, price);
        System.out.println(result4);

        //오전과 오후에 들어온 손님의 총 결제 금액은?
        int result5 = 계산기.add(result3, result4);
        System.out.println("금일 총 결제 금액은 : " + result5);

        //5번에서 계산한 결제금액으로 1인당 결제 금액을 계산
        int result6 = 계산기.div(result5, result);
        System.out.println("1인당 결제 금액은 : " + result6);


    }

}
