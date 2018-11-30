<%--
  Created by IntelliJ IDEA.
  User: mbdn
  Date: 2018/10/22
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--
作者：2451132069@qq.com
时间：2018-10-17
描述：注册页面
-->
<html>

<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="css/register.css" />
    <script type="text/javascript" src="js/register.js" ></script>
    <%--<script type="text/javascript" src="js/test.js"></script>--%>

    <script>
        function myReload() {
            document.getElementById("CreateCheckCode").src = document
                    .getElementById("CreateCheckCode").src
                + "?nocache=" + new Date().getTime();
        }
    </script>
</head>
<body>
<div>
    <div align="center" class="title">
        <span><b>注册用户</b></span>
    </div>
    <form id="my-form" action="/register.do" method="post">
        <table>
            <tr>
                <td width="80px">昵称:</td>
                <td width="280px"><input class="t_color" id="uuname" name="uname" type="text" /></td>
                <td id="unames" class="td3" width="260px"></td>
            </tr>
            <tr>
                <td>出生日期:</td>
                <td><input id="date" name="birth" class="datepicker" data-ideal="date" type="date" placeholder="月/日/年" /></td>
                <td id="" class="td3"></td>
            </tr>
            <tr>
                <td>账号:</td>
                <td><input id="account" class="t_color" name="account" type="text" /></td>
                <td id="test" class="td3" name="test"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input id="password1" class="t_color" name="password" type="password" /></td>
                <td id="pwds1" class="td3"></td>
            </tr>
            <tr>
                <td>确认密码:</td>
                <td><input id="password2" class="t_color" name="password" type="password" /></td>
                <td id="pwds2" class="td3"></td>
            </tr>
            <tr>
                <td>邮箱:</td>
                <td><input id="email" class="t_color" name="mail" value="youxiang123@qq.com" type="text" /></td><!--data-ideal="required email"  type="email"-->
                <td id="emails" class="td3"></td>
            </tr>
            <tr>
                <td>验证码：</td>
                <td><input name="code" type="text" id="checkCode" title="不区分大小写"
                           size="8" ,maxlength="4" />
                </td><!--data-ideal="phone"-->
                <td id="check" class="td3"><img src="/checkcode.do" id="CreateCheckCode" align="middle"><a href="javascript:myReload()"> 看不清,换一个</a></td>
            </tr>
        </table>
        <div class="hr">
            <hr/>
        </div>

        <div class="but">
            <button type="submit">提交</button>
            <button id="reset" type="button">重置</button>
        </div>
    </form>
</div>
</body>
</html>
