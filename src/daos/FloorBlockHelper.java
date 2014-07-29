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
    
    public FloorBlockHelper(){
        this("jdbc:mysql://localhost/term_project", "root", "");        
    }
    
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
            getAllFloorBlocks = conn.prepareStatement("select * from floor_blocks");
            getFloorBlocksByFID = conn.prepareStatement("select * from floor_blocks where fid = ?");
            getFloorBlockByFXY = conn.prepareStatement("select * from floor_blocks where fid = ?, x = ?, y =?");
            addFloorBlock = conn.prepareStatement("insert into [floor_block] (fid, bid, x, y) value (?, ?, ?, ?)");
            //updateFloorBlock = conn.prepareStatement("update [floor_blocks] set [columns] = ? where fid= ?, [x] = ?, [y] =?");
        }
        catch(Exception e){
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
        int fid=0;
        int bid=0;
        int x=0;
        int y=0;
        ResultSet rs;
        try{
            rs=getAllFloorBlocks.executeQuery();
            while(rs.next()){
                fid=rs.getInt("fid");
                bid=rs.getInt("bid");
                x=rs.getInt("x");
                y=rs.getInt("y");
                floorBlocks.add(new FloorBlock(fid,bid,x,y));
            }
        }catch(Exception e){
            System.out.println("error in floor block helper");
            e.printStackTrace();
        }
        return floorBlocks;
    }
    
    /**
     * Retrieve all the FloorBlocks of a floor
     * @return 
     */
    public ArrayList<FloorBlock> getFloorBlocksByFID(){
        ArrayList<FloorBlock> floorBlocks = new ArrayList<FloorBlock>();
        int fid=0;
        int bid=0;
        int x=0;
        int y=0;
        ResultSet rs;
        try{
            rs=getFloorBlocksByFID.executeQuery();
            while(rs.next()){
                fid=rs.getInt("fid");
                bid=rs.getInt("bid");
                x=rs.getInt("x");
                y=rs.getInt("y");
                floorBlocks.add(new FloorBlock(fid,bid,x,y));
            }
        }catch(Exception e){
            System.out.println("error in floor block helper");
            e.printStackTrace();
        }
        return floorBlocks;
    }
    
    /**
     * Retrieve a specific unique FloorBlock
     * @return 
     */
    public FloorBlock getFloorBlockByFXY(){
        FloorBlock floorBlock = new FloorBlock();
        int fid=0;
        int bid=0;
        int x=0;
        int y=0;
        ResultSet rs;
        try{
            rs=getFloorBlockByFXY.executeQuery();
            while(rs.next()){
                fid=rs.getInt("fid");
                bid=rs.getInt("bid");
                x=rs.getInt("x");
                y=rs.getInt("y");
            }                
            floorBlock=new FloorBlock(fid,bid,x,y);
        }catch(Exception e){
            System.out.println("error in floor block helper");
            e.printStackTrace();
        }
        return floorBlock;
    }
    
    /**
     * Adds a FloorBlock to the database returning either the fid or -1
     * @param n_floor_block
     * @return 
     */
    public int addFloorBlock(FloorBlock n_floor_block){
        try{
            addFloorBlock.setInt(1, n_floor_block.getFid());
            addFloorBlock.setInt(2, n_floor_block.getBid());
            addFloorBlock.setInt(3, n_floor_block.getX());
            addFloorBlock.setInt(4, n_floor_block.getY());
        }catch(Exception e){
            System.out.println("add floor block set query");
            e.printStackTrace();
        }
        int q=0;
        ResultSet rs;
        try{
            q=addFloorBlock.executeUpdate();
            if(q==1){
                return n_floor_block.getFid();
            }
        }catch(Exception e){
            System.out.println("add floor block execute");
            e.printStackTrace();
        }
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
    
    public void setFid(int id){
        try{
            getFloorBlocksByFID.setInt(1, id);
            getFloorBlockByFXY.setInt(1, id);
        }catch(Exception e){
            System.out.println("error in floorblockhelper setfid");
            e.printStackTrace();
        }
        
    }
    
    public void setX(int x){
        try{
            getFloorBlockByFXY.setInt(2, x);
        }catch(Exception e){
            System.out.println("error in floorblockhelper setx");
            e.printStackTrace();
        }
    }
    
    public void setY(int y){
        try{
            getFloorBlockByFXY.setInt(3, y);
        }catch(Exception e){
            System.out.println("error in floorblockhelper sety");
            e.printStackTrace();
        }
    }
}
