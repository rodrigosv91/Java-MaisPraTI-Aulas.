<%-- 
    Document   : hello_page
    Created on : 19 de mar de 2022, 01:56:06
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Page</title>       
    </head>
    <body>              
        <%String msg = (String) request.getAttribute("message");%>
        <%String person = (String) request.getAttribute("person");%>        
        <h1><%out.print(msg);%>&nbsp;+&nbsp;<%out.print(person);%>!</h1>
    </body>
</html>
