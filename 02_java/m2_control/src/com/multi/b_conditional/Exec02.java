package com.multi.b_conditional;

public class Exec02 {
    public static void main(String[] args) {
        
        String data = "OK";
        
        if(data.equals("ok")){
            System.out.println(("긍정"));
        }else if (data.equals("no")){
            System.out.println("부정");
        }else{
            System.out.println("몰루");
        }
    }
}
