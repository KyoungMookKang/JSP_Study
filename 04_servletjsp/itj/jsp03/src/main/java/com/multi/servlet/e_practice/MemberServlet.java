package com.multi.servlet.e_practice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insert")
public class MemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String religion = request.getParameter("religion");
        String introduction = request.getParameter("introduction");
        String[] hobby = request.getParameterValues("hobby");

        String result = " ";
        for(String s:hobby)

        System.out.println("forward 테스트를 시작하지");

        response.sendRedirect("redirect?id=" + id);
    }
}