<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="com.multi.jsp.board.BoardDTO"%>
<%@page import ="com.multi.jsp.board.BoardDAO"%>

<%
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    int category = Integer.parseInt(request.getParameter("category"));

    BoardDAO dao = new BoardDAO();
    BoardDTO dto = new BoardDTO();

    dto.setTitle(title);
    dto.setContent(content);
    dto.setWriter(writer);
    dto.setCategory(category);

    int result = dao.insert(dto);
    String resultText = "게시글 등록 실패했다";
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
당신


</body>
</html>