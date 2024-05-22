<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
        session.setAttribute("tennis", 10000);
        session.setAttribute("swim", 20000);
    %>
   <!DOCTYPE html>
   <html>
   <head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   </head>
   <body>

   저장된 세션값은<br>
   테니스 : <%= session.getAttribute("tennis") %> <br>
   수영 : <%= session.getAttribute("swim") %> <br>

   <a href="session2.jsp">세션 설정 보기</a>
   </body>
   </html>