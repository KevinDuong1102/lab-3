<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 24, 2021, 10:10:07 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style><%@include file="/WEB-INF/style.css"%></style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form method="POST" action="Arithmetic"> 
            <h1>Arithmetic Calculator </h1>
            <br/>
            <label>First: </label>
            <input type="text" value= "${firstInput}" name="first_input"/>
            <br/>
            <br/>
            <label>Second: </label>
            <input type="text" value= "${secondInput}" name="second_input"/>
            <br/>
            <br/>
            <button type = "submit" name="calculation_btn" value="+">+</button>
            <button type = "submit" name="calculation_btn" value="-">-</button>
            <button type = "submit" name="calculation_btn" value="*">*</button>
            <button type = "submit" name="calculation_btn" value="%">%</button>
        </form>
        
        <p>Result: ${message}</p>
        <a href="Validate">Age Calculator</a>

    </body>
</html>
