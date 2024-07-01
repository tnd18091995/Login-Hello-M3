package jintran.loginhello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if("admin".equals(username) && "123456".equals(password)){
            response.sendRedirect("/dashboard.jsp");
        } else{
            writer.println("<h1> login error </h1>");
        }
        writer.println("</html>");
    }
}
