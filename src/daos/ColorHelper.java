package daos;

import java.sql.*;
import java.util.ArrayList;
import dtos.*;
/**
 *
 * @author Michael
 */
public class ColorHelper {
    protected Connection conn = null;
    //define prepared statements
    
    /**
     * Initializes the PreparedStatements and the connection to the database
     * @param url
     * @param user
     * @param pass 
     */
    public ColorHelper(String url, String user, String pass){
         try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
            if(conn == null){
                throw new Exception("Unable to connect to database");
            }
            //initialize prepared statements
        }catch(Exception e){
            System.out.println("Error in ColorHelper constructor");
            e.printStackTrace();
        }
    }
    
    /**
     * Retrieve all the Colors from the database
     * @return 
     */
    public ArrayList<Color> getColors(){
        ArrayList<Color> colors = new ArrayList<Color>();
        
        return colors;
    }
    
    /**
     * Retrieves a single color from the database by its id
     * @param id
     * @return 
     */
    public Color getColorByID(int id){
        Color color = new Color();
        
        return color;
    }
}