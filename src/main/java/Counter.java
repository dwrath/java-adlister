import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "Counter", urlPatterns = {"/counter"})
public class Counter extends HttpServlet {
    private int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        String reset = req.getParameter("reset");

        if(Objects.equals(reset, "reset") || Objects.equals(reset, "0") || Objects.equals(reset, "Reset") || Objects.equals(reset, "RESET")){
            count = 0;
            res.getWriter().println("<h1>The count is: " + count + "</h1>");
        }else{
            res.setContentType("text/html");
            count++;
            res.getWriter().println("<h1>The count is: " + count + "</h1>");
        }

    }



}
