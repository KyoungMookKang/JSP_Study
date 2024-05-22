package com.multi.a_inheritance;

public class WonderWoman extends Woman{

    private boolean swim;

    public WonderWoman(String name, int age, String food, boolean swim){
        super(name, age, food);
        this.swim = swim;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
        System.out.println("대양을 가로지름");
    }

    @Override
    public String toString() {
        return "WonderWoman{" +
                "swim=" + swim +
                '}' + super.toString();
    }
}
