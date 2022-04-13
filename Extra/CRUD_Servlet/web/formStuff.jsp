
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
        <h2>
            <c:if test="${stuff != null}">Edit Stuff</c:if>
            <c:if test="${stuff == null}">Insert Stuff</c:if>
        </h2>
        
        <c:if test="${stuff != null}">
            <form action="update_stuff" method="get">
        </c:if>
        <c:if test="${stuff == null}">
            <form action="insert_stuff" method="get">
        </c:if>
        <c:if test="${stuff != null}">
            <input type="hidden" name="stuff_Id"
                   value="<c:out value='${stuff.id}'/>" />
        </c:if>                 
            <label for="nome">Nome:</label>
            <input type="text" name="nome" value="<c:out value='${stuff.nome}'/>">
            <label for="descricao">Descrição:</label>
            <input type="text" name="descricao" value="<c:out value='${stuff.descricao}'/>">
            <input type="submit" value="Salvar">
        </form>                   
    </body>
</html>
