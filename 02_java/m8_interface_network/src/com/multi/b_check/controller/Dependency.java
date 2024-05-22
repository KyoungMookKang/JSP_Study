package com.multi.b_check.controller;


import com.multi.b_check.dto.BeanFactory;
import com.multi.b_check.dto.Karina;
import com.multi.b_check.dto.SNSD;
import com.multi.b_check.dto.Singer;

import java.util.Scanner;

public class Dependency {

    public void doGet(){
        // 1. 일반 객체 생성

        Karina singer = new Karina();
        singer.sing();
        singer.compose();

        // 2. 인터페이스 생성, 결합도를 낮춘다.
        SNSD singer1 = new SNSD();
        singer1.sing();
        singer1.compose();

        // 3. 전략 디자인 패턴 - 결합도 낮추기

        Scanner sc = new Scanner(System.in);
        System.out.println("만들 가수를 입력하라우");

        String enter = sc.nextLine();
        Singer singer2 = (Singer) BeanFactory.getBean(enter);

        singer.sing();
    }
}
