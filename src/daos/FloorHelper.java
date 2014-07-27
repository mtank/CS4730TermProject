package daos;

import java.sql.*;
import java.util.ArrayList;
import dtos.*;
/**
 *
 * @author Michael
 */
public class FloorHelper {
    protected Connection conn = null;
    //define prepared statements
    protected PreparedStatement getAllFloors;
    protected PreparedStatement getFloorsBySID;
    protected PreparedStatement getFloorByID;
    protected PreparedStatement addFloor;
    protected PreparedStatement updateFloor;
    
    public FloorHelper(){
    
    }
    
    /**
     * FloorHelper constructor
     * @param url
     * @param user
     * @param pass 
     */
    public FloorHelper(String url, String user, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
            if(conn == null){
                throw new Exception("Unable to connect to database");
            }
            //initialize prepared statements
            getAllFloors = conn.prepareStatement("select * from floors");
            getFloorsBySID = conn.prepareStatement("select * from floors where sid = ?");
            getFloorByID = conn.prepareStatement("select * from floors where fid = ?");
            addFloor = conn.prepareStatement("insert into floors (sid, floor_num) values (?, ?)");
            //updateFloor = conn.prepareStatement("update [floors] set [columns] = ? where [id] = ?");
        }catch(Exception e){
            System.out.println("Error in ColorHelper constructor");
            e.printStackTrace();
        }
    }
    
    /**
     * Retrieves all the floors from the database
     * @return 
     */
    public ArrayList<Floor> getFloors(){
        ArrayList<Floor> floors = new ArrayList<Floor>();
        
        return floors;
    }
    
    /**
     * Retrieves all of a schematics floors
     * @return 
     */
    public ArrayList<Floor> getFloorsBySID(){
        ArrayList<Floor> floors = new ArrayList<Floor>();
        
        return floors;
    }
    
    /**
     * Retrieves a specific floor from the database
     * @return 
     */
    public Floor getFloorById(){
        Floor floor = new Floor();
        
        return floor;
    }
    
    /**
     * Adds a floor to the database returning either the floor id or -1 if unsuccessful
     * @param n_floor
     * @return 
     */
    public int addFloor(Floor n_floor){
        return -1;
    }
    
    /**
     * Updates a floor in the database returning 1 if successful or 0 if unsuccessful
     * @param u_floor
     * @return 
     */
    public int updateFloor(Floor u_floor){
        return 0;
    }
    
    public void setSid(int id){
        try{
            getFloorsBySID.setInt(1, id);
        }catch(Exception e){
            System.out.println("error in floorHelper setSid");
            e.printStackTrace();
        }
    }
    
    public void setFid(int id){
        try{
            getFloorByID.setInt(1, id);
        }catch(Exception e){
            System.out.println("error in floorHelper setFId");
            e.printStackTrace();
        }
    }
}
