<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Section</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Design Lab Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/font-awesome.css" rel="stylesheet"> 
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--fonts-->
<link href="//fonts.googleapis.com/css?family=Playfair+Display:400,400i,700,700i,900,900i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
<!--//fonts-->
</head>
<body>

<div class="banner-top">
			<div class="social-bnr-agileits">
				<ul class="social-icons3">
					<li><a href="#" class="fa fa-facebook icon-border facebook"> </a></li>
					<li><a href="#" class="fa fa-twitter icon-border twitter"> </a></li>
					<li><a href="#" class="fa fa-google-plus icon-border googleplus"> </a></li> 
					<li><a href="#" class="fa fa-rss icon-border rss"> </a></li>
				</ul>
			</div>
			<div class="contact-bnr-w3-agile">
				<ul>
					<li><i class="fa fa-envelope" aria-hidden="true"></i><a href="mailto:info@example.com">INFO@LATESTNEWSHUB.COM</a></li>
					<li><i class="fa fa-phone" aria-hidden="true"></i>+91 7386093805</li>	
					
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	<div class="w3_navigation">
		<div class="container">
			<nav class="navbar navbar-default">
				<div class="navbar-header navbar-left">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<h1><a class="navbar-brand" href="index.html"> LATEST <span>NEWS</span> HUB</a></h1>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
					<nav class="menu menu--iris">
						<ul class="nav navbar-nav menu__list">
							<li class="menu__item"><a href="main.jsp" class="menu__link">Home</a></li>
							<li class="menu__item">
								<a href="AP-GOs&Pro.jsp" class="menu__link">AP GOs& Pro </a>
								
							</li>
						<li class="menu__item menu__item--current">
								<a href="Teacher-Section.jsp" class="menu__link">Teacher Section </a>
							
							</li>
							<li class="menu__item">
								<a href="Employee-Section.jsp" class="menu__link" >Employee Section </a>
							</li>
							<li class="menu__item"><a href="contactus.jsp" class="menu__link">Contact Us</a></li>
						</ul>
					</nav>
				</div>
			</nav>
		</div>
	</div>
	
<!-- //header -->


<div class="typo">
		<div class="container">
			<div class="grid_3 grid_5 w3ls">
				<h3><b>Teacher Section</b></h3>
				<div class="alert alert-info" role="alert">
					<a href="all-leave-rules.jsp"><strong>LEAVE RULES</strong> This will give you list of GOs on Leave Rules for Employees.</a>
				</div>
			
				<div class="alert alert-info" role="alert">
				<a href="#">	<strong>CCE Info</strong> This will give you information on CCE.</a>
				</div>
				<div class="alert alert-info" role="alert">
					<a href="#"><strong>Health Cards</strong>This will give you Health Cards information.</a>
				</div>
				<div class="alert alert-info" role="alert">
				 <a href="#"><strong>AAS Info</strong> This will give you AAS Info.</a>
				</div>
				<div class="alert alert-info" role="alert">
					<a href="#"><strong>STEP UP Info</strong> This will give you STEP UP Information.</a>
				</div>
				<div class="alert alert-info" role="alert">
					<a href="#"><strong>Educational Fee Reimbursement</strong> This will give you information on Educational Fee Reimbursement.</a>
				</div>
				
			</div>
			
		</div>
	</div>

	<!-- //footer -->

<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
		<script src="js/responsiveslides.min.js"></script>
			<script>
						// You can also use "$(window).load(function() {"
						$(function () {
						  // Slideshow 4
						  $("#slider4").responsiveSlides({
							auto: true,
							pager:true,
							nav:false,
							speed: 500,
							namespace: "callbacks",
							before: function () {
							  $('.events').append("<li>before event fired.</li>");
							},
							after: function () {
							  $('.events').append("<li>after event fired.</li>");
							}
						  });
					
						});
			</script>
	<!-- clients js file-->
	<script src="js/jquery.wmuSlider.js"></script> 
		<script>
			$('.example1').wmuSlider();         
		</script> 
<!-- //clients js file -->

<!-- smooth scrolling -->
	<script type="text/javascript">
		$(document).ready(function() {
		/*
			var defaults = {
			containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			};
		*/								
		$().UItoTop({ easingType: 'easeOutQuart' });
		});
	</script>
	<div class="arr-w3ls">
		<a href="#home" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	</div>
<!-- //smooth scrolling -->
<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>

</body>
</html>