<%--
  Created by IntelliJ IDEA.
  User: mbdn
  Date: 2018/10/24
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <script type="text/javascript" src="js/jquery.min.js" ></script>
    <script type="text/javascript" src="js/bootstrap.min.js" ></script>
    <style>
        body{
            background-color: lavenderblush;
        }
        .deng1 {
            color: whitesmoke;
            background-color: lightcoral;
        }

        .img {
            margin-top: 10px;
        }

        .deng2 {
            text-align: center;
        }
        .cai ul li button{
            color: white;
            font-size: 18px;
            width: 140px;
            height: 50px;
            background-color: lightcoral;
        }
    </style>
</head>
<body>
<div class="container-fluid main">
    <div class="row deng1">
        <div class="col-md-3">
            <h3>欢迎登录XX系统</h3>
        </div>
        <div class="col-md-7"></div>
        <div class="col-md-2 deng2">
            <img src="../js/img/2.jpg" width="30px" height="30px" class="img-circle img center-block" /><span style="text-align: center;">李靖</span>
        </div>
    </div>
</div>
<div class="row cai">
    <div class="col-lg-1">
        <ul class="nav nav-pills nav-stacked ">
            <li class="active">
                <button class="btn btn-default" type="button"  data-toggle="collapse" href="#collapseThree6">商品管理</button>
                <div id="collapseThree6" class="panel-collapse collapse">
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked ">
                            <li><a href="#" >查看所有商品</a>
                                <div id="goods1" class="panel-collapse collapse">

                                </div>
                            </li>
                            <li><a href="#">SVN</a></li>
                            <li><a href="#">iOS</a></li>
                            <li><a href="#">VB.Net</a></li>
                            <li><a href="#">Java</a></li>
                            <li><a href="#">PHP</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="row cai">
    <div class="col-lg-1">
        <ul class="nav nav-pills nav-stacked ">
            <li class="active">
                <button class="btn btn-default" type="button"  data-toggle="collapse" href="#collapseThree1">订单管理</button>
                <div id="collapseThree1" class="panel-collapse collapse">
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked ">
                            <li><a href="#" >Home</a></li>
                            <li><a href="#">SVN</a></li>
                            <li><a href="#">iOS</a></li>
                            <li><a href="#">VB.Net</a></li>
                            <li><a href="#">Java</a></li>
                            <li><a href="#">PHP</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="row cai">
    <div class="col-lg-1">
        <ul class="nav nav-pills nav-stacked ">
            <li class="active">
                <button class="btn btn-default" type="button"  data-toggle="collapse" href="#collapseThree2">用户信息管理</button>
                <div id="collapseThree2" class="panel-collapse collapse">
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked ">
                            <li><a href="#" >Home</a></li>
                            <li><a href="#">SVN</a></li>
                            <li><a href="#">iOS</a></li>
                            <li><a href="#">VB.Net</a></li>
                            <li><a href="#">Java</a></li>
                            <li><a href="#">PHP</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="row cai">
    <div class="col-lg-1">
        <ul class="nav nav-pills nav-stacked ">
            <li class="active">
                <button class="btn btn-default" type="button"  data-toggle="collapse" href="#collapseThree3">报表管理</button>
                <div id="collapseThree3" class="panel-collapse collapse">
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked ">
                            <li><a data-toggle="collapse" data-parent="#accordion"
                                   href="#collapseThree33" >Home</a></li>
                            <li><a href="#">SVN</a></li>
                            <li><a href="#">iOS</a></li>
                            <li><a href="#">VB.Net</a></li>
                            <li><a href="#">Java</a></li>
                            <li><a href="#">PHP</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="row cai">
    <div class="col-lg-1">
        <ul class="nav nav-pills nav-stacked ">
            <li class="active">
                <button class="btn btn-default" type="button"  data-toggle="collapse" href="#collapseThree4">商品库存管理</button>
                <div id="collapseThree4" class="panel-collapse collapse">
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked ">
                            <li><a href="#" >Home</a></li>
                            <li><a href="#">SVN</a></li>
                            <li><a href="#">iOS</a></li>
                            <li><a href="#">VB.Net</a></li>
                            <li><a href="#">Java</a></li>
                            <li><a href="#">PHP</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>
<div class="row cai">
    <div class="col-lg-1">
        <ul class="nav nav-pills nav-stacked ">
            <li class="active">
                <button class="btn btn-default" type="button"  data-toggle="collapse" href="#collapseThree5">支付管理</button>
                <div id="collapseThree5" class="panel-collapse collapse">
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked ">
                            <li><a href="#" >Home</a></li>
                            <li><a href="#">SVN</a></li>
                            <li><a href="#">iOS</a></li>
                            <li><a href="#">VB.Net</a></li>
                            <li><a href="#">Java</a></li>
                            <li><a href="#">PHP</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</div>

</body>
</html>
