
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dhananjay Gupta
 */
public class TaxProcessing extends HttpServlet{
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //reads the request
        String s1 =request.getParameter("t1");
        String s2 =request.getParameter("t2");
        String s[] = request.getParameterValues("assets");
        String s3 = request.getParameter("Senior Citizen");
        
        int rebate =0;
        if(s3!=null){
        rebate=500;
        }
        
        //process the request
        int surcharge = 0;
        if (s!=null)
        {
            surcharge = s.length*1000;
        }
        
        int i= Integer.parseInt(s1);
        int a = Integer.parseInt(s2);
        int tax=0;
        if(i>500000)
        {
            tax = i*20/100;
        }
        else if (i>=300000){
            tax = i*10/100;
        }
        if(a>60){
        tax = tax-(tax*10/100);
        }
        
        //sends the response
        PrintWriter out= response.getWriter();
        out.println("<html>");
        out.println("<body bgcolor=pink>");
        out.println("<h2>Income Tax Department</h2>");
        out.println("<table border=2>");
        out.println("<tr>");
        out.println("<td>Income</td>");
        out.println("<td>"+i+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Age</td>");
        out.println("<td>"+a+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Tax</td>");
        out.println("<td>"+tax+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Surcharge</td>");
        out.println("<td>"+surcharge+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Rebate</td>");
        out.println("<td>"+rebate+"</td>");
        out.println("</tr>");
        
        out.println("</table>");
        out.println("<h3>Assets Declared By You : </h3>");
        
        if (s!=null){
            out.println("<ol>");
            for (String item : s) {
                out.println("<li>");
                out.println(item);
                out.println("</li>");
            }
            out.println("</ol>");
        }
        else{
            out.println("<h3>No Assests Declared</h3>");
        }
        
        out.println("<marquee>Pay Your Taxes Before 31st March</marquee>");
        out.println("</body>");
        out.println("</html>");
        out.close();
        
    }
    
}