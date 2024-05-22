package com.multi.b_conditional;

import java.util.Date;
import java.util.GregorianCalendar;

public class Exec05 {
    public static void main(String[] args) {

        Date date = new Date();

        int month = date.getMonth() + 1; // 월
        int day = date.getDay(); // 일
        System.out.println(day);

        // switch 문을 사용해서 0, 6 일때 놀자 출력, 1~5일때 공부하자 출력(문제)
        switch (day){
            case 0:
            case 6: // case 0: 에서 브레이크가 없기에 6으로진행
                System.out.println("놀자");
                break;
            default: // 0,6 을 제외한 나머지는 기본값으로
                System.out.println("공부하자");
                break;
        }
        System.out.println("------------ 그레고리안 캘린더 -------------");
        // 윤년이란? 년도가(4의 배수이면서, 100의 배수가 아니거나)
        //              (400의 배수가)가 되는 해가 윤년(1년을 366일로 계산(=2월이 29일인 해))

        // 율리우스력의 근소한 오차 값을 수정한 그레고리력
        // (1년을 365 1/4일(365.2422일))
        // 1) 그 해의 연도가 4의 배수가 아니면 평년으로 2월은 28일만 있다.
        // 2) 만약 연도가 4의 배수면서 100의 배수가 아니면 윤일(2월 29일)을 도입한다.
        // 3) 만약 연도가 100의 배수이면서 400의 배수가 아닐 때 이 해는 평년으로 생각한다.
        // 4) 만약 연도가 400의 배수면 윤일(2월 29일)을 도입한다.

        // 2)의 예
        // 2008년 (윤년, 366일)

        // 3)의 예
        // 2300년 (평년, 365일)

        // 4)의 예
        // 2400년 (윤년, 366일)
        GregorianCalendar gc = new GregorianCalendar();	// 현재시간

        // 시간에 대해 원하는 값 뽑기
        System.out.println("날짜 : " + gc.get(GregorianCalendar.DATE));
        System.out.println("요일 : " + gc.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("시 : " + gc.get(GregorianCalendar.HOUR));
        System.out.println("분 : " + gc.get(GregorianCalendar.MINUTE));
        System.out.println("달 : " + (gc.get(GregorianCalendar.MONTH)+1));	// 주의
        System.out.println("초 : " + gc.get(GregorianCalendar.SECOND));
        System.out.println("년 : " + gc.get(GregorianCalendar.YEAR));

        gc.set(2020, 5-1, 27);
        gc.set(2008, 2-1, 29);
        System.out.println(gc.getTime());

    }
}
