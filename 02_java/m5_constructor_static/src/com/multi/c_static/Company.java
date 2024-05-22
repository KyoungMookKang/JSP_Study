package com.multi.c_static;

public class Company {
    public static void main(String[] args) {

        Employee e1 = new Employee("카리나", 25, "여");
        Employee e2 = new Employee("신세경", 33, "여");
        Employee e3 = new Employee("유라", 32, "여");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        // 직원 수 계산
        System.out.println(Employee.count + "명");
        //평균 연령 계산
        System.out.println(Employee.sum / Employee.count + "세");
        System.out.println(Employee.getAvg() + "세"); // < static 을 새로 만들어 출력

    }
}
