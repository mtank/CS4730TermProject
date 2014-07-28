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
    
    public TagHelper(){
        
    }
    
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
            getAllTags = conn.prepareStatement("select * from tags");
            getTagByID = conn.prepareStatement("select * from tags where tid =?");
            getTagsBySID = conn.prepareStatement("select * from tags where sid = ?");
            addTag = conn.prepareStatement("insert into tags (sid, value) values (?, ?)");
        }catch(Exception e){
            System.out.println("Error in TagHelper constructor");
            e.printStackTrace();
        }
    }
    
    /**
     * Retrieves all the tags from the database
     * @return 
     */
    public ArrayList<Tag> getTags(){
        ArrayList<Tag> tags = new ArrayList<Tag>();
        int tid=0;
        int sid=0;
        String value="";
        ResultSet rs;
        try{
            rs=getAllTags.executeQuery();
            while(rs.next()){
                tid=rs.getInt("tid");
                sid=rs.getInt("sid");
                value=rs.getString("value");
                tags.add(new Tag(tid,sid,value));
            }
        }catch(Exception e){
            System.out.println("error in tagHelper");
            e.printStackTrace();
        }
        return tags;
    }
    
    /**
     * Retrieve all of schematic's tags
     * @return 
     */
    public ArrayList<Tag> getTagsBySID(){
        ArrayList<Tag> tags = new ArrayList<Tag>();
        int tid=0;
        int sid=0;
        String value="";
        ResultSet rs;
        try{
            rs=getTagsBySID.executeQuery();
            while(rs.next()){
                tid=rs.getInt("tid");
                sid=rs.getInt("sid");
                value=rs.getString("value");
                tags.add(new Tag(tid,sid,value));
            }
        }catch(Exception e){
            System.out.println("error in tagHelper");
            e.printStackTrace();
        }
        return tags;
    }
    
    /**
     * Retrieves a single tag from the database
     * @return 
     */
    public Tag getTagByID(){
        Tag tag = new Tag();
        int tid=0;
        int sid=0;
        String value="";
        ResultSet rs;
        try{
            rs=getTagByID.executeQuery();
            while(rs.next()){
                tid=rs.getInt("tid");
                sid=rs.getInt("sid");
                value=rs.getString("value");
                tag=new Tag(tid,sid,value);
            }
        }catch(Exception e){
            System.out.println("error in tagHelper");
            e.printStackTrace();
        }
        return tag;
    }
    
    /**
     * Adds a tag to the database and returns either the tag id or -1
     * @param n_tag
     * @return 
     */
    public int addTag(Tag n_tag){
        try{
            addTag.setInt(1, n_tag.getSid());
            addTag.setString(2, n_tag.getValue());
        }catch(Exception e){
            System.out.println("add tag set query");
            e.printStackTrace();
        }
        int tid = 0;
        int q=0;
        ResultSet r;
        try{
            q=addTag.executeUpdate();
            if(q==1){
                r=addTag.getGeneratedKeys();
                while(r.next()){
                    tid=r.getInt(1);
                    if(tid<=0)
                        tid=-1;
                }
            }
        }catch(Exception e){
            System.out.println("add tag execute");
            e.printStackTrace();
        }
        return tid;
    }
    
    public void setTid(int id){
        try{
            getTagByID.setInt(1, id);
        }catch(Exception e){
            System.out.println("error in tagHelper settid");
            e.printStackTrace();
        }
    }
    
    public void setSid(int sid){
        try{
            getTagsBySID.setInt(1, sid);
        }catch(Exception e){
            System.out.println("error in taghelper setsid");
            e.printStackTrace();
        }
    }
}
