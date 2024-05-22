package com.multi.a_calssmake;

public class Television {
    private int ch;
    private int vol;
    private boolean onOff;

    // on 켜지다 off 꺼지다
    
    public void 채널을바꾸다(){
        int change = 1;
        System.out.println(ch + change + "채널 변경");
    }

    public void 볼륨조절(){
        System.out.println(vol + "볼륨 조절");
    }

   
}
