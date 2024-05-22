package com.multi.Exam;

public class PastaCook {

    public void doGet(){

        TomatoSauce tomato = new TomatoSauce();
        tomato.spaghetti();
        tomato.fettuccine();
        tomato.penne();

        CreamSauce cream = new CreamSauce();
        cream.spaghetti();
        cream.fettuccine();
        cream.penne();

        Oil oil = new Oil();
        oil.spaghetti();
        oil.fettuccine();
        oil.penne();

    }
}
