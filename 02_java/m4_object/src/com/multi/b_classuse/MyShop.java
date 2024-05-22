package com.multi.b_classuse;

import com.multi.a_calssmake.Calculator2;

public class MyShop {
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();

        System.out.println(cal.add(100, 200));

        int result = cal.mul(50, 30);
        System.out.println(result);


        double result2 = cal.add2(20,20.5);
        System.out.println(result2);


    }
}
