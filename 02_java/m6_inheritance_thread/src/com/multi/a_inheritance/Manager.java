package com.multi.a_inheritance;

public class Manager extends Employee {

    private int bonus;

    public void test() {

        System.out.println("이름은 " + super.name);
        System.out.println("주소는 " + super.address);
        System.out.println("월급은 " + super.salary);

//        System.out.println("" + super.rrn); private 이기에 사용불가능


    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + this.bonus +
                ", salary=" + super.salary +
                ", address='" + super.address + '\'' +
                ", name='" + super.name + '\'' +
                '}';
    }
}
