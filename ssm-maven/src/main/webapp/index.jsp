<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<body>
   <form id="queryForm">
   用户名：<input type="text" name="username"> <br>
   <input type="button" onclick="search(1)" value="查询">
   <input type="text" id="cuurtPage" name="cpage">
    <div id="showUser">
    </div>
    
    </form>
</body>
<script type="text/javascript">
  $(function(){
	  search(1);
  })
 function search(cpage){
	  $("#cuurtPage").val(cpage);
	  $.ajax({
		  url:"<%=request.getContextPath()%>/user/queryUserList.do",
		  type:"post",
		  data:$("#queryForm").serialize(),
		  dataType:"html",
		  success:function(data){
			  $("#showUser").html(data);
		  },error:function(){
			  alert("失败");
		  }
	  })
  }
</script>
</html>