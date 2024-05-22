package com.multi.a_constructor;

public class Bank {
    public static void main(String[] args) {

        Account acc1 = new Account("카리나", "비상금", 100000);
        System.out.println(acc1);

        Account acc2 = new Account("신세경", "신규개설", 200000);
        System.out.println(acc2);

        Account acc3 = new Account("유라", "신규개설");
        System.out.println(acc3);

        acc3.setMoney(50000);
        System.out.println(acc3);


        Account acc4 = new Account();
        System.out.println(acc4);
    }
}
