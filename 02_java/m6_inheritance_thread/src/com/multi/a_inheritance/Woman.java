package com.multi.a_inheritance;

public class Woman extends Human {

    private String food;

    public Woman(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }
    
    public void setFood(String food) {
        this.food = food;
        System.out.println("음식을 해버림");
    }

    @Override
    public String toString() {
        return "Woman{" +
                "food='" + food + '\'' +
                '}';
    }


}
    

  