<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="com.multi.jsp.member.MemberDTO"%>
<%@page import ="com.multi.jsp.member.MemberDAO"%>
<%@page import="java.util.ArrayList"%>


        <!--
        jsp에서 해야하는 작업 3가지
        1) form안에 입력한 데이터 받아서 저장해두자. ==> java
        2) 받은 데이터를 DAO에게 주자.  ==> java
        3) 결과를 html로 만들자. ==> html
        -->

        <!--
            1. 데이터를 받아서 저장해두자.
            HttpServletRequest request = new HttpServletRequest(); 내장객체
            2. dao를 이용해서 데이터를 주면서 db처리해달라고 요청
            3. 요청에 대한 결과를 html을 만든다.
        -->


<%
    String id = request.getParameter("id");

    MemberDAO dao = new MemberDAO();

    MemberDTO dto = dao.one(id);

%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body{
       background: lime;
    }
    *{
       font-size: 20px;
       text-align: center;
    }
    .left {
       /* 여러개를 선택해서 지정하고 싶을 때 클래스를 사용. 클래스 중 left에 해당하는 것만 스타일을 지정해라. */
       /* 클래스 선택은 .클래스명 */
       width: 100px;
       background: blue;
       color: white;
    }
    .data {
       width: 100px;
       background: white;
       color: blue;
    }
    #bottom {
       background: red;
       color: yellow;
    }
    input{
       background: greenyellow;
    }
</style>
</head>
<body bgcolor="skyblue">
검색해온 id: <%= dto.getId() %> <br>
검색해온 pw: <%= dto.getPw()%> <br>
검색해온 name: <%= dto.getName() %> <br>
검색해온 tel: <%= dto.getTel() %> <br>

</table>
</body>
</html>