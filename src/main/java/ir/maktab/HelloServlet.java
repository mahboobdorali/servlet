package ir.maktab;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet {
    ServletConfig config = null;

    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("servlet is initialized");
    }

    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>aleyk</b>");
        out.print("</body></html>");

        System.out.println("one servletRequest is processed!!");
    }

    public void destroy() {
        System.out.println("servlet is destroyed");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "I am HelloServlet";
    }
}
