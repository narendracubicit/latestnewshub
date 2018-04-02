<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.SecSubSectionDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UPLOAD NEWS !</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Clinic Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	
	<script type="application/x-javascript">
		
		addEventListener("load", function ()
		{
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() 
		{
			window.scrollTo(0, 1);
		}
	</script>
	<!--//tags -->
	<link href="css4/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css4/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css4/appointment_style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css4/font-awesome.css" rel="stylesheet">
	<!-- //for bootstrap working -->
	<link href="//fonts4.googleapis.com/css?family=Source+Sans+Pro:300,300i,400,400i,600,600i,700" rel="stylesheet">
	
	
<script>
function sectionnameselected(str)
{
if (str=="")
  {
  document.getElementById("subsection").innerHTML="";
  return;
  }
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.open("GET","subsectionvalues.jsp?section="+str,true);
xmlhttp.send();
xmlhttp.onreadystatechange=function()
  {
  if (this.readyState==4 && this.status==200)
    {
    document.getElementById("subsection").innerHTML=this.responseText;
    }
  }

}
</script>
</head>
<body>
<!--//banner -->
<%!

List<String> sectionnames=new ArrayList<String>();
List<String> subsectionnames=new ArrayList<String>();

%>
	<div class="w3ls-banner">
	<div class="heading">
		<h2 style="color: orange;">Welcome Latest News Hub Admin</h2>
	</div>
		<div class="container_1">
			<div class="heading" >
				<h2 >Please Enter News Details</h2>
			</div>
			<div class="agile-form">
				<form action="uploadnews" method="post" enctype="multipart/form-data">
					<ul class="field-list">
						
						<li>
							<label class="form-label">
							   State
							   <span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<select class="form-dropdown" name="state" required>
									<option value="">Select State</option>
									<option value="ts"> Telangana </option>
									<option value="ap"> AndhraPradesh </option>
									<option value="all">General</option>
								</select>
							</div>
						</li>
						<li>
							<label class="form-label">
							   Section
							   <span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<select class="form-dropdown" name="section" onchange="sectionnameselected(this.value)" required>
									<option value="">Select Section</option>
									<%
									
									sectionnames= SecSubSectionDao.getSections();
									
									for(String section:sectionnames)
									{
									%>
									<option value="<%=section%>"> <%= section %> </option>
									<%
									}
									%>
								</select>
							</div>
						</li>
						
						<li>
							<label class="form-label">
							   Sub Section
							   <span class="form-required"> * </span>
							</label>
							<div class="form-input" id="subsectiondiv">
								<select class="form-dropdown" id="subsection" name="subsection" required>
									
									<option value=""> Please Select SubSection</option>
									
								</select>
							</div>
						</li>
						
						<li>
							<label class="form-label"> 
								URL 
								<span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<input type="text" name="url" placeholder="Enter URL" required >
							</div>
						</li>
						<li>
							<label class="form-label"> 
								Description 
								<span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<input type="text" name="description" placeholder="Enter Description " required >
							</div>
						</li>
							<li>
							<label class="form-label"> 
								Upload File 
								<span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<input type="file" name="file"  >
							</div>
						</li>
						

					</ul>
					<input type="submit" value="Update News">
				</form>	
			</div>
		</div>
</div>
	<!-- footer -->
	
	<div class="footer_wthree_agile">
		<p>© 2018 Latest News Hub. All rights reserved | Design by <a href="http://cubicitsolution.co.in">CubicIt</a></p>
	</div>

	<!-- //footer -->

<!-- //bootstrap-modal-pop-up --> 
	<!-- js -->
	<script type="text/javascript" src="js4/jquery-2.1.4.min.js"></script>
	<script>
		$('ul.dropdown-menu li').hover(function () {
			$(this).find('.dropdown-menu').stop(true, true).delay(200).fadeIn(500);
		}, function () {
			$(this).find('.dropdown-menu').stop(true, true).delay(200).fadeOut(500);
		});
	</script>
	<script type="text/javascript" src="js4/bootstrap.js"></script>

</body>
</html>