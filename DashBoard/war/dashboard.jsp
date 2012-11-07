<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.google.appengine.api.users.UserServiceFactory"%>
<%@ page
	import="com.google.appengine.api.datastore.DatastoreServiceFactory"%>
<%@ page import="com.google.appengine.api.datastore.DatastoreService"%>
<%@ page import="com.google.appengine.api.datastore.Query"%>
<%@ page import="com.google.appengine.api.datastore.Entity"%>
<%@ page import="com.google.appengine.api.datastore.FetchOptions"%>
<%@ page import="com.google.appengine.api.datastore.Key"%>
<%@ page import="com.google.appengine.api.datastore.KeyFactory"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
<link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
</head>

<body>
	<div id="main">
		<div id="menu">
			<%
				if ((String) session.getAttribute("username") != null) {
			%>
			<a href="Logout"> Logout </a>
			<%
				} else {
			%>
			<a href="login.jsp"">Sign in</a> <a href="register.jsp"> Register
			</a>
			</p>
			<%
				}
			%>
		</div>
		<div id="container">
			<%
				if ((String) session.getAttribute("username") != null) {
			%>
			You are logged in as:
			<%=session.getAttribute("username")%>
			<%
				}

				if (request.getParameter("l") != null) {
					String logged = request.getParameter("l");
					if (logged.equals("true")) {
			%>
			<p>You have successfully logged in!</p>
			<%
				}
					if (logged.equals("ag")) {
			%>
			<p>You are already logged in</p>
			<%
				}
				}
			%>
		</div>
		<p>
	</div>
</body>
</html>