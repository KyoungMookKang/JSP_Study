package com.multi.c_crawling;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Exec01 {
    public static void main(String[] args) {
        //크롤링 순서
        //1. 사이트 연결
        //2. 해당 페이지 다운로드(html)
        //3. 원하는 위치의 정보를 추출해냄

        Connection con = Jsoup.connect("https://www.naver.com/");
        System.out.println("1. 사이트 연결 성공입니다.");

        Document doc = null;
        try{
            doc = con.get();
            System.out.println("2. 해당 페이지 다운로드 성공입니다.");
            System.out.println("--------------------");
            System.out.println(doc);
            System.out.println("3. 원하는 위치의 정보를 추출 성공!!");
            Elements list = doc.select("a");
            System.out.println(list.size());

            for(int i = 0; i < list.size(); i++){

                Element tag = list.get(i);
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Document doc1 = Jsoup.connect("https://news.naver.com/").get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
