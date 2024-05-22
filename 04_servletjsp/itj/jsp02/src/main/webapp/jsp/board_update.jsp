<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="com.multi.jsp.board.BoardDTO"%>
<%@page import ="com.multi.jsp.board.BoardDAO"%>

<%
    String title = request.getParameter("title");
    String content = request.getParameter("content");

    BoardDAO dao = new BoardDAO();
    BoardDTO dto = new BoardDTO();

    dto.setTitle(title);
    dto.setContent(content);

    int result = dao.update(title, content);
    String resultText = "게시글 수정 실패했다";
    if(result == 1){
        resultText = "게시글 수정 성공했다.";
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

    게시글 수정  요청내용확인
    <hr color="red">
    작성한 title : <%= title %> <br>
    작성한 content : <%= content %> <br>


</body>
</html>