<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	
	 <form method="post" action="Processer">
	 	<center>
		<table style="background-color: BlanchedAlmond; height: 240px; width: 427px; color: Red">
			<thead>
				<tr>
					<th colspan="2" style="color: White; "><center style="color: Red; "> <b><big>LOGIN INFORMATION</big></b></center></th>
				</tr>
			</thead>
			<tr> 
			<td>Enter Username: </td> <td> <input type="text" name = "userName" style="width: 196px; "></td>
		</tr>
		<tr> 
			<td>Enter Password: </td> <td> <input type="password" name = "password" style="width: 195px; "></td>
		</tr>
		<tr> 
			<td align="center"><input type="submit" value = "Submit" style="width: 226px; background-color: Olive; color: White"></td>
			<td><a href=signup.jsp>Not a User? Click Here</a></td>
		</tr>
		</table>
		</center>
	</form>
	<%@ include file="footer.jsp"%>
</body>
</html>