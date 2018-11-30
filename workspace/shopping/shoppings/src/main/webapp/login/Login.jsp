<%--
  Created by IntelliJ IDEA.
  User: 24511
  Date: 2018/10/19
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>

    <meta charset="utf-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/supersized.css">
    <link rel="stylesheet" href="css/style.css">

</head>

<body>

<div class="page-container">
    <h1>Login</h1>
    <form action="/login.do" method="post">
        <input type="text" name="account" class="username" placeholder="Username">
        <input type="password" name="password" class="password" placeholder="Password">
        <button type="submit">登录</button>
        <button type="button" onclick="location.href='../register/register.jsp'">注册</button>
        <div class="error"><span>+</span></div>
    </form>
</div>
    <script src="js/jquery-1.8.2.min.js"></script>
    <script src="js/supersized.3.2.7.min.js"></script>
    <script src="js/supersized-init.js"></script>
    <script src="js/scripts.js"></script>

</body>

</html>

