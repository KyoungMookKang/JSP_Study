package com.multi.a_inheritance;

public class SuperMan extends Man{

    private boolean isFly;

    public SuperMan(String name, int age, int power, boolean isFly) {
        super(name, age, power);
        this.isFly = isFly;
    }

    public void space(){
        System.out.println("우주를 날아버림");

        super.toString(); // 부모 메소드 호출할때는 super 사용, 자신의 메소드는 생략하거나 this 를 쓴다.
    }

    @Override
    public void run() {
        System.out.println("엄청나게 달려버림");
    }

    @Override
    public void sleep() {
        System.out.println("잠을 안자버림");
    }

    @Override
    public String toString() {
        return "수퍼맨 [fly=" + isFly + ", power=" + getPower() + ", name=" + getName() + ", age=" + getAge() + "]";
    }

}
