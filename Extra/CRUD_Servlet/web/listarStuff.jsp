<%-- 
    Document   : listarStuff
    Created on : 20 de mar de 2022, 04:00:08
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Stuff"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <h1>Stuff List:</h1>     //jstl
        <%
            ArrayList<Stuff> stuffList = (ArrayList<Stuff>) request.getAttribute("stuff_list");
            for (Stuff s : stuffList) {
                out.print(s.getNome());
                out.print(s.getDescricao());
            }
        %> 

        <table border=1>
            <thead>
                <tr>
                    <th>Item Name</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${stuff_list}" var="stuff">
                    <tr>
                        <td><c:out value="${stuff.nome}" /></td>
                        <td><c:out value="${stuff.descricao}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>


