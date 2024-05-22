package com.multi.a_constructor;

public class BoardMain {
    public static void main(String[] args) {

        Board brd1 = new Board(1, "오늘의 수업","자바","경묵");
        System.out.println(brd1);

        Board brd2 = new Board(2, "골프치고싶당","운동","경묵 강");
        System.out.println(brd2);

        Board brd3 = new Board(4, "허리가 아프다","건강","경묵 강");
        System.out.println(brd3);
    }
}
