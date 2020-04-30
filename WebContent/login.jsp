<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<jsp:include page="header.jsp"></jsp:include>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style2.css" rel="stylesheet" type="text/css" />


<body>
									<%
response.setHeader("Cache-Control","no-cache,no-store ,must-revalidate");
%>
	
<div id="main">
			<div class="5grid">
				<div class="main-row">
					<div class="4u-first">
						
						<section>
							<h2>Welcome to Mailservices!</h2>
							<p>Hi! This is <strong>Mail Services</strong>, a free service <br> for Mailing system.
							You can perform all email operation,Currently  it stores the information in database
							it's free of cost.Let's try it..
							</p>
							
						</section>
					
					</div>
					<div class="4u">
						
					
							
						
								
					<li>
									<div>
									
							<form method="post" action="LoginServlet">
<div style="padding: 50px 0 0 250px;">


<div id="login-box">

<H2>Login</H2>
Please provide your credential to use this website
<br />

<div id="login-box-name" style="margin-top:20px;">User Id:</div></br>
<div id="login-box-field" style="margin-top:20px;">
<input name="userId" class="form-login" title="Username" value="" size="30" maxlength="100" />
</div>
<br>
<div id="login-box-name">Password:</div>
<div id="login-box-field">
<input name="password" type="password" class="form-login" title="Password" value="" size="30" maxlength="48" />
</div>
<br />
<span class="login-box-options">
New User?  <a href="register.jsp" style="margin-left:30px;">Register Here</a>
</span>

<br />
<input style="margin-left:50px;" type="submit" value="Login" />
</div>
</div>

</form></div>
							
						</li>			
								
						<li>
						<marquee direction="up">
						<font style="color: navy;"><h5>Do any kind of operation related to <br>
								Mail Services Such as Compose mail,<br>
								Inbox,And if you have Any Query just<br>
								Contact Us ..by clicking above links ..</h5></font></marquee></li>
							</span>
										 
		
							
								
							</ul>
						</section>
					
					</div>
					
				</div>
				
			</div>
		</div>
		</body>>

<jsp:include page="footer.html"></jsp:include>
