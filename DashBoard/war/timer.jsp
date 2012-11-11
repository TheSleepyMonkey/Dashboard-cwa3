<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Timer</title>
</head>
<body>
<% if(request.getParameter("t")==null){ 
%>
<form name="startTimer" action="/startTimer" method="post">
<select name="vak">
<option> Algebra</option>
<option> Analyse</option>
<option> Mechanica </option>
<option> Scheikunde </option>
</select>
<input type="submit" value="start timer" name="start">
</form>
<% } 
else if(request.getParameter("t").equals("started")){
	
	%>


<form name="d">
<input type="text" size="8" name="d2">
<input type="hidden" name="">
</form>

seconden.
<script>
<!--
/*By George Chiang. (JK's ultimate JavaScript tutorial and free JavaScripts site!)
http://www.javascriptkit.com
Credit MUST stay intact for use*/
var milisec=0
var seconds=0
document.d.d2.value='0'
function display(){
if (milisec>=9){
milisec=0
seconds+=1
}
else
milisec+=1
document.d.d2.value=seconds
setTimeout("display()",100)
}
display()
//-->
</script>

<form name="stopTimer"  method="post"  action="/startTimer">
<input type="submit" value="Stop" name="stop">
</form>
<% }
else {
String time=request.getParameter("time");
String vak=request.getParameter("vak");
response.getWriter().println(time +" seconden voor het vak "+ vak);
%>
<br><br><a href="timer.jsp">Nog iets timen.</a>
<%
}
	 %>
	
</body>
</html>