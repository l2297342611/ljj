<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/20
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/springMVC_demo03/insertPro.do" method="post" enctype="multipart/form-data">
    <%--商品编号：<input type="text" name="goodsno"/><br/>--%>
    商品名称：    <input type="text" name="goodsname"/><br/>
    价格：    <input type="text" name="price"/><br/>
    库存：    <input type="text" name="goodsunit"/><br/>
    生产日期：<input type="text" name="goodsexp"/><br/>
    保质期：    <input type="text" name="goodsex"/><br/>
    供应商编号：    <input type="text" name="supplierno"/><br/>
    图片：    <input type="file" name="images"/><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
