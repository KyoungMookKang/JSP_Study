package com.multi.a_inheritance.run;

import com.multi.a_inheritance.Manager;
import com.multi.a_inheritance.SuperMan;
import com.multi.a_inheritance.Woman;
import com.multi.a_inheritance.WonderWoman;

public class Run {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.setName("카리나");

        System.out.println(m);


        SuperMan s1 = new SuperMan("신세경", 8,50,true);

        s1.eat(); //human 에서 가져옴
        s1.run(); //man 에서 가져옴
        s1.space(); // superman 에서 가져옴
        s1.sleep();

        System.out.println(s1);


        Woman w1 = new Woman("유라", 32, "짜장면");

        w1.setFood("짜장면");

        System.out.println(w1);


        WonderWoman w2 = new WonderWoman("소진", 35, "짬뽕", true);

        w2.setSwim(true);
        w2.setFood("짬뽕");

        System.out.println(w2);
    }
//    // 기본자료형 Wrapper클래스
//    boolean<--> Boolean
//    char <--> Character
//    short <--> Short
//    byte <--> Byte
//    int <--> Integer
//    long <--> Long
//    float <--> Float
//    double <--> Double
}
