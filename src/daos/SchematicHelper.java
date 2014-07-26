package daos;

import java.sql.*;
import java.util.ArrayList;
import dtos.*;
/**
 *
 * @author Michael
 */
public class SchematicHelper {
    protected Connection conn = null;
    //define prepared statements
    
    /**
     * SchematicHelper constructor
     * @param url
     * @param user
     * @param pass 
     */
    public SchematicHelper(String url, String user, String pass){
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
     * Retrieve all the schematics from the database
     * @return 
     */
    public ArrayList<Schematic> getSchematics() {
        ArrayList<Schematic> schems = new ArrayList<Schematic>();
        
        return schems;
    }
    
    /**
     * Retrieve all of a user's schematics
     * @param uid
     * @return 
     */
    public ArrayList<Schematic> getSchematicsByUser(int uid){
        ArrayList<Schematic> schems = new ArrayList<Schematic>();
        
        return schems;
    }
    
    /**
     * Retrieves a specific schematic from the database
     * @param id
     * @return 
     */
    public Schematic getSchematicByID(int id){
        Schematic schem = new Schematic();
        
        return schem;
    }
    
    /**
     * Adds a schematic to the database; if successful, will return the new schematic id. If unsuccessful will
     * return -1
     * @param n_schem
     * @return 
     */
    public int addSchematic(Schematic n_schem){
        return -1;
    }
    
    /**
     * Updates a schematic in the database returning 1 if successful or 0 if unsuccessful
     * @param u_schem
     * @return 
     */
    public int updateSchematic(Schematic u_schem){
        return 0;
    }
}
