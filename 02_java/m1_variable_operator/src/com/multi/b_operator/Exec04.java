package com.multi.b_operator;

public class Exec04 { //psvm + Ent / main <- main 자동생성
    public static void main(String[] args) {
        //비교연산자의 결과가 boolean(논리형!)

        // 비교연산자(==, !=, >, >=)
        // *** 비교 결과가 중요(논리형 데이터!! true/false)

        //기본형 데이터는 비교연산자를 가지고 비교 가능
        //기본형 데이터가 아니면 비교연산자를 가지고 비교 불가능

        int x = 200;
        int y = 100;
        System.out.println("일치? " + (x == y));
        System.out.println("불일치? " + (x != y));
        System.out.println("이상? " + (x >= y));
        System.out.println("초과? " + (x > y));

        String a = "카리나"; // <- 해당 형태는 리터럴
        String b = "유라";

        String c = new String("카리나"); // new String을 통해 새로운 주소값을 얻음 / 문자는 같지만 a와는 다른 주소를 가짐
        String d = "카리나"; // 기존에 a에 같은 문자로 주소를 받았기에 d와 a는 주소가 같음

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));




    }
}