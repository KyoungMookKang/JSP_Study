package com.multi.b_app01;

import javax.swing.*;

public class Exec01 {
    public static void main(String[] args) {

        int [] score = new int[5];
        int[] jumsu=new int[5];
        int sum=0;
        for(int i=0;i < score.length;i++){
            String data= JOptionPane.showInputDialog("점수입력");
            score[i]=Integer.parseInt(data);
            System.out.println(i+"-->"+score[i]);

        }
        for (int i:score){
            sum+=i;
        }
        System.out.println("총합 "+sum);

    }
}
