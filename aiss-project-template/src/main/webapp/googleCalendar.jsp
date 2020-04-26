<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
.button2 {
  position: absolute;
  left: 35px;
  top:85%%;
  background-color: #4CAF50; /* Green */
  border: none;
  border-style:solid;
  border-color:green;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
  border-radius: 55px;
}
.button1:hover {
	
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
</style>

<meta charset="ISO-8859-1">
<title>Eventos</title>
</head>
<body>
<iframe src="https://calendar.google.com/calendar/embed?" src=${idCalendario}&ctz=Europe%2FMadrid" style="border: 0" width="1920" height="800" frameborder="0" scrolling="no"></iframe>
<a href="TicketMasterController" class="button2 button1">Volver a eventos</a>
</body>
</html>