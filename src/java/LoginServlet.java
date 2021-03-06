import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rex
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            RequestDispatcher disp ;
            String role = request.getParameter("role");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if(role.equalsIgnoreCase("client")){
                String query="select * from clients where Email = '" + username +"'";
                ResultSet rs = JdbcConnector.excuteQuery(query);
                if(rs.first()){
                    if (rs.getString("Passwords").equals(password)){
                         //go to success pageo              
                    }
                     else
                    {
                         disp = request.getRequestDispatcher("/index.jsp");
                         disp.forward(request, response);
                                  
                    }
                }
            }
            
            if(role.equalsIgnoreCase("employee")){
                String query="select * from Employees where SSN = '" + username +"'";
                ResultSet rs = JdbcConnector.excuteQuery(query);
                if(rs.first()){
                         disp = request.getRequestDispatcher("employeePage.jsp");
                         disp.forward(request, response);
                }
            }
            
           if(role.equalsIgnoreCase("manager")){
                if(username.equalsIgnoreCase("admin")){
                    if(password.equals("amdin")){
                        //go to admin page
                    }else{
                         disp = request.getRequestDispatcher("/index.jsp");
                         disp.forward(request, response);
                    }
                }else{
                         disp = request.getRequestDispatcher("/index.jsp");
                         disp.forward(request, response);
                }   
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
