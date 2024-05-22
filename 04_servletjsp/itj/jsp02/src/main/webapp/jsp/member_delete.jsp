<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="com.multi.jsp.member.MemberDAO"%>



        <!--
        jsp에서 해야하는 작업 3가지
        1) form안에 입력한 데이터 받아서 저장해두자. ==> java
        2) 받은 데이터를 DAO에게 주자.  ==> java
        3) 결과를 html로 만들자. ==> html
                 -->
<%
    String id = request.getParameter("id");

    MemberDAO dao = new MemberDAO();

    int result = dao.delete(id);

    String resultText = "회원삭제 실패했다";

    if(result == 1){
        resultText = "회원삭제 성공했다";
    }
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%= resultText %>
    탈퇴를 원하는 id는  <%= id %>



</body>
</html>