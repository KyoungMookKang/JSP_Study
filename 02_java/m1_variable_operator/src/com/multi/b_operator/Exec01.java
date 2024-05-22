package com.multi.b_operator;

public class Exec01 { //psvm + Ent / main <- main 자동생성
    public static void main(String[] args) {

        System.out.println(100+200);

        int n1 = 200;
        int n2 = 100;
        int n3 = n1 + n2;
        System.out.println(n3);

        byte n4 = (byte) 130; // byte는 127까지 / (byte)로 변환을 거쳐줌

        System.out.println(n4);

        byte n5 = 100;
        byte n6 = (byte) (n1 + n2);
    }
}
