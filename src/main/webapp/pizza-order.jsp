<%--
  Created by IntelliJ IDEA.
  User: damianwrather
  Date: 5/10/23
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Form</title>
</head>
<body>
    <h1>Pizza Form</h1>
    <form action="pizza-order" method="post">
        <h1>Select crust</h1>
        <select name="crust-type">
            <option value="thin">Thin</option>
            <option value="thick">Thick</option>
            <option value="stuffed">Stuffed</option>
        </select>
        <h1>Select sauce</h1>
        <select name="sauce-type">
            <option value="tomato">Tomato</option>
            <option value="pesto">Pesto</option>
            <option value="white">White</option>
            <option value="marinara">Marinara</option>
        </select>
        <h1>Select size</h1>
        <select name="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <h3>Toppings</h3>
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" id="pepperoni" name="topping" value="pepperoni" />
        <label for="sausage">Sausage</label>
        <input type="checkbox" id="sausage" name="topping" value="sausage" />
        <label for="mushrooms">Mushrooms</label>
        <input type="checkbox" id="mushrooms" name="topping" value="mushrooms" />

        <h3>Delivery Instructions</h3>
        <textarea name="delivery" rows="3" cols="40"></textarea>

        <p><input type="submit" value="Submit" /></p>
    </form>
</body>
</html>
