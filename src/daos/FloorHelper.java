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
        this("jdbc:mysql://localhost/term_project", "", "");
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
        int fid = 0;
        int sid = 0;
        int floor_num = 0;
        ResultSet rs;
        try{
            rs = getAllFloors.executeQuery();
            while(rs.next()){
                fid=rs.getInt("fid");
                sid=rs.getInt("sid");
                floor_num=rs.getInt("floor_num");
                floors.add(new Floor(fid, sid, floor_num));
            }
        }catch(Exception e){
            System.out.println("error in floor helper");
            e.printStackTrace();
        }
        return floors;
    }
    
    /**
     * Retrieves all of a schematics floors
     * @return 
     */
    public ArrayList<Floor> getFloorsBySID(){
        ArrayList<Floor> floors = new ArrayList<Floor>();
        int fid = 0;
        int sid = 0;
        int floor_num = 0;
        ResultSet rs;
        try{
            rs = getFloorsBySID.executeQuery();
            while(rs.next()){
                fid=rs.getInt("fid");
                sid=rs.getInt("sid");
                floor_num=rs.getInt("floor_num");
                floors.add(new Floor(fid, sid, floor_num));
            }
        }catch(Exception e){
            System.out.println("error in floor helper");
            e.printStackTrace();
        }
        return floors;
    }
    
    /**
     * Retrieves a specific floor from the database
     * @return 
     */
    public Floor getFloorById(){
        Floor floor = new Floor();
        int fid = 0;
        int sid = 0;
        int floor_num = 0;
        ResultSet rs;
        try{
            rs = getAllFloors.executeQuery();
            while(rs.next()){
                fid=rs.getInt("fid");
                sid=rs.getInt("sid");
                floor_num=rs.getInt("floor_num");
            }  
            floor = new Floor(fid, sid, floor_num);
        }catch(Exception e){
            System.out.println("error in floor helper");
            e.printStackTrace();
        }
        return floor;
    }
    
    /**
     * Adds a floor to the database returning either the floor id or -1 if unsuccessful
     * @param n_floor
     * @return 
     */
    public int addFloor(Floor n_floor){
        try{
            addFloor.setInt(1, n_floor.getSid());
            addFloor.setInt(2, n_floor.getFloor_num());
        }catch(Exception e){
            System.out.println("add floor set query");
            e.printStackTrace();
        }
        int fid=0;
        int q=0;
        ResultSet rs;
        try{
            q=addFloor.executeUpdate();
            if(q==1){
                rs=addFloor.getGeneratedKeys();
                while(rs.next()){
                    fid=rs.getInt(1);
                }
                if(fid<=0)
                    fid=-1;
            }
        }catch(Exception e){
            System.out.println("add floor execute");
            e.printStackTrace();
        }
        return fid;
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
