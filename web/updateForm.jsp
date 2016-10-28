<%-- 
    Document   : updateForm
    Created on : Oct 27, 2016, 4:58:25 PM
    Author     : changykim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Products"%>
<% Products product = (Products) request.getAttribute("product");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a product</title>
        <link rel="stylesheet" href = "HW5.css">
    </head>
    <body>
        <div class = "wrap">


            <%@include file = "includes/header.jsp" %>

            <%@include file = "includes/menu.jsp" %>




            <div class = "main">        
                <h1>Update a product record</h1>

                <form name ="updateForm" action="updateProduct" method="get">

                    <table class = "add">

                        <tr>        
                            <td><lable>Product ID:</lable></td>
                        <td><input type="text" name="id" value="<%= product.getProductID()%>" readonly/></td>
                        <br>
                        </tr>                        

                        <tr>        
                            <td><lable>Product Name:</lable></td>
                        <td><input type="text" name="name" value="<%= product.getProductName()%>"/></td>
                        <br>
                        </tr> 

                        <tr>
                            <td><lable>Price:</lable></td>
                        <td><input type="text" name="price" value="<%= product.getPrice()%>"/></td>
                        <br>
                        </tr> 

                        <tr>
                            <td><lable>Quantity:</lable></td>
                        <td><input type="text" name="quantity" value="<%= product.getQuantity()%>"/></td>
                        <br>
                        </tr> 

                        <tr>
                            <td><lable>Company:</lable></td>
                        <td><input type="text" name="company" value="<%= product.getCompany()%>"/></td>
                        <br>
                        </tr> 


                    </table>            
                    <input type="reset" value="Clear" id="clear"/>
                    <input type="submit" value="Submit" value="update"/>

            </div>    


            <%@include file = "includes/footer.jsp" %>


        </div>

    </body>
</html>
