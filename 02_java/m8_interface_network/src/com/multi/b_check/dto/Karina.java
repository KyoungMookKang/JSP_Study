package com.multi.b_check.dto;

public class Karina implements Singer{
    @Override
    public void sing() {
        System.out.println("노래를 한다 카리나");
    }

    @Override
    public void compose() {
        System.out.println("작곡을 한다 카리나");
    }

    @Override
    public void dance() {
        System.out.println("춤춘다 카리나");
    }
}
