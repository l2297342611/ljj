<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/20
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="insert.jsp">添加</a>
<table>
    <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>价格</th>
        <th>库存</th>
        <th>生产日期</th>
        <th>保质期</th>
        <th>供应商编号</th>
        <th>图片</th>
    </tr>
    <c:forEach var="g" items="${goods}">
        <tr>
            <td>${g.goodsno}</td>
            <td>${g.goodsname}</td>
            <td>${g.price}</td>
            <td>${g.goodsunit}</td>
            <td>${g.goodsexp}</td>
            <td>${g.goodsex}</td>
            <td>${g.supplierno}</td>
            <td>${g.image}</td>
            <td>
                <a href="delete_Product.action?goodsEntity.goodsno=${g.goodsno}">删除</a>
                <a href="queryById_Product.action?goodsEntity.goodsno=${g.goodsno}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
