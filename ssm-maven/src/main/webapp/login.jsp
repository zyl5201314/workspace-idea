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
      <form id="loginForm">
     用户名：<input type="text" name="username"><br> 
     密码：<input type="text" name="userpassword"><br> 
验证码：<input type="text" name="imgcode">
	   <img src="<%=request.getContextPath()%>/user/imgCode.do" id="imgCode"> <br>
      <input type="button" onclick="login()" value="登录">   
      </form>
</body>
<script type="text/javascript">
$("#imgCode").click(function(){
	$(this).attr("src","<%=request.getContextPath()%>/user/imgCode.do?t="+new Date().getTime());
})
  function login(){
	$.ajax({
		url:"<%=request.getContextPath()%>/user/login.do",
		type:"post",
		dataType:"json",
		data:$("#loginForm").serialize(),
		success:function(data){
			if(data=="1"){
				alert("验证码失效");
			}else if(data=="2"){
				alert("验证码输入成功");
			}else{
				alert("验证码输入错误");
			}
		},error:function(){
			alert("登录失败")
		}
	})
}


</script>
</html>