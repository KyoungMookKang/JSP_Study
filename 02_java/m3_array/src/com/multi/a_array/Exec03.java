package com.multi.a_array;

public class Exec03 {
    public static void main(String[] args) {

        String[] name = new String[2];

        name[0] = "카리나";
        name[1] = "신세경";

        for (String s : name){
            System.out.println(s);
        }
        System.out.println("개수 : " + name.length);

        String[] names2;
        names2 = new String[]{"ab", "b"};

        System.out.println(names2[0].length());

        int[] nArr2 = new int[5];
        nArr2[0] = 100;
        nArr2[2] = 200;
        nArr2[4] = 500;
        System.out.println(nArr2);
        for (int i = 0; i < nArr2.length; i++) {
            System.out.println(nArr2[i]);
        }
    }
}
