package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guess = request.getParameter("guess");
        String answer = "2";
        if(guess.equals(null) || guess.equals("") || Integer.parseInt(guess) < 1 || Integer.parseInt(guess) > 3) {
            request.setAttribute("guess", guess);
            request.getRequestDispatcher("/guess.jsp").forward(request, response);
        }
        if (guess.equals(answer)) {
            request.setAttribute("guess", guess);
            request.getRequestDispatcher("/correct.jsp").forward(request, response);
        } else {
            request.setAttribute("guess", guess);
            request.getRequestDispatcher("/incorrect.jsp").forward(request, response);
        }
    }
}
