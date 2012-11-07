<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.util.List"%>
<%@ page import="com.google.appengine.api.users.User"%>
<%@ page import="com.google.appengine.api.users.UserService"%>
<%@ page import="com.google.appengine.api.users.UserServiceFactory"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
</head>

<body>
	<div id="main">
		<%
			if (request.getParameter("l") != null) {
				if (request.getParameter("l").equals("false")) {
		%>
		You have inserted wrong information, please fix the problems
		<%
			}
			}
		%>
		<form action="Login" method="post">
			<fieldset>
				<legend>Login</legend>
				<br /> <a href="register.jsp">Register</a> now if you don't have an
				account yet <br />
				<%
					if ((String) session.getAttribute("username") != null) {
						response.sendRedirect("dashboard.jsp?l=ag");
					}
				%>
				<br /> Username: <br /> <input style='width: 230px;' type="text"
					name="username" /><br /> Password: <br /> <input
					style='width: 230px;' type="password" name="password" /> <br /> <br />
				<input type="checkbox" name="remember"> Remember me. <br />
				<br />
				<table>
					<tbody>
						<tr>
							<td>
								<div class="button">
									<input type="submit" value="Submit" />
								</div>
							</td>
						</tr>
					</tbody>
				</table>
				<br /> <br /> <a href="Forgotpass.php">Click here</a> if you
				forgot your password.
			</fieldset>
		</form>
	</div>
</body>
</html>