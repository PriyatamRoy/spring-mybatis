<%-- 
    Document   : index
    Created on : Feb 11, 2018, 12:23:27 PM
    Author     : Suman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring 4 Web MVC via Annotations</title>
        <link rel="stylesheet" type="text/css" href="{cp}/resources/css/site.css" />
        <script src="${cp}/resources/js/js.js"></script>
    </head>
    <body>
        <h4>Spring 4 + MyBatis 3 + Java Configuration</h4>
        
        <table>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <th><c:out value="${user.id}"/></th>
                    <th><c:out value="${user.firstName}"/></th>
                    <th><c:out value="${user.lastName}"/></th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
