  <jsp:include page="header.jsp"></jsp:include>


   <link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style2.css" rel="stylesheet" type="text/css" />
<html>
<head>
<title>Registration Form</title>
<style type="text/css">

 
  

   
<div id="main">
			<div class="5grid">
				<div class="main-row">
					<div class="4u-first">
						
						<section>
							<h2>Welcome to Mailservices!</h2>
							<p>Hi! This is <strong>Mail Services</strong>, a free service by <a href="http://www.javatpoint.com/">javatpoint</a><br> for <a href="http://www.cstpoint.com/">Mailing system</a>.
							You can perform all email operation,Currently  it stores the information in database
							it's free of cost.Let's try it..
							</p>
							
h3{font-family: Calibri; font-size: 24pt; font-style: normal; font-weight: bold; color:Black;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:black; font-size: 11pt; font-style: normal;width: 50%; 
text-align:; background-color: ; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}
</style>
</head>
 
<body>
</br></br>
<h6\><center>Register Here -</h6></center></br>
<form action="RegisterServlet" method="POST">
 <center>
<table align="center" cellpadding = "10">
<tr>
<td>First Name *</td>
<td><input type="text" name="firstName" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
<tr>
<td>Middle Name</td>
<td><input type="text" name="middleName" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<tr>
<td>Last Name *</td>
<td><input type="text" name="lastName" maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<tr>
<td>Email *</td>
<td><input type="text" name="email" maxlength="100" /></td>
</tr>

<tr>
<td>User ID *</td>
<td><input type="text" name="userId" maxlength="100" /></td>
</tr>
<tr>
<td>Password *</td>
<td><input type="text" name="password" maxlength="100" /></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>
</tr>
</table>

 
</form>
 </center>
</body>
</html>
<li>

					</div>
				
				
			
		</div>
</br></br></br></br></br>	
<jsp:include page="footer.html"></jsp:include>