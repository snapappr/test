<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<!--  App Title  -->
	<title>Stock3P - a fantastic app for stock monitoring and alert</title>
	<!--  App Description  -->
	<meta name="description" content="Stock3P is a fantastic app for stock monitoring and alert."/>
	<meta charset="utf-8">
	<meta name="author" content="pixelhint.com">
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0" />

	<link rel="stylesheet" type="text/css" href="/static/resources/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="/static/resources/css/owl.transitions.css"/>
	<link rel="stylesheet" type="text/css" href="/static/resources/css/owl.carousel.css"/>
	<link rel="stylesheet" type="text/css" href="/static/resources/css/animate.css"/>
	<link rel="stylesheet" type="text/css" href="/static/resources/css/main.css"/>

	
	<script type="text/javascript" src="/static/resources/js/jquery.js"></script>
	<script type="text/javascript" src="/static/resources/js/ajaxchimp.js"></script>
	<script type="text/javascript" src="/static/resources/js/scrollTo.js"></script>
	<script type="text/javascript" src="/static/resources/js/owl.carousel.min.js"></script>
	<script type="text/javascript" src="/static/resources/js/wow.js"></script>
	<script type="text/javascript" src="/static/resources/js/parallax.js"></script>
	<script type="text/javascript" src="/static/resources/js/nicescroll.js"></script>
	<script type="text/javascript" src="/static/resources/js/main.js"></script>
</head>
<body>
	
	<!--  Header Section  -->
	<header>
		<div class="container">
			<div class="logo pull-left animated wow fadeInLeft">
				<img src="/static/resources/img/logo.png" alt="" title="">
			</div>

			
			<nav class="pull-left">
				<ul class="list-unstyled">
					<li class="animated wow fadeInLeft" data-wow-delay="0s"><a href="#about">About</a></li>
					<li class="animated wow fadeInLeft" data-wow-delay=".1s"><a href="#app_features">Features</a></li>
					<li class="animated wow fadeInLeft" data-wow-delay=".2s"><a href="#testimonials">Testimonials</a></li>
				</ul>
			</nav>
<!--
			<div class="social pull-right">
				<ul class="list-unstyled">
					<li class="animated wow fadeInRight" data-wow-delay=".2s"><a href="#"><img src="/static/resources/img/facebook.png" alt="" title=""></a></li>
					<li class="animated wow fadeInRight" data-wow-delay=".1s"><a href="#"><img src="/static/resources/img/twitter.png" alt="" title=""></a></li>
					<li class="animated wow fadeInRight" data-wow-delay="0s"><a href="#"><img src="/static/resources/img/google.png" alt="" title=""></a></li>
				</ul>
			</div>
-->
			<span class="burger_icon">menu</span>
		</div>
	</header>
	<!--  End Header Section  -->






	<!--  Hero Section  -->
	<section class="hero" id="hero">
		<div class="container">
			<div class="caption">
				<h1 class="text-uppercase  animated wow fadeInLeft">Stock Alert App in an intelligent way</h1>
				<p class="text-lowercase  animated wow fadeInLeft">With only your smart phone and Stock3P you can save lot of effort and time in stock monitoring.</p>
<!--
				<a href="https://play.google.com/store/apps/details?id=com.sunrises.stockwatch" class="app_store_btn text-uppercase animated wow fadeInLeft">
					<i class="iphone_icon"></i>
					<span>Iphone App</span>
				</a>
