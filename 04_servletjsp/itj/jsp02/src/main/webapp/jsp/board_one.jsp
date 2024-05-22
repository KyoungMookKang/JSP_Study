<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="com.multi.jsp.board.BoardDTO"%>
<%@page import ="com.multi.jsp.board.BoardDAO"%>

<%
    String title = request.getParameter("title");

    BoardDAO dao = new BoardDAO();

    BoardDTO dto = dao.one(title);

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
검색해온 제목: <%= dto.getTitle() %> <br>
검색해온 내용: <%= dto.getContent()%> <br>
검색해온 작성자: <%= dto.getWriter() %> <br>
검색해온 분류: <%= dto.getCategory() %> <br>
검색해온 번호: <%= dto.getNo() %> <br>


</body>
</html>