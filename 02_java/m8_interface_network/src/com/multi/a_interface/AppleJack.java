package com.multi.a_interface;

public class AppleJack implements IPhoneJack{
    @Override
    public void flatten() {
        System.out.println("흰색으로 납작하게 만듬");
    }

    @Override
    public void adjustTo2cm() {
        System.out.println("긴 줄을 사용하여 2cm로 만듬");
    }
}
