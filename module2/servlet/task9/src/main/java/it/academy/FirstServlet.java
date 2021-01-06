package it.academy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1l;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String realPath = getServletContext().getRealPath("/count.txt");
        int number = 0;

        try (
                DataInputStream output = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(realPath)));
        ) {
            number = output.readInt() + 1;
        } catch (IOException ex) {
        }
        int count = number+1;
        out.println("<html>"
                + "<head>"
                + "<title>CountServlet</title>"
                + "</head>"
                + "<body>"
                + "<h3>You visited this page " + count + " times</h3>"
                + "</body>"
                + "</html>");

        try (DataOutputStream input = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(realPath)));) {
            input.writeInt(count);
        } catch (IOException ex) {
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
