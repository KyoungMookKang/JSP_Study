package com.multi.servlet.e_practice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/check.do")
public class Check extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String pass = request.getParameter("pass");

        String imagePath = request.getContextPath() + "/resources/img/";
        String noImagePath = imagePath + "no.JPG";
        String yesImagePath = imagePath + "ok.JPG";
        String result = "들어올 수 없습니다.<img src= '" + noImagePath + "'>";
        if (pass.equals("나는왕이다.")) {
            result = "들어오세요.<img src='" + yesImagePath + "'>";
        }
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(result);
        out.close();
    }
}