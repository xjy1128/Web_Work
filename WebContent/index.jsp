<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
		<!-- 导航二 -->
		<el-navbar class="nav_box">
			<div class="container my-4">
				<ul class="nav nav-pills">
					<li class="nav-item dropdown">
						<a href="#" class="btn btn-outline-info dropdown-toggle mr-2" data-toggle="dropdown">古诗词</a>
						<div class="dropdown-menu">
							<a href="tang_poem_list.html" class="dropdown-item">
								唐诗
								<span class="badge badge-info">20</span>
							</a>
							<a href="#" class="dropdown-item">
								宋词
								<span class="badge badge-info">25</span>
							</a>
							<a href="#" class="dropdown-item">
								元曲
								<span class="badge badge-info">26</span>
							</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a href="#" class="btn btn-outline-info dropdown-toggle mr-2" data-toggle="dropdown">成语故事</a>
						<div class="dropdown-menu">
							<a href="#" class="dropdown-item">
								典故
								<span class="badge badge-info">20</span>
							</a>
							<a href="#" class="dropdown-item">
								生肖
								<span class="badge badge-info">25</span>
							</a>
							<a href="#" class="dropdown-item">
								数字
								<span class="badge badge-info">26</span>
							</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a href="#" class="btn btn-outline-info dropdown-toggle mr-2" data-toggle="dropdown">名人名言</a>
						<div class="dropdown-menu">
							<a href="#" class="dropdown-item">
								国内
								<span class="badge badge-info">25</span>
							</a>
							<a href="#" class="dropdown-item">
								国外
								<span class="badge badge-info">26</span>
							</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a href="#" class="btn btn-outline-info mr-2">名著推荐</a>
					</li>
					<li class="nav-item dropdown">
						<a href="#" class="btn btn-outline-info dropdown-toggle mr-2" data-toggle="dropdown">现代诗</a>
						<div class="dropdown-menu">
							<a href="#" class="dropdown-item">
								分类1
								<span class="badge badge-info">25</span>
							</a>
							<a href="#" class="dropdown-item">
								分类2
								<span class="badge badge-info">26</span>
							</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a href="#" class="btn btn-outline-info">创作园地</a>
					</li>
				</ul>
			</div>
		</el-navbar>
		<!-- 主体部分 -->
		<el-main>
			<!-- 广告招商 -->
			<div class="side_adv">
				<img src="./images/model/adv.jpg" style="float: right;" />
			</div>
			<!-- 侧边栏 -->
			<div class="side_card">
				<div class="card" style="width: 18rem;">
					<img src="./images/model/corousel1.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's
							content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
				<div class="card mt-3" style="width: 18rem;">
					<img src="./images/model/corousel2.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's
							content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
			<!-- 主体各个卡片 -->
			<div class="container">
				<!-- 图片展示区域 -->
				<div class="row" id="show_img">
					<!-- 左轮播图 -->
					<div class="col-4">
						<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel" data-interval="3000">
							<ol class="carousel-indicators">
								<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
								<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
								<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
								<li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
							</ol>
							<div class="carousel-inner">
								<div class="carousel-item active">
									<img src="./images/model/corousel1.jpg" class="d-block w-100" alt="...">
								</div>
								<div class="carousel-item">
									<img src="./images/model/corousel2.jpg" class="d-block w-100" alt="...">
								</div>
								<div class="carousel-item">
									<img src="./images/model/corousel3.jpg" class="d-block w-100" alt="...">
								</div>
								<div class="carousel-item">
									<img src="./images/model/corousel4.jpg" class="d-block w-100" alt="...">
								</div>
							</div>
							<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
								<span class="carousel-control-prev-icon" aria-hidden="true"></span>
								<span class="sr-only">Previous</span>
							</a>
							<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
								<span class="carousel-control-next-icon" aria-hidden="true"></span>
								<span class="sr-only">Next</span>
							</a>
						</div>
					</div>
					<!-- 右8个盒子 -->
					<div class="row col-8">
						<div class="col-3" style="height: 100px;">
							<img src="./images/model/author.jpg" style=" height: 100px; width: 100%;" />
							<b style="padding-left: 40px;">唐宋八大家</b>
						</div>
						<div class="col-3">
							<img src="./images/model/tianyuan.jpg" style=" height: 100px; width: 100%" />
							<b style="padding-left: 60px;">诗派</b>
						</div>
						<div class="col-3">
							<img src="./images/model/cipai.jpg" style=" height: 100px; width: 100%;" />
							<b style="padding-left: 60px;">词牌</b>
						</div>
						<div class="col-3 pr-0">
							<img src="./images/model/yuanqu.jpg" style=" height: 100px; width: 100%;" />
							<b style="padding-left: 50px;">元曲简介</b>
						</div>
						<div class="col-3" style="height: 100px;">
							<img src="./images/model/honglow.jpg" style=" height: 100px; width: 100%;" />
							<b style="padding-left: 40px;">红楼梦简介</b>
						</div>
						<div class="col-3">
							<img src="./images/model/chengyu.jpg" style=" height: 100px; width: 100%;" />
							<b style="padding-left: 40px;">趣味成语</b>
						</div>
						<div class="col-3">
							<img src="./images/model/jingjv.jpg" style=" height: 100px; width: 100%;" />
							<b style="padding-left: 40px;">名言警句</b>
						</div>
						<div class="col-3 pr-0">
							<img src="./images/model/aiqingg.jpg" style=" height: 100px; width: 100%;" />
							<b style="padding-left: 40px;">现代诗人</b>
						</div>
					</div>
				</div>
				<!-- 唐诗+宋词 -->
				<div class="row" id="show_message1">
					<!-- 面包屑导航 -->
					<nav class="bread_left" aria-label="breadcrumb" style="width: 47%;">
						<ol class="breadcrumb badge-info">
							<li class="breadcrumb-item active" aria-current="page"><b>唐诗</b></li>
							<li style="margin-left: 80%;"><a href="#"><b>更多>></b></a></li>
						</ol>
					</nav>
					<!-- 面包屑导航 -->
					<nav class="bread_right" aria-label="breadcrumb" style="width: 47%;">
						<ol class="breadcrumb badge-info">
							<li class="breadcrumb-item active" aria-current="page"><b>宋词</b></li>
							<li style="margin-left: 80%;"><a href="#"><b>更多>></b></a></li>
						</ol>
					</nav>
					<!-- 唐诗 -->
					<div class="card card_left" style="width: 47%;">
						<div class="card-body">
							<li class="card-text list-unstyled"><a href="#">《静夜思》···························· 李白</a></li>
							<li class="card-text list-unstyled"><a href="#">《静夜思》···························· 李白</a></li>
							<li class="card-text list-unstyled"><a href="#">《静夜思》···························· 李白</a></li>
							<li class="card-text list-unstyled"><a href="#">《静夜思》···························· 李白</a></li>
							<li class="card-text list-unstyled"><a href="#">《静夜思》···························· 李白</a></li>
							<li class="card-text list-unstyled"><a href="#">《静夜思》···························· 李白</a></li>
							<li class="card-text list-unstyled"><a href="#">《静夜思》···························· 李白</a></li>
							<li class="card-text list-unstyled"><a href="#">《静夜思》···························· 李白</a></li>
						</div>
					</div>
					<!-- 宋词 -->
					<div class="card card_right" style="width: 47%;">
						<div class="card-body">
							<li class="card-text list-unstyled"><a href="#">《水调歌头》···························· 苏轼</a></li>
							<li class="card-text list-unstyled"><a>《水调歌头》···························· 苏轼</a></li>
							<li class="card-text list-unstyled"><a>《水调歌头》···························· 苏轼</a></li>
							<li class="card-text list-unstyled"><a>《水调歌头》···························· 苏轼</a></li>
							<li class="card-text list-unstyled"><a>《水调歌头》···························· 苏轼</a></li>
							<li class="card-text list-unstyled"><a>《水调歌头》···························· 苏轼</a></li>
							<li class="card-text list-unstyled"><a>《水调歌头》···························· 苏轼</a></li>
							<li class="card-text list-unstyled"><a>《水调歌头》···························· 苏轼</a></li>
							<li class="card-text list-unstyled"><a>《水调歌头》···························· 苏轼</a></li>
						</div>
					</div>
				</div>
				<!-- 成语故事+名人名言 -->
				<div class="row" id="show_message2">
					<!-- 面包屑导航 -->
					<nav class="bread_left" aria-label="breadcrumb" style="width: 47%;">
						<ol class="breadcrumb badge-info">
							<li class="breadcrumb-item active" aria-current="page"><b>成语故事</b></li>
							<li style="margin-left: 70%;"><a href="#"><b>更多>></b></a></li>
						</ol>
					</nav>
					<!-- 面包屑导航 -->
					<nav class="bread_right" aria-label="breadcrumb" style="width: 47%;">
						<ol class="breadcrumb badge-info">
							<li class="breadcrumb-item active" aria-current="page"><b>名人名言</b></li>
							<li style="margin-left: 70%;"><a href="#"><b>更多>></b></a></li>
						</ol>
					</nav>
					<!-- 成语故事 -->
					<div class="card card_left" style="width: 47%;">
						<div class="card-body">
							<li class="card-text list-unstyled"><a href="#">画蛇添足：画蛇时给蛇添上脚。比喻做了多余的事，非但无益...</a></li>
							<li class="card-text list-unstyled"><a href="#">画蛇添足：画蛇时给蛇添上脚。比喻做了多余的事，非但无益...</a></li>
							<li class="card-text list-unstyled"><a href="#">画蛇添足：画蛇时给蛇添上脚。比喻做了多余的事，非但无益...</a></li>
							<li class="card-text list-unstyled"><a href="#">画蛇添足：画蛇时给蛇添上脚。比喻做了多余的事，非但无益...</a></li>
							<li class="card-text list-unstyled"><a href="#">画蛇添足：画蛇时给蛇添上脚。比喻做了多余的事，非但无益...</a></li>
							<li class="card-text list-unstyled"><a href="#">画蛇添足：画蛇时给蛇添上脚。比喻做了多余的事，非但无益...</a></li>
							<li class="card-text list-unstyled"><a href="#">画蛇添足：画蛇时给蛇添上脚。比喻做了多余的事，非但无益...</a></li>
						</div>
					</div>
					<!-- 名人名言 -->
					<div class="card card_right" style="width: 47%;">
						<div class="card-body">
							<li class="card-text list-unstyled"><a href="#">为中华之崛起而读书------周恩来</a></li>
							<li class="card-text list-unstyled"><a href="#">为中华之崛起而读书------周恩来</a></li>
							<li class="card-text list-unstyled"><a href="#">为中华之崛起而读书------周恩来</a></li>
							<li class="card-text list-unstyled"><a href="#">为中华之崛起而读书------周恩来</a></li>
							<li class="card-text list-unstyled"><a href="#">为中华之崛起而读书------周恩来</a></li>
							<li class="card-text list-unstyled"><a href="#">为中华之崛起而读书------周恩来</a></li>
							<li class="card-text list-unstyled"><a href="#">为中华之崛起而读书------周恩来</a></li>
							<li class="card-text list-unstyled"><a href="#">为中华之崛起而读书------周恩来</a></li>
						</div>
					</div>
				</div>
				<!-- 现代诗歌 -->
				<div class="row" id="show_message3">
					<!-- 面包屑导航 -->
					<nav class="bread_left" aria-label="breadcrumb" style="width: 99%;">
						<ol class="breadcrumb badge-info">
							<li class="breadcrumb-item active" aria-current="page"><b>现代诗歌</b></li>
							<li style="margin-left: 86%;"><a href="#"><b>更多>></b></a></li>
						</ol>
					</nav>
					<!-- 卡片 -->
					<div class="card card_left" style="width: 99%;">
						<div class="card-body">
							<p>
								<pre>
							轻轻的我走了，
							
							正如我轻轻的来；
							
							我轻轻的招手，
							
							作别西天的云彩。
							
							那河畔的金柳，
							
							是夕阳中的新娘；
							
							波光里的艳影，
							
							在我的心头荡漾。
							
							软泥上的青荇，
							
							油油的在水底招摇；
							
							在康桥的柔波里，
							
							我甘心做一条水草！
							</pre>
							</p>
						</div>
					</div>
				</div>
				<!-- 名著推荐 -->
				<div class="row" id="show_message4">
					<!-- 面包屑道航 -->
					<nav class="bread_left" aria-label="breadcrumb" style="width: 99%;">
						<ol class="breadcrumb badge-info">
							<li class="breadcrumb-item active" aria-current="page"><b>名著推荐</b></li>
							<li style="margin-left: 86%;"><a href="#"><b>更多>></b></a></li>
						</ol>
					</nav>
					<!-- 卡片视图 -->
					<div class="card" style="width: 23%; border: 1px solid #000000;">
						<img src="./images/model/tuijian1.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">《假如给我三天光明》</h5>
							<p class="card-text">盲聋人海伦凯勒不凡的一生.</p>
						</div>
					</div>
					<div class="card ml-4" style="width: 23%; border: 1px solid #000000;">
						<img src="./images/model/tuijian2.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">《鲁宾逊漂流记》</h5>
							<p class="card-text">推荐语</p>
						</div>
					</div>
					<div class="card ml-4" style="width: 23%; border: 1px solid #000000;">
						<img src="./images/model/tuijian3.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">《追风筝的人》</h5>
							<p class="card-text">推荐语</p>
						</div>
					</div>
					<div class="card ml-4" style="width: 23%; border: 1px solid #000000;">
						<img src="./images/model/tuijian4.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">《泰戈尔诗选》</h5>
							<p class="card-text">推荐语</p>
						</div>
					</div>
				</div>
			</div>
		</el-main>
		<!-- 页脚 -->
		<div class="footer">
			@版权
		</div>
		<script src="./js/model/jquery-3.4.1.min.js"></script>
		<script src="./js/model/popper.min.js"></script>
		<script src="./js/model/bootstrap.js"></script>
	</body>
</html>
