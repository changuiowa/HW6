<%-- 
    Document   : index
    Created on : Oct 11, 2016, 4:41:13 PM
    Author     : changykim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iowa Grocery Store Products</title>
        <link rel="stylesheet" href = "HW5.css">
    </head>
    <body>
        <div class = "wrap">


            <%@include file = "includes/header.jsp" %>

            <%@include file = "includes/menu.jsp" %>




            <div class = "main">
                <h2>What do you want to do?</h2>
                <a href = "read"> View the list of products</a>
                <br><br>
                <a href = "search.jsp"> Search a product</a>

            </div>    


            <%@include file = "includes/footer.jsp" %>


        </div>

    </body>
</html>
