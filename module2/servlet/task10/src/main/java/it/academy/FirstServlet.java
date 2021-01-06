package it.academy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "FirstServlet", urlPatterns = "/test")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1l;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("fio");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        out.println("<html>"
                + "<head>"
                + "<title>First Srvlet</title>"
                + "</head>"
                + "<body>"
                + "<h1>Hello " + name + "</h1>"
        );
        out.println("<h2> your phone number: " + phone + " </h2>"
                + "<h2> your e-mail: " + email + " </h2>"
                + "</body>"
                + "</html>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
