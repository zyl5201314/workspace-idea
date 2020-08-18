<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <a href="<%=request.getContextPath()%>/addUser.jsp">新增</a>
      <table  border="1">
        <tr>
          <td>userId</td>
          <td>username</td>
          <td>userpassword</td>
          <td>userbir</td>
          <td>userprice</td>
          <td>操作</td>
        </tr>
      <c:forEach items="${list }" var="u">
        <tr>
          <td>${u.userid }</td>
          <td>${u.username }</td>
          <td>${u.userpassword }</td>
          <td>${u.userbir }</td>
          <td>${u.userprice }</td>
          <td><a href="<%=request.getContextPath()%>/user/queryUserById.do?userid=${u.userid }">修改</a></td>
        </tr>
      </c:forEach>  
      </table>
      <jsp:include page="/common/page.jsp"></jsp:include>
</body>
</html>