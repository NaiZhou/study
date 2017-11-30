<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0056)http://v3.bootcss.com/examples/navbar-fixed-top/#contact -->
<html lang="zh-CN">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="http://v3.bootcss.com/favicon.ico">

		<title>关系图查询系统</title>

		<!-- Bootstrap core CSS -->
		<link href="css/bootstrap.min.css" rel="stylesheet">

		<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
		<script src="js/jquery-3.2.1.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/echarts.min.js"></script>
		<script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
		<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	</head>
	<style type="text/css">
		body {
			background-color: #ebebeb;
		}
	</style>
	<body>
		<p hidden id="str" name="resultStr"><%=request.getSession().getAttribute("result")%></p>
		<!-- Fixed navbar -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">

					<a class="navbar-brand">关系图查询系统</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li >
							<a href="index.html">首页</a>
						</li>
						<li>
							<a href="srchByName.html">查人物</a>
						</li>
						<li>
							<a href="srchRel.html">查关系</a>
						</li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</nav>
		<header class="main_header" style="margin-top: 50px;background: url(img/bg1.jpg);height: 300px;">
			<!-- Main component for a primary marketing message or call to action -->
			<div class="container">
				<div class="col-md-12" style="margin-top: 100px;margin-bottom: 10px;">
					<h1 class="text-center" style="font-family:STHupo;color: white;font-size: 50px;">关系图查询系统</h1>
				</div>
				<p class="text-center" style="color: white;font-size: 17px;">结果页</p>
				<br />
			</div>

		</header>
		<div class="container">
			
			<div class="col-md-7" style="margin-top:20px;box-shadow:0px 0px 10px 1px #c8c8c8;height: 700px; background-color:#D1EEEE;border-radius:10px">
				<div id="main" style="width: 100%;height: 100%;">
				</div>
				<script src="js/mian04.js" charset="utf-8"></script>
			</div>
			<div class="col-md-4 col-md-offset-1" style="margin-top:20px;box-shadow:1px 0px 10px 1px #c8c8c8;height: 700px; background-color:#D1EEEE;border-radius:10px">
				<div  >
				
				</div>
				<div  id="main_1" style="width:100%;line-height: 200%;font-size: 16px;font-weight: 700;word-wrap:break-word; 
word-break:break-all;">
					
				</div>
			</div>
		</div>
		<!-- /container -->
		<div style="margin-top: 20px;background: url(img/bg1.jpg);height: 100px;">
		</div>
		<!-- /container -->
	</body>

</html>