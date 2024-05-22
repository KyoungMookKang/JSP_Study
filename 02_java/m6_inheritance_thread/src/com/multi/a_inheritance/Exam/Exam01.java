package com.multi.a_inheritance.Exam;

import java.util.ArrayList;

public class Exam01 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("강경묵");
        list.add("31");
        list.add("0.3");
        list.add(false);
        list.add('남');

        System.out.println(list);

        String name = (String) list.get(0);
        int age = (int) list.get(1);
        double sight = (double) list.get(2);
        boolean breakfast = (boolean) list.get(3);
        char gender = (char) list.get(4);

        System.out.println("내 이름 :" + name + " 입니다.");
        System.out.println("내년에는 " + " 세 입니다.");
        System.out.println("시력이 0.2 좋아진다면 : " + (sight + 0.2) + " 입니다.");
        if(breakfast){
            System.out.println("아침을 안먹었다");
        } else {
            System.out.println("안먹었다.");
        }
        System.out.println("내 성별은 " + gender + " 입니다.");

    }

}
