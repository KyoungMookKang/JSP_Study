package com.multi.a_inheritance.Exam;

public class Exam02_1 extends Exam02{
    
    private  String thick;
    
    public Exam02_1(int price, String company, String thick){
        super(price, company);
        this.thick = thick;
    }
    
    public void write(){
        System.out.println("글을 써버림");
    }

    public String getThick() {
        return thick;
    }

    public void setThick(String thick) {
        this.thick = thick;
    }

    @Override
    public String toString() {
        return "Exam02_1{" +
                "thick='" + thick + '\'' +
                '}'+ super.toString();
    }
}
