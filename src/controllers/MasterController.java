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
@WebServlet({
    "/create",
    "/index",
    "/profile",
    "/schematic",
    "/view"
})
public class MasterController extends HttpServlet {
    /**
     * get method
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        RequestDispatcher dispatcher;
        ServletContext ctx;
        try{
            ctx=this.getServletContext();
            //get all attributes from jsp
            String c_name = request.getParameter("name");
            String c_tags = request.getParameter("tags");
            String s_search = request.getParameter("search");
            
            String userPath = request.getServletPath();
            if(userPath.equals("/create")){
                
            }else if(userPath.equals("/index")){
                
            }else if(userPath.equals("/profile")){
                
            }else if(userPath.equals("/schematic")){
                
            }else if(userPath.equals("/view")){
                
            }else{
                
            }
        }catch(Exception e){
            System.out.println("master controller get");
            e.printStackTrace();
        }
    }
    
    /**
     * post method
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
            //get all attributes from jsp
            String userPath = request.getServletPath();
            if(userPath.equals("/create")){
                
            }else if(userPath.equals("/index")){
                
            }else if(userPath.equals("/profile")){
                
            }else if(userPath.equals("/schematic")){
                
            }else if(userPath.equals("/view")){
                
            }else{
                
            }
        }catch(Exception e){
            System.out.println("master controller post");
            e.printStackTrace();
        }
    }
}
