package com.multi.a_interface;

public abstract class AppleClass extends PhoneClass{
    // 일반 메서드 3개를 이미 가지고 시작한다.
    // call(), internet(), text()

    // pay 기능을 다르게 넣었다 뺐다 할수 있게끔 추상메소드로 구현

    public abstract void pay();

}
