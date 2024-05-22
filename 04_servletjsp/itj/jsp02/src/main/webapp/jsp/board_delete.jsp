<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="com.multi.jsp.board.BoardDTO"%>
<%@page import ="com.multi.jsp.board.BoardDAO"%>

<%
    int no = Integer.parseInt(request.getParameter("no"));

    BoardDAO dao = new BoardDAO();

    int result = dao.delete(no);
    String resultText = "게시글 삭제 실패했다";
    if(result == 1){
        resultText = "게시글 등록 성공했다.";
    }
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=resultText%><br>
당신이 삭제를 원하는 번호는 <%=no%>


</body>
</html>