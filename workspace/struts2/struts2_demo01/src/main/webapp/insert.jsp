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
<form action="insert_Product" method="post">
    BookName：<input type="text" name="goodsEntity.goodsno"/><br/>
    ISBN：    <input type="text" name="goodsEntity.goodsname"/><br/>
    PRICE：    <input type="text" name="goodsEntity.price"/><br/>
    STOCK：    <input type="text" name="goodsEntity.goodsunit"/><br/>
    BookName：<input type="text" name="goodsEntity.goodsexp"/><br/>
    ISBN：    <input type="text" name="goodsEntity.goodsex"/><br/>
    PRICE：    <input type="text" name="goodsEntity.supplierno"/><br/>
    STOCK：    <input type="text" name="goodsEntity.image"/><br/>
    <input type="submit" value="submit">
</form>
</body>
</html>
