package it.academy;


import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.BrowserType;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;



@WebServlet(name = "FirstServlet", urlPatterns = "/test")
public class FirstServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        UserAgent userAgent = UserAgent.parseUserAgentString(req.getHeader("User-Agent"));
        Browser browser = userAgent.getBrowser();
        Version browserVersion = userAgent.getBrowserVersion();
       // BrowserType browserType = browser.getBrowserType();
       // /if()
        PrintWriter out = resp.getWriter();
        String browserName = browser.getName();
        if(browserName.toLowerCase().contains("firefox")){
            out.println("Hello userbrowser= "+browser);
        }
        out.println("browser= "+browser);
        //out.println("browserType"+browserType);
//        out.println("BrowserVersion = "+browserVersion);
//


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
