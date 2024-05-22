package com.multi.a_variable; //패키지 - 소문자

public class Exec01 { // 클래스 - 첫 글자 대문자로 작성

    public static void main(String[] args) { // method - 소문자   / args - 지역변수, 변수는 소문자로 낙타표기법을 사용하여 작성
                                             // 낙타표기법은 연결되는 단어가 있으면 첫글자를 대문자로 작성하는것
        int myAge = 100;
        String myTel = "011";
        String ssn = "880101";

        myAge = Integer.parseInt("100");

        System.out.println(myAge);

        // 상수변수 - 무조건 대문자로 작성, 앞에 final을 붙여준다.
        final String COMPANY = "멀티";
        // COMPANY = "H"; <- 수정이 불가능하기에 사용불가

    }
    //Ctrl + z < 되돌리기 / Ctrl + Shift + Z < 복원
    //Ctrl + Alt + L < 포맷 정렬 / 줄 맞추기
}
