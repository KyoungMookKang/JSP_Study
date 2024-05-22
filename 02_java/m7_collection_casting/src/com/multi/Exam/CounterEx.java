package com.multi.Exam;

public class CounterEx extends Thread{
    @Override
    public void run() {
        super.run();

        for (int i = 20; i >= 0; i--) {
            System.out.println("===> 카운트 " + i);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
                i = -1;
            }

        }
    }
}
