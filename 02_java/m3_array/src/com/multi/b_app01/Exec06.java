package com.multi.b_app01;

import java.util.Random;

public class Exec06 {
    public static void main(String[] args) {
        // 1. 답안지, 대답안 공간만들어라.
        int[] answer = new int[990];
        int[] myAnswer = new int[990];

        // 2. 랜덤하게 만들어주는 부품을 만들어라.
        Random r = new Random();

        // 3. 990번 반복해서 답안지, 대답안에 숫자를 넣어라.
        for (int i = 0; i < myAnswer.length; i++) {

            answer[i] = r.nextInt(4) + 1;
            myAnswer[i] = r.nextInt(4) + 1;
            //0~3 + 1 ==> 1~4
        }
        //    1~4 범위

        // 4. 같은 인덱스끼리 990번 비교
        int score = 0;
        for (int i =0; i<myAnswer.length; i++){
            if (answer[i] == myAnswer[i]){
                score++; // 증감 연산자
            }
        }
        System.out.println(score);
        //    비교하다가 숫자가 동일하면 점수를 1늘려주세요.

        // 5. 내 점수 프린트!


    }
}
