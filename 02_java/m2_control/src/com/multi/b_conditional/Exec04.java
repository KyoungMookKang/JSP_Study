package com.multi.b_conditional;

public class Exec04 {
    /* [switch문 표현식] --> 대소비교는 불가능, 일치 불일치 여부만 확인가능
     * switch(비교할변수) {  -> 비교할 변수는 정수, 문자열, 문자가 들어가야한다 / 실수, 논리는 안된다.
     *     case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
     *     case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
     *     default : case에 모두 해당하지 않는 경우 실행할 구문; break;
     * }
     * */
    public static void main(String[] args) {
        String name = "카리나";
        switch (name) {

            case "카리나" :
                System.out.println("카리나");
                break;

            case "신세경":
                System.out.println("신세경");
                break;

            case "유라":
                System.out.println("유라");
                break;

            default: // 생략이 가능하다
                System.out.println("카운터로");
                break;
        }


    }
}
