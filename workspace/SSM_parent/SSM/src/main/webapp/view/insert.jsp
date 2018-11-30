<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/29
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="../pro/insertPro.do" method="post">
    <div style="display: none">商品编号：<input type="text" name="goodsno" value="${goods.goodsno}"/></div>
    商品名称：    <input type="text" name="goodsname" value="${goods.goodsname}"/><br/>
    价格：    <input type="text" name="price" value="${goods.price}"/><br/>
    库存：    <input type="text" name="goodsunit" value="${goods.goodsunit}"/><br/>
    生产日期：<input type="text" name="goodsexp" value="${goods.goodsexp}"/><br/>
    保质期：    <input type="text" name="goodsex" value="${goods.goodsex}"/><br/>
    供应商编号：    <input type="text" name="supplierno" value="${goods.supplierno}"/><br/>
    图片：    <input type="text" name="image" value="${goods.image}"/><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
