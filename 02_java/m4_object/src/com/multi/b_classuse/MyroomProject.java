package com.multi.b_classuse;

import com.multi.a_calssmake.Calculator;
import com.multi.a_calssmake.Dog;
import com.multi.a_calssmake.Phone;
import com.multi.a_calssmake.Television;

public class MyroomProject {
    public static void main(String[] args) { // Alt + Ent < 오류에 대한 수정방안 추천을 해줌

        Phone p1 = new Phone(); // Classmake 에 Phone을 만들어서 자동으로 Import 되었다.
        p1.makeCall();

        p1.setSize(-100);
        System.out.println(p1.getSize());

        Dog dog = new Dog();
        dog.setColor("흰색");
        dog.setType("포메라니안");
        dog.wagTail();

        System.out.println(dog.getColor());
        System.out.println(dog.getType());

        System.out.println(dog.toString());

        Television television = new Television();
        television.채널을바꾸다();
        television.볼륨조절();


        Calculator cal = new Calculator();
        cal.add();



//        p1.size = -100; // set
//        p1.speaker = "노키아";
//
//        System.out.println(p1.size)// get
//        System.out.println(p1.speaker);






    }
}
