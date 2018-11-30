window.onload = function (){
	/**
	 * 判断昵称
	 */
	document.getElementById("uuname").onblur = function (){
		var unames = document.getElementById("unames");
		if(this.value != null && this.value.length <= 20 && this.value.length > 6){
			unames.innerHTML = "";
		}else {
			unames.innerHTML = "昵称不能为空，且输入6-20位字符";
			this.focus();
			return;
		}
	};

	/**
	 * 判断密码
	 */
	document.getElementById("password1").onblur = function (){
		var pwd1 = this.value;
		var reg = /^[a-zA-Z0-9]{6,20}$/;
		var pwds1 = document.getElementById("pwds1");
		
		
		if(reg.test(pwd1)){
			pwds1.innerHTML = "";
		}else {
			pwds1.innerHTML = "密码不能为空，且输入6-20位字符";
            this.focus();
            return;
		}
		
		
	};

	/**
	 * 确认密码
	 */
	document.getElementById("password2").onblur = function () {
		var pwd2 = this.value;
		var pwd1 = document.getElementById("password1").value;
		var pwds2 = document.getElementById("pwds2");
		if(pwd2 == pwd1){
			pwds2.innerHTML = "";
		}else {
			pwds2.innerHTML = "两次输入的密码不一致，请重新输入！";
            this.focus();
            return;
			
		}
	};
	
	
	/**
	 * 邮箱
	 */
	document.getElementById("email").onblur = function () {
		var email = this.value;
		var reg = /^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/;
		if(reg.test(email)){
			document.getElementById("emails").innerHTML = "";
		} else {
			document.getElementById("emails").innerHTML = "格式错误（youxiang123@qq.com）";
            this.focus();
            return;
		}
	};
	
	/**
	 * 电话
	 */
	/*document.getElementById("phone").onblur = function () {
		var phone = this.value;
		var reg = /^(1\d{10})|(0\d{2,3}-?\d{7,8})$/;
		if(reg.test(phone)){
			document.getElementById("phones").innerHTML = "";
		}else{
			document.getElementById("phones").innerHTML = "格式错误，请重新输入！";
            this.focus();
            return;
		}
		
	};*/

/*//用户名重复验证
    document.getElementById("account").onblur = function () {
        if(this.value=="")
        {
            document.getElementById("test").innerHTML="请输入用户名";
            this.focus();
        }else{
            //创建ajax对象
            var xmlHttp = getXHR();
            //注册状态变化监听器
            xmlHttp.onreadystatechange = function () {
                //判断请求处理情况
                if(xmlHttp.readyState == 4){
                    if(xmlHttp.status == 200){
                        document.getElementById("test").innerHTML = "<font color='red'>"+xmlHttp.responseText+"</font>";
                    }else{
                        alter("请求错误"+xmlHttp.status);
                    }
                }
            }

            //get方法
            /!*var url = "test.do?account="+this.value+"&time="+new Date().getTime();
            xmlHttp.open("get",url,true);

            xmlHttp.send();*!/

            //post方法
            //简历与服务器的连接
            var url = "test.do?time="+new Date().getTime()+"&method=user";
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
    return xmlHttp;*/
    
    
};