<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<body>
     <form id="addForm">
  用户名：<input type="text" name="username"><br>   
 密码：<input type="text" name="userpassword"> <br>  
 时间：<input type="date" name="userbir"> <br>
 工资：<input type="text" name="userprice"> <br>  
 <input type="button" onclick="addUser()" value="新增">
     </form>
</body>
<script type="text/javascript">
   function addUser(){
	   $.ajax({
		   url:"<%=request.getContextPath()%>/user/addUSer.do",
		   type:"post",
		   data:$("#addForm").serialize(),
		   success:function(){
			   alert("新增成功")
		   },error:function(){
			   alert("新增失败");
		   }
	   })
   }



</script>
</html>