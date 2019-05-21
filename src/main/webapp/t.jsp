<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">
  <style type="text/css">
    form{
      margin:0px auto;

      width:500px;
      padding:20px;
    }
  </style>
  <title></title>
</head>

<body>
<h1>SSM整合111</h1>
<p>
 666
  <a href="javascript:close1()">关闭</a>
</p>
<script type="text/javascript">
  function close1(){
    window.opener.close();
    //window.parent.opener.location="http://localhost:8080/test2/test3.jsp";
    window.close();
  }


</script>
</body>
</html>