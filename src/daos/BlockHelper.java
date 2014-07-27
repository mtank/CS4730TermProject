package daos;

import java.sql.*;
import java.util.ArrayList;
import dtos.*;
/**
 *
 * @author Michael
 */
public class BlockHelper {
    protected Connection conn = null;
    //define prepared statements
    protected PreparedStatement getAllBlocks;
    protected PreparedStatement getBlockByID;
    
    public BlockHelper(){
        
    }
    
    /**
     * Initializes the connection to the database and the PreparedStatements
     * @param url
     * @param user
     * @param pass 
     */
    public BlockHelper(String url, String user, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
            if(conn == null){
                throw new Exception("Unable to connect to database");
            }
            //initialize prepared statements
            getAllBlocks = conn.prepareStatement("select * from blocks");
            getBlockByID = conn.prepareStatement("select * from blocks where bid = ?");
        }catch(Exception e){
            System.out.println("Error in BlockHelper constructor");
            e.printStackTrace();
        }
    }
    
    /**
     * Retrieve all the Blocks from the database
     * @return 
     */
    public ArrayList<Block> getBlocks(){
        ArrayList<Block> blocks = new ArrayList<Block>();
        int bid = 0;
        String name = "";
        String meta_name="";
        String pic_url = "";
        ResultSet rs;
        try{
            rs = getAllBlocks.executeQuery();
            while(rs.next()){
                bid=rs.getInt("bid");
                name=rs.getString("name");
                meta_name=rs.getString("meta_name");
                pic_url=rs.getString("pic_url");
                blocks.add(new Block(bid, name, meta_name, pic_url));
            }
        }catch(Exception e){
            System.out.println("error in block helper get blcoks");
            e.printStackTrace();
        }
        
        return blocks;
    }
    
    /**
     * Retrieves a block from the database based on its id
     * @return 
     */
    public Block getBlockById(){
        Block block = new Block();
        int bid = 0;
        String name = "";
        String meta_name="";
        String pic_url = "";
        ResultSet rs;
        try{
            rs = getBlockByID.executeQuery();
            while(rs.next()){
                bid=rs.getInt("bid");
                name=rs.getString("name");
                meta_name=rs.getString("meta_name");
                pic_url=rs.getString("pic_url");
            }                
            block =new Block(bid, name, meta_name, pic_url);
        }catch(Exception e){
            System.out.println("error in block helper get blcoks");
            e.printStackTrace();
        }
        return block;
    }
    
    public void setBid(int id){
        try{
            getBlockByID.setInt(1, id);
        }catch(Exception e){
            System.out.println("error in blockHelper setBid");
            e.printStackTrace();
        }
    }
}
