package com.multi.a_variable; //패키지 - 소문자

import javax.swing.*;

public class Exec03 { // 클래스 - 첫 글자 대문자로 작성

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("이름 입력");
        System.out.println("당신의 이름은 " + name + "이시군요!!");
        JOptionPane.showMessageDialog(null,"당신의 이름은 " + name + "이시군요!!");
    }
    //Ctrl + z < 되돌리기 / Ctrl + Shift + Z < 복원
    //Ctrl + Alt + L < 포맷 정렬 / 줄 맞추기
}
