<%--
  Created by IntelliJ IDEA.
  User: mbdn
  Date: 2018/10/17
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload = function () {
            document.getElementById("uname").onblur = function () {
                if(this.value=="")
                {
                    document.getElementById("test").innerHTML="请输入用户名";
                    this.focus();
                }
                var xmlHttp = getXHR();
                xmlHttp.onreadystatechange = function () {
                    if(xmlHttp.readyState == 4){
                        if(xmlHttp.status == 200){
                                document.getElementById("test").innerHTML = "<font color='red'>"+xmlHttp.responseText+"</font>";
                        }else{
                            alter("请求错误"+xmlHttp.status);
                        }
                    }
                }
                //get方法
                /*var url = "test.do?uname="+this.value+"&time="+new Date().getTime();
                xmlHttp.open("get",url,true);

                xmlHttp.send();*/

                //post方法
                var url = "test.do?time="+new Date().getTime();
                xmlHttp.open("POST",url,true);
                xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
                xmlHttp.send("uname="+this.value);
            }
            }

        function getXHR(){
            var xmlHttp;
            try {
                xmlHttp=new XMLHttpRequest();
            }catch(e)
            {
                try{
                    xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
                }
                catch(e)
                {
                    try{
                        xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                    }
                    catch(e)
                    {
                        alert("你的浏览器不支持ajax");
                        return false;
                    }

                }

            }
            return xmlHttp;
        }

    </script>
</head>
<body>
<form id="my-form" action="/register.do">
    <div><label>用户名:</label><input id="username" name="account" type="text" onchange="teset()"/></div>
    <div><label>密码:</label><input id="pass" name="password" type="password"/></div>
    <div><label>邮箱:</label><input id="email" name="mail" data-ideal="required email" type="email"/></div>
    <div><label>出生日期:</label><input name="birth" class="datepicker" data-ideal="date" type="text" placeholder="月/日/年"/></div>
    <div><label>姓名:</label><input name="uname"  type="text"  id="uname"/><span id="test"></span></div>
    <div><label>年龄:</label><input name="age"  type="text"/></div>
    <div><label>手机号码:</label><input id="phone" name="phone" type="text"/></div>
    <div><input type="submit" value="提交"/></div>
</form>
</body>
</html>
