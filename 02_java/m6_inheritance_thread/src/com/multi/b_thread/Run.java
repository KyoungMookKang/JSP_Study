package com.multi.b_thread;

public class Run {
    public static void main(String[] args) {

        Thread01 t1 = new Thread01();
        Thread02 t2 = new Thread02();

        Thread th = new Thread(t2);
        // th.setPriority(1); < 우선순위를 설정 가능함

//        t1.run();
//        t2.run();

        t1.start();
        // t2.start(); 가 불가능 하기에 Thread th = new Thread(t2); 를 넣어 th를 start 시킴
        th.start(); // start 로 실행시 우선순위를 설정할 수 없음
        System.out.println("main이 종료되었다.");

    }
}
