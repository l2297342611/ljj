<%--
  Created by IntelliJ IDEA.
  User: mbdn
  Date: 2018/10/22
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function myReload() {
            document.getElementById("CreateCheckCode").src = document
                    .getElementById("CreateCheckCode").src
                + "?nocache=" + new Date().getTime();
        }
    </script>
</head>
<body>
<body>
<form action="check.do" method="post">
    <input name="code" type="text" id="checkCode" title="不区分大小写"
           size="8" ,maxlength="4" />
    <img src="checkcode.do" id="CreateCheckCode" align="middle">
    <a href="" onclick="myReload()"> 看不清,换一个</a>
    <input type="submit" value="提交" />
</form>
</body>
</body>
</html>
