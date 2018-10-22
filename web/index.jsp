<%--
  Created by IntelliJ IDEA.
  User: vadyo
  Date: 22.10.2018
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<
<h2 align="center">Hi, can you answer some questions?</h2></p>
<p align="center"><img src="images.jpg"></p>

<form action="/quest" method="Post" align="center">
    <b>Your name:</b><br>
    <input type="text" name="name" size="30" maxlength="35" required autocomplete="off"> <br> <br>
    <b>Your surname:</b></br>
    <input type="text" name="surname" size="40" maxlength="45"><br>
    <b>Gender:</b><br>
    <input type="radio" name="gender" value="Man" required> Man <br>
    <input type="radio" name="gender" value="Woman" required> Woman<br>
    <input type="radio" name="gender" value="Robot" required> Robot <br> <br>
    <b>How old are you?</b> <br>
    <select name="age" required>
        <option></option>
        <option value="small">I`m child</option>
        <option value="young">I`m young</option>
        <option value="large">I`m adult</option>
        <option value="old">I`m old</option>
        <option value="think">I`m don`t know</option>
    </select>
    <br><br>
    <b> Do you eat meat?</b><br>
    <select name="meat" required>
        <option value="yes"> Yes</option>
        <option value="no"> No</option>
    </select>
    <br><br>
    <input type="submit" value="Submit!">
</form>

</body>
</html>
