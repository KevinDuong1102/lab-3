<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2021, 9:06:27 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style><%@include file="/WEB-INF/style.css"%></style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="Validate">
            <label>Enter your age </label>
            <input type="text" name="age_input" value=""/>
            <br/>
            <br/>
            <input type="submit" id="calculate_age_btn" value="Age next birthday"/>
        </form>
        
        <p>${message}</p>
        
        <a href="Arithmetic"> Arithmetic Calculator </a>
        
        
        
       
    </body>
</html>
