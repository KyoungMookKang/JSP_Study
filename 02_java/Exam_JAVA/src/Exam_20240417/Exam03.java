package Exam_20240417;

import java.util.Date;

public class Exam03 {
    public static void main(String[] args) {

        Date date = new Date();

        int hour = date.getHours();

        if(hour < 11){
            System.out.println("굿모닝");
        } else if (hour < 19 || hour >= 15) {
            System.out.println("굿 애프터눈");
        } else{
            System.out.println("굿 나잇");
        }


        for(int i=0; i<12; i++){
            Date someday = new Date(2023, i, 0);
            int month = i == 0 ? 12 : i;
            System.out.println(month+"월은 "+ someday.getDate()+ "까지");
        }

    }
}
