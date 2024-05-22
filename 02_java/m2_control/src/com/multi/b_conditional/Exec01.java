package com.multi.b_conditional;

public class Exec01 {
    public static void main(String[] args) {

        int score = 86;

        String result = ""; // 변수를 선언할때는 초기값을 넣자

        if(score >= 90) {
            result = "A학점";
        }else if (score >= 80) {
            result = "B학점";
        }else {
            result = "C학점";
        }

        if(score % 10 >= 5 && score >= 70 || score == 100){
            result += "+";
        }

        System.out.println("당신의 점수는" + result);
    }
}
