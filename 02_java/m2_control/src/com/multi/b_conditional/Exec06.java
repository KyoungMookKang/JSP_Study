package com.multi.b_conditional;

public class Exec06 {
    public static void main(String[] args) {
        // 12 1 2 / 3 4 5 / 6 7 8 / 9 10 11

        int month = 4;

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("겨울");
                break;
        }

// 확인문제 4번
        String no = "A100EX";

        char dep = no.charAt(0);

        switch (dep) {
            case 'A':
                System.out.println("기획부");
                break;
            case 'B':
                System.out.println("총무부");
                break;
            case 'C':
                System.out.println("개발부");
                break;
            default:
                System.out.println("해당 부서 없음");
                break;
        }

        String ssn = "880115-1056512";

        char gender = ssn.charAt(7);

        switch (gender) {
            case '1':
            case '3':
                System.out.println("남성");
                break;
            case '2':
            case '4':
                System.out.println("여성");
                break;
            default:
                System.out.println("잘못된 식별자입니다.");
                break;
        }

    }
}