package com.multi.c_file;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("날짜입력");
        String s2 = JOptionPane.showInputDialog("제목입력");
        String s3 = JOptionPane.showInputDialog("내용입력");

        FileWriter file = null;
        // 컴파일 에러, 개발자가 exception 을 해줘야함.
        try {
            file = new FileWriter(s1 + ".txt");

            file.write(s1 + "\n"); //\n이면 엔터를 넣어준다.
            file.write(s2 + "\n");
            file.write(s3 + "\n");

        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("파일 저장 중 에러발생 ");
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
