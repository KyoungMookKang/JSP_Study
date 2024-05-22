package com.multi.Exam;

public class Exam1 {
    public static void main(String[] args) {

        Cal4 cal = new Cal4();

        int order = 5;
        int price = 2000;
        int order2 = 2;
        int price2 = 3000;

        int result = cal.sum(order, price);
        {
            System.out.println("커피의 가격은 다해서 : " + result);
        }
        int result2 = cal.sum(order2, price2);
        System.out.println("밀크티의 가격은 다해서 : " + result2);

        int payment = cal.total(result, result2);
        {
            System.out.println("종합 금액 : " + payment);
        }
        System.out.println("1인당 결재 금액: " + (int) cal.div(payment, cal.add(order, order2)) + "원 입니다.");
    }
}