-->
				<a href="https://play.google.com/store/apps/details?id=com.sunrises.stockwatch" class="app_store_btn text-uppercase animated wow fadeInLeft">
					<i class="android_icon"></i>
					<span>Android App</span>
				</a>
			</div>			
		</div>
	</section>
	<!--  End Hero Section  -->






	<!--  Featured On Section  
	<section class="featured_on">
		<div class="container">
		<ul class="list-unstyled text-center clearfix">
				<li class="col-xs-6 col-sm-6 col-md-3 animated wow fadeInDown">
					<img src="/static/resources/img/google_logo.png" alt="" title="">
				</li>
				<li class="col-xs-6 col-sm-6 col-md-3 animated wow fadeInDown" data-wow-delay=".2s">
					<img src="/static/resources/img/facebook_logo.png" alt="" title="">
				</li>
				<li class="col-xs-6 col-sm-6 col-md-3 animated wow fadeInDown" data-wow-delay=".3s">
					<img src="/static/resources/img/yahoo_logo.png" alt="" title="">
				</li>
				<li class="col-xs-6 col-sm-6 col-md-3 animated wow fadeInDown" data-wow-delay=".4s">
					<img src="/static/resources/img/paypal_logo.png" alt="" title="">
				</li>
			</ul>
			
		</div>
	</section>
	 End Featured On Section  -->






	<!--  About Section  -->
	<section class="about" id="about">
		<div class="container">
			<div class="row">
				<div class="col-md-6 text-center animated wow fadeInLeft">
					<div class="iphone">
						<img src="/static/resources/img/android.png" alt="" titl="">
					</div>
				</div>
				<div class="col-md-6 animated wow fadeInRight">
					<div class="features_list">
						<h1 class="text-uppercase">KEEP IN MARKET.</h1>
						<p>This app gives you a fantastic way for stock price / threshold (eg. RSI, MACD) alert with user-friendly interface.</p>
						<a href="https://play.google.com/store/apps/details?id=com.sunrises.stockwatch" class="app_link">Get the app</a>
					</div>					
				</div>
			</div>
		</div>

		<div class="about_video show_video">
			<a href="" class="close_video"></a>
		</div>
	</section>
	<!--  End About Section  -->






	<!--  App Features Section  -->
	<section class="app_features" id="app_features">
		<div class="container">

			<div class="row text-center">
				<div class="col-sm-4 col-md-4 details animated wow fadeInDown" data-wow-delay="0s">
					<img src="/static/resources/img/f_icon3.png" alt="" title="">
					<h1 class="text-uppercase">Stock Alert</h1>
					<p class="">notify you once a preset price or technical indicator hit</p>
				</div>

				<div class="col-sm-4 col-md-4 details animated wow fadeInDown" data-wow-delay=".1s">
					<img src="/static/resources/img/f_icon2.png" alt="" title="">
					<h1 class="text-uppercase">Technical Indicators</h1>
					<p class="">support MACD, RSI, SMA, Oversold, etc</p>
				</div>
				<div class="col-sm-4 col-md-4 details animated wow fadeInDown" data-wow-delay=".2s">
					<img src="/static/resources/img/f_icon1.png" alt="" title="">
					<h1 class="text-uppercase">Stock Markets</h1>
					<p class="">support HongKong and US</p>
				</div>
			</div>
			
<div class="row text-center">
				
				<div class="col-sm-4 col-md-4 details animated wow fadeInDown" data-wow-delay="0s">
					<img src="/static/resources/img/f_icon5.png" alt="" title="">
					<h1 class="text-uppercase">Setting</h1>
					<p class="">support WiFi, monitoring interval, etc</p>
				</div>
				<div class="col-sm-4 col-md-4 details animated wow fadeInDown" data-wow-delay=".1s">
					<img src="/static/resources/img/f_icon4.png" alt="" title="">
					<h1 class="text-uppercase">Language</h1>
					<p class="">support English, T. Chinese or S. Chinese</p>
				</div>
				<div class="col-sm-4 col-md-4 details animated wow fadeInDown" data-wow-delay=".2s">
					<img src="/static/resources/img/f_icon6.png" alt="" title="">
					<h1 class="text-uppercase">One-off cost</h1>
					<p class="">act as if a user gets stock updates from popular websites</p>
				</div>
			</div>
		</div>
	</section>
	<!--  And App Features Section  -->






	<!--  Testimonials Section  -->
	<section class="testimonials animated wow fadeIn" id="testimonials" data-wow-duration="2s">
		<div class="container">
			<div class="testimonials_list">

				<ul class="list-unstyled text-center slides clearfix" id="tslider">
					
					<li>
							<p>Our aim is to provide an intelligent way to relieve user's effort and time in stock monitoring so that user could have more time on others.</p>
						<blockquote>
							<span class="author text-uppercase">Snapappr</span>
							<span class="job">Android developer</span>
							
						</blockquote>
					</li>
<li>
						<blockquote>
							<p>To be announced</p>
							<span class="author text-uppercase">Snapappr</span>
							<span class="job">IOS developer</span>
							
						</blockquote>
					</li>

				</ul>
				<div id="slider_nav">
					<div id="prev_arrow"></div>
					<div id="next_arrow"></div>
				</div>
			</div>
		</div>
	</section>
	<!--  End Testimonials Section  -->





	<!--  Email Subscription Section  -->
	<section class="sub_box">
		<p class="cta_text animated wow fadeInDown">Get it now</p>
		<ul class="list-unstyled list-inline app_platform">
			<li class="animated wow fadeInDown" data-wow-delay="0s">
				<a href="https://play.google.com/store/apps/details?id=com.sunrises.stockwatch"><img src="/static/resources/img/android_icon.png" alt="" title=""></a>
			</li>
			<!--<li class="animated wow fadeInDown" data-wow-delay=".1s">
				<a href=""><img src="/static/resources/img/ios_icon.png" alt="" title=""></a>
			</li>-->			
		</ul>
	</section>
	<!--  End Email Subscription Section  -->









	<!--  Footer Section  -->
	<footer>
		
		<p class="copyright animated wow fadeIn" data-wow-duration="2s"> © 2017 <a href="#" target="_blank"><strong>Stock3P</strong></a>. All Rights Reserved</p>
	</footer>
	<!--  End Footer Section  -->


</body>
</html>
