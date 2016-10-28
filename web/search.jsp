<%-- 
    Document   : search
    Created on : Oct 27, 2016, 6:00:35 PM
    Author     : changykim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Searching</title>
        <link rel="stylesheet" href = "HW5.css">
    </head>
    <body>

        <div class = "wrap">


            <%@include file = "includes/header.jsp" %>

            <%@include file = "includes/menu.jsp" %>




            <div class = "main">        
                <h1>Search Product</h1>

                <form name ="searchForm" action="search" method="get">


                    <input type="text" name="searchVal" value="" />        

                    <br>

                    <input type="submit" name="submit" value="Search" />        
                </form>
            </div>    


            <%@include file = "includes/footer.jsp" %>


        </div>        
    </body>
</html>
