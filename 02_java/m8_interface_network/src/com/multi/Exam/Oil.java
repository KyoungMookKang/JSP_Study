package com.multi.Exam;

public class Oil implements Pasta{
    @Override
    public void spaghetti() {
        System.out.println("오일로 만든 스파게티 파스타");
    }

    @Override
    public void fettuccine() {
        System.out.println("오일로 만든 페투치니 파스타");
    }

    @Override
    public void penne() {
        System.out.println("오일로 만든 펜네 파스타");
    }
}
