package daos;

import java.sql.*;
import java.util.ArrayList;
import dtos.*;
/**
 *
 * @author Michael
 */
public class FloorBlockHelper {
    protected Connection conn = null;
    //define prepared statements
    protected PreparedStatement getAllFloorBlocks;
    protected PreparedStatement getFloorBlocksByFID;
    protected PreparedStatement getFloorBlockByFXY;
    protected PreparedStatement addFloorBlock;
    protected PreparedStatement updateFloorBlock;
    
    /**
     * FloorBlockHelper constructor
     * @param url
     * @param user
     * @param pass 
     */
    public FloorBlockHelper(String url, String user, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
            if(conn == null){
                throw new Exception("Unable to connect to database");
            }
            //initialize prepared statements
            getAllFloorBlocks = conn.prepareStatement("select * from [floor_blocks]");
            getFloorBlocksByFID = conn.prepareStatement("select * from [floor_blocks] where [fid] = ?");
            getFloorBlockByFXY = conn.prepareStatement("select * from [floor_blocks] where [fid] = ?, [x] = ?, [y] =?");
            addFloorBlock = conn.prepareStatement("insert into [floor_block] ([columns]) value (?)");
            updateFloorBlock = conn.prepareStatement("update [floor_blocks] set [columns] = ? where fid= ?, [x] = ?, [y] =?");
            }catch(Exception e){
            System.out.println("Error in ColorHelper constructor");
            e.printStackTrace();
        }
    }
    
    /**
     * Retrieves all the FloorBlocks from the database
     * @return 
     */
    public ArrayList<FloorBlock> getFloorBlocks(){
        ArrayList<FloorBlock> floorBlocks = new ArrayList<FloorBlock>();
        
        return floorBlocks;
    }
    
    /**
     * Retrieve all the FloorBlocks of a floor
     * @param fid
     * @return 
     */
    public ArrayList<FloorBlock> getFloorBlocksByFID(int fid){
        ArrayList<FloorBlock> floorBlocks = new ArrayList<FloorBlock>();
        
        return floorBlocks;
    }
    
    /**
     * Retrieve a specific unique FloorBlock
     * @param fid
     * @param x
     * @param y
     * @return 
     */
    public FloorBlock getFloorBlockByFXY(int fid, int x, int y){
        FloorBlock floorBlock = new FloorBlock();
        
        return floorBlock;
    }
    
    /**
     * Adds a FloorBlock to the database returning either the fid or -1
     * @param n_floor_block
     * @return 
     */
    public int addFloorBlock(FloorBlock n_floor_block){
        return -1;
    }
    
    /**
     * Update a FloorBlock in the database returning 1 if successful or -1 if unsuccessful
     * @param u_floor_block
     * @return 
     */
    public int udpateFloorBlock(FloorBlock u_floor_block){
        return 0;
    }
}
