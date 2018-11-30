<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/18
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="">添加</a>
<table>
    <tr>
        <td>1</td>
        <td>2</td>
        <td>3</td>
        <td>4</td>
        <td>5</td>
        <td>6</td>
        <td>7</td>
        <td>操作</td>
        <td>商品图片</td>
    </tr>
    <c:forEach var="g" items="${page.arrys}">
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
                <a href="">删除</a>
                <a href="">修改</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="5">
            一共有${page.totalCount}条记录，共${page.totalpage}页数,当前[${page.curenPage}/${page.totalpage}]页
            <a href="query_goods.do?pageNo=${page.firstpage}">首页</a>
            <a href="query_goods.do?pageNo=${page.prePage}">上一页</a>
            <c:forEach var="index" begin="1" end="${page.totalpage}" step="1">
                <a href="query_goods.do?pageNo=${index}">${index}</a>
            </c:forEach>
            <a href="query_goods.do?pageNo=${page.nextpage}">下一页</a>
            <a href="query_goods.do?pageNo=${page.lastpage}">尾页</a>
        </td>
    </tr>
</table>

</body>
</html>
