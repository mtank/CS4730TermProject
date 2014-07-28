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
    protected PreparedStatement getAllSchematics;
    protected PreparedStatement getAllSchematicsByUID;
    protected PreparedStatement getSchematicByID;
    protected PreparedStatement addSchematic;
    protected PreparedStatement updateSchematic;
    
    public SchematicHelper(){
        
    }
    
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
            getAllSchematics = conn.prepareStatement("select * from schematics");
            getAllSchematicsByUID = conn.prepareStatement("select * from schematics where owner_uid = ?");
            getSchematicByID = conn.prepareStatement("select * from schematics where sid = ?");
            addSchematic = conn.prepareStatement("insert into schematics (owner_uid, name, size) values (?, ?, ?)");
            //updateSchematic = conn.prepareStatement("update [schematic] set [columns] = ? where [id] = ?");
            
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
        int sid = 0;
        int uid = 0;
        String name ="";
        int size=0;
        ResultSet rs;
        try{
            rs = getAllSchematics.executeQuery();
            while(rs.next()){
                sid =rs.getInt("sid");
                uid=rs.getInt("owner_uid");
                name=rs.getString("name");
                size=rs.getInt("size");
                schems.add(new Schematic(sid, uid, name, size));
            }
        }catch(Exception e){
            System.out.println("error in schematichelper getschematic");
            e.printStackTrace();
        }
    
        return schems;
    }
    
    /**
     * Retrieve all of a user's schematics
     * @return 
     */
    public ArrayList<Schematic> getSchematicsByUser(){
        ArrayList<Schematic> schems = new ArrayList<Schematic>();
        int sid = 0;
        int uid = 0;
        String name ="";
        int size=0;
        ResultSet rs;
        try{
            rs = getAllSchematicsByUID.executeQuery();
            while(rs.next()){
                sid =rs.getInt("sid");
                uid=rs.getInt("owner_uid");
                name=rs.getString("name");
                size=rs.getInt("size");
                schems.add(new Schematic(sid, uid, name, size));
            }
        }catch(Exception e){
            System.out.println("error in schematichelper getschematic");
            e.printStackTrace();
        }
        return schems;
    }
    
    /**
     * Retrieves a specific schematic from the database
     * @return 
     */
    public Schematic getSchematicByID(){
        Schematic schem = new Schematic();
        int sid = 0;
        int uid = 0;
        String name ="";
        int size=0;
        ResultSet rs;
        try{
            rs = getSchematicByID.executeQuery();
            while(rs.next()){
                sid =rs.getInt("sid");
                uid=rs.getInt("owner_uid");
                name=rs.getString("name");
                size=rs.getInt("size");
            }
            schem = new Schematic(sid, uid, name, size);
        }catch(Exception e){
            System.out.println("error in schematichelper getschematic");
            e.printStackTrace();
        }
        return schem;
    }
    
    /**
     * Adds a schematic to the database; if successful, will return the new schematic id. If unsuccessful will
     * return -1
     * @param n_schem
     * @return 
     */
    public int addSchematic(Schematic n_schem){
        try{
            addSchematic.setInt(1, n_schem.getOwner_uid());
            addSchematic.setString(2, n_schem.getName());
            addSchematic.setInt(3, n_schem.getSize());
        }catch(Exception e){
            System.out.println("add schematic set query");
            e.printStackTrace();
        }
        int sid=0;
        int q=0;
        ResultSet rs;
        try{
            q=addSchematic.executeUpdate();
            if(q==1){
                rs=addSchematic.getGeneratedKeys();
                while(rs.next()){
                    sid=rs.getInt(1);
                    if(sid<=0)
                        sid=-1;
                }
            }
        }catch(Exception e){
            System.out.println("add schematic execute");
            e.printStackTrace();
        }
        return sid;
    }
    
    /**
     * Updates a schematic in the database returning 1 if successful or 0 if unsuccessful
     * @param u_schem
     * @return 
     */
    public int updateSchematic(Schematic u_schem){
        return 0;
    }
    
    public void setOwner_uid(int id){
        try{
            getAllSchematicsByUID.setInt(1, id);
        }catch(Exception e){
            System.out.println("error in schematicHelper setOwner_uid");
            e.printStackTrace();
        }
    }
    
    public void setSid(int id){
        try{
            getSchematicByID.setInt(1, id);
        }catch(Exception e){
            System.out.println("error in schematicHelper setSid");
            e.printStackTrace();
        }
    }
}
