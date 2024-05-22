package com.multi.a_inheritance.Exam;

public class SUV extends Car{

    private String carryMore;

    public SUV(int price, String name, String carryMore) {
        super(price, name);
        this.carryMore = carryMore;
    }

    public void highHeight() {

        super.buy();
        System.out.println("Sedan 보다 짐이 천장이 높습니다!");
    }

    public String getCarryMore() {
        return carryMore;
    }

    public void setCarryMore(String carryMore) {
        this.carryMore = carryMore;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "carryMore='" + carryMore + '\'' +
                '}';
    }
}
