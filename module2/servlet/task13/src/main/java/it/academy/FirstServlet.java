package it.academy;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "FirstServlet", urlPatterns = "/test")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1l;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        final String id = req.getSession().getId();
        Cookie[] thatCookie = req.getCookies();
        boolean flag = false;
        for (int i = 0; i < thatCookie.length; i++) {
            Cookie cookie = thatCookie[i];
            if (cookie.getValue().equals(id)&&cookie.getName().equals("task13")) {
                flag = true;
            }
        }
        String realPath = getServletContext().getRealPath("/count.txt");
        int number = 0;
        if (!flag) {
            Cookie cookie = new Cookie("task13", id);
            cookie.setMaxAge(24*60*60); //5
            resp.addCookie(cookie);

        }
        try (
                DataInputStream output = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(realPath)));
        ) {
            number = output.readInt();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        PrintWriter out = resp.getWriter();

        int count = number + 1;
        out.println("<html><head><title>CountServlet</title></head><body>");
        if(flag){out.println("<h3>You were on this page today</h3>");
           // out.println("<h3>You visited this page " + number + " times</h3>");
            out.println("</body></html>");
        }
        else{out.println("<h3>You visited this page " + count + " times</h3>");
        out.println("</body></html>");
        try (DataOutputStream input = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(realPath)));) {
            input.writeInt(count);
        } catch (IOException ex) {
            ex.printStackTrace();
        }}
    }
//
//        final PrintWriter writer = resp.getWriter();
//        writer.println("My session Id=" + id);//+ " "+ session.getAttribute("timestamp"));


//


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
