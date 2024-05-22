package com.multi.a_constructor;

public class MyroomProject {
    public static void main(String[] args) {

        Television t1 = new Television();
        t1.on();

        Television t2 = new Television();
        t2.on();
        t2.off();

        Television t3 = new Television(7,8,false);

        Television t4 = new Television(13,5,true);

        System.out.println(t3);
        System.out.println(t4);

        System.out.println("객체 생성 갯수는 ?" + Television.count);

    }
}
