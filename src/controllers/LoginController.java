package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import daos.*;
import dtos.*;
/**
 *
 * @author Michael
 */
@WebServlet(
        {
            "/login"
        }
)
public class LoginController extends HttpServlet {
    
    /**
     * GET actions
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
    }
    
    /**
     * POST actions
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        ServletContext ctx;
        try{
            ctx=this.getServletContext();
            
            String username = request.getParameter("name");//username
            String password = request.getParameter("pass");//password
            
            username=username.trim();
            password=password.trim();
            
            //will need to hash password
            String hash_pass=null;
            
            UserHelper userhelper = new UserHelper();
            User user = userhelper.validateUser(username, hash_pass);
            if(user!=null){
                request.getSession().setAttribute("user", user);
                dispatcher = ctx.getRequestDispatcher(null);//location of where to go next
            }else{
                dispatcher = ctx.getRequestDispatcher(null);//needs to be login page
            }
            dispatcher.forward(request, response);
        }catch(Exception e){
            System.out.println("login controller doPost");
            e.printStackTrace();
            response.sendRedirect(null);//where to send if login error possibly login page again
        }
    }
}
