<%--
  Created by IntelliJ IDEA.
  User: mbdn
  Date: 2018/10/19
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="upload.do" method="post" enctype="multipart/form-data">
    选择图片：<input id="file" name="file" type="file"/>
    <input type="submit" value="上传"/>
</form>
${path}
<img src="/img/${path}"/>
<c:if test="${not empty errorMessage}">
    <input type="text" id="errorMessage" value="${errorMessage}" style="color:red;" disabled="disabled">
</c:if>
</body>
</html>
