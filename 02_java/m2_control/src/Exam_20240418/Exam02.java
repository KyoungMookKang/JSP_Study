package Exam_20240418;

import java.util.Random;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {

        Random rock = new Random();
        Scanner sc = new Scanner(System.in);

        int comWin = 0;
        int meWin = 0;
        int draw = 0;

        while (true) {
            int com = rock.nextInt(3);
            System.out.println("내 선택(0 : 바위, 1: 가위, 2: 보)");
            int me = sc.nextInt();

            if (me == -1) {
                System.out.println("게임 종료");
                System.out.println("-------------");
                System.out.println();
                System.out.println();
                System.out.println();
                int sum = meWin + comWin;
                double result = (double) meWin / sum * 100;
                System.out.println("나의 승률" + (int) result + "%");
            }
            if (me == 0) {
                System.out.println("내가 바위를 냄");
                if (com == 0) {
                    System.out.println("컴퓨터가 바위를 냄");
                    System.out.println("비겼습니다.");
                    draw++;
                }
            }
            if (me == 0) {
                System.out.println("내가 바위를 냄");
                if (com == 1) {
                    System.out.println("컴퓨터가 가위를 냄");
                    System.out.println("이겼습니다.");
                    meWin++;
                }
            }
            if (me == 0) {
                System.out.println("내가 바위를 냄");
                if (com == 2) {
                    System.out.println("컴퓨터가 보를 냄");
                    System.out.println("졌습니다.");
                    comWin++;
                }
            }


            if (me == 1) {
                System.out.println("내가 가위를 냄");
                if (com == 0) {
                    System.out.println("컴퓨터가 바위를 냄");
                    System.out.println("졌습니다.");
                    comWin++;
                }
            }
            if (me == 1) {
                System.out.println("내가 가위를 냄");
                if (com == 1) {
                    System.out.println("컴퓨터가 가위를 냄");
                    System.out.println("비겼습니다.");
                    draw++;
                }
            }
            if (me == 1) {
                System.out.println("내가 가위를 냄");
                if (com == 2) {
                    System.out.println("컴퓨터가 보를 냄");
                    System.out.println("이겼습니다.");
                    meWin++;
                }
            }


            if (me == 2) {
                System.out.println("내가 보를 냄");
                if (com == 0) {
                    System.out.println("컴퓨터가 바위를 냄");
                    System.out.println("이겼습니다.");
                    comWin++;
                }
            }
            if (me == 2) {
                System.out.println("내가 보를 냄");
                if (com == 1) {
                    System.out.println("컴퓨터가 가위를 냄");
                    System.out.println("졌습니다.");
                    comWin++;
                }
            }

            if (me == 2) {
                System.out.println("내가 보를 냄");
                if (com == 2) {
                    System.out.println("컴퓨터가 보를 냄");
                    System.out.println("비겼습니다.");
                    draw++;
                }
            }
            sc.close();
        }

    }
}

