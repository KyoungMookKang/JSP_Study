package com.multi.b_thread;

import java.util.Timer;
import java.util.concurrent.CountDownLatch;

public class RunTimer {
    public static void main(String[] args) {

        Timer timer = new Timer();
        CountDownLatch latch = new CountDownLatch(1); // 카운트다운(1) < 1까지 카운트다운 하는기능
        TimerTest timerTest = new TimerTest(latch);


        System.out.println("10초 동안 게임을 할 수 없습니다.");
        timer.schedule(timerTest, 10000); // 주어진 지연 시간 후에 한 번 태스크(task) 실행을 예약
        System.out.println("10초가 카운트 되는 중입니다.");


        try {
            latch.await(); // await 기능으로 카운트가 0이 될 때 까지 대기한다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main 코드는 종료 되었습니다.");
        timer.cancel();
    }
}
