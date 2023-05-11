package controllers;

import models.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
@WebServlet(name = "controllers.OrderServelet", urlPatterns = "/pizza-order")
public class OrderServelet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String size = request.getParameter("size");
        String crustType = request.getParameter("crust-type");
        String sauce = request.getParameter("sauce-type");
        String[] toppings = request.getParameterValues("toppings");
        String delivery = request.getParameter("delivery");
        Order order = new Order(delivery, size, crustType, sauce, toppings);
        request.setAttribute("order", order);
        request.setAttribute("size", size);
        request.setAttribute("crust-type", crustType);
        request.setAttribute("sauce-type", sauce);
        request.setAttribute("toppings", toppings);
        request.setAttribute("delivery", delivery);
        System.out.println(order);
        System.out.println(size);
        System.out.println(crustType);
        System.out.println(sauce);
        System.out.println(Arrays.toString(toppings));
        System.out.println(delivery);
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
}
