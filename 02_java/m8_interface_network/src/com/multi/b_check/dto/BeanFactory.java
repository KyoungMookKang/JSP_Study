package com.multi.b_check.dto;

public class BeanFactory {

    public static Object getBean(String name){
        Singer singer = null;

        if(name.equals("Karina")){
            singer = new Karina();
        }else {
            singer = new SNSD();
        }
        return singer;
    }
}
