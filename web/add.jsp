<%-- 
    Document   : add
    Created on : Oct 20, 2016, 11:13:52 PM
    Author     : changykim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a new product</title>
        <link rel="stylesheet" href = "HW5.css">
    </head>
    <body>
        <h1>Add a new product</h1>
        
        <form name ="addForm" action="addProduct" method="get">

            <table class = "add">
            <tbody>            

            <tr>        
            <td><lable>Product Name:</lable></td>
            <td><input type="text" name="name" value=""/></td>
            <br>
            </tr> 
            
            <tr>
            <td><lable>Price:</lable></td>
            <td><input type="text" name="price" value=""/></td>
            <br>
            </tr> 
            
            <tr>
            <td><lable>Quantity:</lable></td>
            <td><input type="text" name="quantity" value=""/></td>
            <br>
            </tr> 
            
            <tr>
            <td><lable>Company:</lable></td>
            <td><input type="text" name="company" value=""/></td>
            <br>
            </tr> 
                </tbody>
                
            </table>            
            <input type="reset" value="Clear" id="clear">
            <input type="submit" value="Submit" value="submit"/>



</body>
</html>
