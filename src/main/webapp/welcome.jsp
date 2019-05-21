<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <script>
  function proxy(url, func){
    var isFirst = true,
        ifr = document.createElement('iframe'),
        loadFunc = function(){
          if(isFirst){
            ifr.contentWindow.location = 'http://a.com/cs1.html';
            isFirst = false;
          }else{
            func(ifr.contentWindow.name);
            ifr.contentWindow.close();
            document.body.removeChild(ifr);
            ifr.src = '';
            ifr = null;
          }
        };

    ifr.src = url;
    ifr.style.display = 'none';
    if(ifr.attachEvent) ifr.attachEvent('onload', loadFunc);
    else ifr.onload = loadFunc;

    document.body.appendChild(iframe);
  }
  </script>
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
<h1>SSM整合</h1>
<p>
 666
  <a href="javascript:close1()">关闭</a>
</p>
<script type="text/javascript">
//  proxy('http://www.baidu.com/', function(data){
//    console.log(data);
//  });
window.open("http://localhost:8686/SpringMVC/t.jsp");
//window.location="http://localhost:8686/SpringMVC/t.jsp";
function close1(){
  window.opener.update();
  window.close();
}
</script>
</body>
</html>