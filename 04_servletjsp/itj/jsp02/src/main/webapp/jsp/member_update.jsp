<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="com.multi.jsp.member.MemberDTO"%>
<%@page import ="com.multi.jsp.member.MemberDAO"%>

<%
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");

    MemberDAO dao = new MemberDAO();
    MemberDTO dto = new MemberDTO();

    dto.setId(id);
    dto.setTel(tel);

    int result = dao.update(id, tel);

    String resultText = "회원수정 실패했다";

    if(result == 1){
        resultText = "회원수정 성공했다";
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

    회원수정  요청내용확인
    <hr color="red">
    가입한 id : <%= id %> <br>
    가입한 tel : <%= tel %> <br>

</body>
</html>