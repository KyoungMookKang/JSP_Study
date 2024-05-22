package com.multi.a_interface;

public class PhoneMain {
    public static void main(String[] args) {

        //PhoneInterface p = new PhoneInterface(); < 인터페이스는 객체 생성이 불가능 하다.

        //PhoneClass p = new PhoneClass(); < 추상클래스 또한 객체 생성이 불가능 하다.

        PhoneInterface p = new PhoneClass();

        p.call();

        AppleKorea a = new AppleKorea();
        a.call();
        a.pay();

        AppleUSA b = new AppleUSA();
        b.call();
        b.pay();


    }
}
