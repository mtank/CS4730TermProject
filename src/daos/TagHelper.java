package daos;

import java.sql.*;
import java.util.ArrayList;
import dtos.*;
/**
 *
 * @author Michael
 */
public class TagHelper {
    protected Connection conn = null;
    //define prepared statements
    protected PreparedStatement getAllTags;
    protected PreparedStatement getTagByID;
    protected PreparedStatement getTagsBySID;
    protected PreparedStatement addTag;
    
    /**
     * TagHelper constructor
     * @param url
     * @param user
     * @param pass 
     */
    public TagHelper(String url, String user, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
            if(conn == null){
                throw new Exception("Unable to connect to database");
            }
            //initialize prepared statements
            getAllTags = conn.prepareStatement("select * from [tags]");
            getTagByID = conn.prepareStatement("select * from [tags] where [id] =?");
            getTagsBySID = conn.prepareStatement("select * from [tags] where [sid] = ?");
            addTag = conn.prepareStatement("insert into [tags] ([columns]) values (?)");
        }catch(Exception e){
            System.out.println("Error in ColorHelper constructor");
            e.printStackTrace();
        }
    }
    
    /**
     * Retrieves all the tags from the database
     * @return 
     */
    public ArrayList<Tag> getTags(){
        ArrayList<Tag> tags = new ArrayList<Tag>();
        
        return tags;
    }
    
    /**
     * Retrieve all of schematic's tags
     * @param sid
     * @return 
     */
    public ArrayList<Tag> getTagsBySID(int sid){
        ArrayList<Tag> tags = new ArrayList<Tag>();
        
        return tags;
    }
    
    /**
     * Retrieves a single tag from the database
     * @param id
     * @return 
     */
    public Tag getTagByID(int id){
        Tag tag = new Tag();
        
        return tag;
    }
    
    /**
     * Adds a tag to the database and returns either the tag id or -1
     * @param n_tag
     * @return 
     */
    public int addTag(Tag n_tag){
        return -1;
    }
}
