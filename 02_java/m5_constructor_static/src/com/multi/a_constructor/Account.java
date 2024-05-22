package com.multi.a_constructor;

public class Account {

    private String name; // 계좌
    private String field; // 계좌종류
    private int money; // 금액


    public Account(){}

    public Account(String name, String field){
        this.name = name;
        this.field = field;
    }

    public Account(String name, String field, int money){
//        this.name = name;
//        this.field = field;
        this(name, field);
        this.money = money; // 서순으로 인해 윗줄과 순서가 바뀌면 에러발생
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", field='" + field + '\'' +
                ", money=" + money +
                '}';
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
