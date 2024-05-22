package com.multi.Exam;

public class Exam02_1 {

    private String daughter;
    private String gender;
    private int money;

    public static int count;
    public static int wallet = 50000;

    public String getDaughter() {
        return daughter;
    }

    public void setDaughter(String daughter) {
        this.daughter = daughter;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Exam02_1(String daughter, String gender){
        count++;
        wallet -= 1000;

        this.daughter = daughter;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Exam02_1{" +
                "daughter='" + daughter + '\'' +
                ", gender='" + gender + '\'' +
                ", money=" + money +
                '}';
    }
}
