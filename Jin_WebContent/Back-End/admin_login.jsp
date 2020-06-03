<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>主页</title>
		<link rel="stylesheet" href="./css/bootstrap.min.css">
		<link rel="stylesheet" href="./css/login.css" />
	</head>
	<body>
		<!------------------------------------标题导航栏-------------------------------------->
		<nav class="navbar navbar-expand-md navbar-light bg-dark fixed-top">
			<div class="container">
				<img src="./images/k13.ico" style="width: 40px; height: 40px;" class="mr-3" />
				<a href="#" class="navbar-brand text-light ">Hello World</a>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item">
							<a href="#" class="nav-link active  text-light">标题1</a>
						</li>
						<li class="nav-item">
							<a href="#" class="nav-link  text-light">标题2</a>
						</li>
						<li class="nav-item">
							<a href="#" class="nav-link  text-light">标题3</a>
						</li>
						<li class="nav-item">
							<a href="#" class="nav-link disabled  text-light">标题4</a>
						</li>
					</ul>
					<form action="" class="form-inline my-2 my-md-0">
						<button class="btn btn-outline-primary my-2 my-md-0">个人主页</button>
					</form>
				</div>
			</div>
		</nav>
		<!------------------------------------中间-------------------------------------->
		<div class="content">
			<div class="row" style="height: 500px;">
				<div class="col-7" style="position: relative;">
					<img src="images/1.jpg" style="position: absolute; height: 200px; width: auto; padding: 10px; border: 1px solid #000000; left: 34%; top: 12%;" />
					<img src="images/2.jpg" style="position: absolute; height: 200px; width: auto; padding: 10px; border: 1px solid #000000; left: 37%; top: 22%;" />
					<img src="images/3.jpg" style="position: absolute; height: 200px; width: auto; padding: 10px; border: 1px solid #000000; left: 27%; top: 32%;" />
					<img src="images/4.jpg" style="position: absolute; height: 200px; width: auto; padding: 10px; border: 1px solid #000000; left: 47%; top: 32%;" />
					<img src="images/5.jpg" style="position: absolute; height: 300px; width: auto; padding: 10px; border: 1px solid #000000; left: 15%; top: 10%;" />
					<img src="images/6.jpg" style="position: absolute; height: 200px; width: auto; padding: 10px; border: 1px solid #000000; left: 47%; top: 5%;" />
					<img src="images/7.jpg" style="position: absolute; height: 200px; width: auto; padding: 10px; border: 1px solid #000000; left: 37%; top: 42%;" />

				</div>
				<div class="col-3">
					<!--登录-->
					<div class="message">
						<form class="form" action="#" method="post">
							<a class="offset-sm-4 mt-4" href="#">
								<img style="height: 20px;" src="./images/k13.ico" />
								欢迎进入poem管理界面
							</a>
							<input type="text" class="form-control mt-4" placeholder="请输入账户">
							<input type="password" class="form-control mt-4" placeholder="请输入密码">
							<button class="btn btn-primary form-control mt-4">登录</button>
							<div class="form-check mt-4">
								<input type="checkbox" class="form-check-input">
								<label class="form-check-label">记住我</label>
								<small class="offset-sm-7">
									<a href="#">
										忘记密码？
									</a>
								</small>
							</div>
						</form>
					</div>
				</div>
				<div class="col-2">

				</div>
			</div>
		</div>
		<!------------------------------------底部-------------------------------------->
		<!-- 	<div class="img">
		
	</div>
	<div class="footer">
		@2020 没有版权
	</div>	 -->
		<script src="./js/jquery-3.4.1.min.js"></script>
		<script src="./js/popper.min.js"></script>
		<script src="./js/bootstrap.js"></script>
	</body>
</html>
