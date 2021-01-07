package it.academy;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;



@WebServlet(name = "FirstServlet", urlPatterns = "/test")
public class FirstServlet extends HttpServlet {
//    private static final long serialVersionUID = 1l;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();

        String info1 = req.getHeader("Accept");
        String info2 = req.getHeader("Accept-Charset");
        String info3 = req.getHeader("Accept-Encoding");
        String info4 = req.getHeader("Accept-Language");
        String info5 = req.getHeader("Host");
        String info6 = req.getHeader("Referer");
        String info7 = req.getHeader("User-Agent");

        out.println("<html>"
                + "<head>"
                + "<title>Task11</title>"
                + "</head>"
                + "<body>"
                + "<h3>Accept = (" + info1 + ")</h3>"
                + "<h3>Accept-Charset = (" + info2 + ")</h3>"
                + "<h3>Accept-Encoding = (" + info3 + ")</h3>"
                + "<h3>Accept-Language = (" + info4 + ")</h3>"
                + "<h3>Host = (" + info5 + ")</h3>"
                + "<h3>Referer = (" + info6 + ")</h3>"
                + "<h3>User-Agent = (" + info7 + ")</h3>"

                //    + "<h3> Welcome user " + info + " </h3>"
                + "</body>"
                + "</html>");
        String  browserDetails  =   req.getHeader("User-Agent");
        String  userAgent       =   browserDetails;
        String  user            =   userAgent.toLowerCase();

        String os = "";
        String browser = "";
        out.println("User Agent for the request is===>"+browserDetails+"\n");

       // log.info("User Agent for the request is===>"+browserDetails);
        //=================OS=======================
        if (userAgent.toLowerCase().indexOf("windows") >= 0 )
        {
            os = "Windows";
        } else if(userAgent.toLowerCase().indexOf("mac") >= 0)
        {
            os = "Mac";
        } else if(userAgent.toLowerCase().indexOf("x11") >= 0)
        {
            os = "Unix";
        } else if(userAgent.toLowerCase().indexOf("android") >= 0)
        {
            os = "Android";
        } else if(userAgent.toLowerCase().indexOf("iphone") >= 0)
        {
            os = "IPhone";
        }else{
            os = "UnKnown, More-Info: "+userAgent;
        }
        //===============Browser===========================
        if (user.contains("msie"))
        {
            String substring=userAgent.substring(userAgent.indexOf("MSIE")).split(";")[0];
            browser=substring.split(" ")[0].replace("MSIE", "IE")+"-"+substring.split(" ")[1];
        } else if (user.contains("safari") && user.contains("version"))
        {
            browser=(userAgent.substring(userAgent.indexOf("Safari")).split(" ")[0]).split("/")[0]+"-"+(userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
        } else if ( user.contains("opr") || user.contains("opera"))
        {
            if(user.contains("opera"))
                browser=(userAgent.substring(userAgent.indexOf("Opera")).split(" ")[0]).split("/")[0]+"-"+(userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
            else if(user.contains("opr"))
                browser=((userAgent.substring(userAgent.indexOf("OPR")).split(" ")[0]).replace("/", "-")).replace("OPR", "Opera");
        } else if (user.contains("chrome"))
        {
            browser=(userAgent.substring(userAgent.indexOf("Chrome")).split(" ")[0]).replace("/", "-");
        } else if ((user.indexOf("mozilla/7.0") > -1) || (user.indexOf("netscape6") != -1)  || (user.indexOf("mozilla/4.7") != -1) || (user.indexOf("mozilla/4.78") != -1) || (user.indexOf("mozilla/4.08") != -1) || (user.indexOf("mozilla/3") != -1) )
        {
            //browser=(userAgent.substring(userAgent.indexOf("MSIE")).split(" ")[0]).replace("/", "-");
            browser = "Netscape-?";

        } else if (user.contains("firefox"))
        {
            browser=(userAgent.substring(userAgent.indexOf("Firefox")).split(" ")[0]).replace("/", "-");
        } else if(user.contains("rv")) {
            browser = "IE-" + user.substring(user.indexOf("rv") + 3, user.indexOf(")"));
//        } else if(user.contains("edg")){browser=(userAgent.substring(userAgent.indexOf("Edg")));}
        } else
        {
            browser = "UnKnown, More-Info: "+userAgent;
        }
        out.println("Operating System======>"+os+"\n");
        out.println("Browser Name==========>"+browser+"\n");
    //    log.info("Operating System======>"+os);
     //   log.info("Browser Name==========>"+browser);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
