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
            getAllBlocks = conn.prepareStatement("select * from [blocks]");
            getBlockByID = conn.prepareStatement("select * from [blocks] where [id] = ?");
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
        
        return blocks;
    }
    
    /**
     * Retrieves a block from the database based on its id
     * @param id
     * @return 
     */
    public Block getBlockById(int id){
        Block block = new Block();
        
        return block;
    }
}
