package it.academy;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

@WebServlet(name = "FirstServlet", urlPatterns = "/test")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1l;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String realPath = getServletContext().getRealPath("/count.txt");
        int number = 0;

        try (
                DataInputStream output = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(realPath)));
        ) {
            number = output.readInt();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String count = String.valueOf(number + 1);
        String text =" You visited this page " + count + " times";


        resp.setContentType("image/jpeg");
        BufferedImage image = new BufferedImage(850, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setFont(new Font("Serif",Font.CENTER_BASELINE,48));
        graphics.setColor(Color.CYAN);
        graphics.drawString(text,100,100);
        ServletOutputStream stream = resp.getOutputStream();
        ImageIO.write(image,"jpeg",stream);



        try (DataOutputStream input = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(realPath)));) {
            input.writeInt(Integer.parseInt(count));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doGet(req, resp);
    }
}
