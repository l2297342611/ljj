window.onload = function () {
    document.getElementById("account").onblur = function () {
        if(this.value=="")
        {
            document.getElementById("test").innerHTML="请输入用户名";
            this.focus();
            return;
        }else{
        //创建ajax对象
        var xmlHttp = getXHR();
        //注册状态变化监听器
        xmlHttp.onreadystatechange = function () {
            //判断请求处理情况
            if(xmlHttp.readyState == 4){
                if(xmlHttp.status == 200){
                    document.getElementById("test").innerHTML = "<font color='red'>"+xmlHttp.responseText+"</font>";
                    this.focus();
                    return;
                }else{
                    alter("请求错误"+xmlHttp.status);
                }
            }
        }

        //get方法
        /*var url = "test.do?account="+this.value+"&time="+new Date().getTime();
        xmlHttp.open("get",url,true);

        xmlHttp.send();*/

        //post方法
        //简历与服务器的连接
        var url = "../../../test.do?time="+new Date().getTime()+"&method=user";
        xmlHttp.open("POST",url,true);
        xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
        //向服务器发送请求
        xmlHttp.send("account="+this.value);
        }
    }
}

//ajax对象的创建
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

