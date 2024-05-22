package com.multi.a_inheritance.Exam;

public class Exam02 {

    private int price;
    private String company;

    public  Exam02(int price, String company){
        this.price = price;
        this.company = company;
    }


    public void buy() {
        System.out.println("사다.");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Exam02{" +
                "price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
