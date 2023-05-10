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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col text-center">
            <h1>Pizza Form</h1>
        </div>
    </div>

    <form action="pizza-order" method="post">
        <h1>Select crust</h1>
        <select class="form-select" name="crust-type">
            <option value="thin">Thin</option>
            <option value="thick">Thick</option>
            <option value="stuffed">Stuffed</option>
        </select>
        <h1>Select sauce</h1>
        <select class="form-select" name="sauce-type">
            <option value="tomato">Tomato</option>
            <option value="pesto">Pesto</option>
            <option value="white">White</option>
            <option value="marinara">Marinara</option>
        </select>
        <h1>Select size of pizza</h1>
        <select class="form-select" name="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <h3>Toppings</h3>
        <label class="form-check-label" for="pepperoni">Pepperoni</label>
        <input class="form-check-input" type="checkbox" id="pepperoni" name="topping" value="pepperoni" />
        <label class="form-check-label" for="sausage">Sausage</label>
        <input class="form-check-input" type="checkbox" id="sausage" name="topping" value="sausage" />
        <label class="form-check-label" for="mushrooms">Mushrooms</label>
        <input class="form-check-input" type="checkbox" id="mushrooms" name="topping" value="mushrooms" />

        <h3>Delivery Instructions</h3>
        <textarea class="form-control" name="delivery" rows="3" cols="40"></textarea>

        <p><input class="btn btn-primary" type="submit" value="Submit" /></p>
    </form>
</div>
</body>
</html>
