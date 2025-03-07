package com.multi.a_inheritance;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("먹기");
    }
    public void sleep(){
        System.out.println("잠자기");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
