<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/21
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update_Product" method="post">
    商品编号：<input type="text" name="goodsEntity.goodsno" value="${goodsEntity.goodsno}" readonly="readonly"/><br/>
    商品名称：    <input type="text" name="goodsEntity.goodsname" value="${goodsEntity.goodsname}"/><br/>
    价格：    <input type="text" name="goodsEntity.price" value="${goodsEntity.price}"/><br/>
    库存：    <input type="text" name="goodsEntity.goodsunit" value="${goodsEntity.goodsunit}"/><br/>
    生产日期：<input type="text" name="goodsEntity.goodsexp" value="${goodsEntity.goodsexp}"/><br/>
    保质期：    <input type="text" name="goodsEntity.goodsex" value="${goodsEntity.goodsex}"/><br/>
    供应商编号：    <input type="text" name="goodsEntity.supplierno" value="${goodsEntity.supplierno}"/><br/>
    图片：    <input type="text" name="goodsEntity.image" value="${goodsEntity.image}"/><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
