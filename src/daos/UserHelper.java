package daos;

import java.sql.*;
import java.util.ArrayList;
import dtos.*;
/**
 *
 * @author Michael
 */
public class UserHelper {
    protected Connection conn = null;
    //define prepared statements
    protected PreparedStatement getAllUsers;
    protected PreparedStatement getUserByID;
    protected PreparedStatement validateUser;
    protected PreparedStatement addUser;
    protected PreparedStatement updateUser;
    
    public UserHelper(){
        
    }
    
    /**
     * UserHelper constructor; connects to the database and initializes the
     * PreparedStatements
     * @param url
     * @param user
     * @param pass 
     */
    public UserHelper(String url, String user, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
            if(conn == null){
                throw new Exception("Unable to connect to database");
            }
            //initialize prepared statements
            //need db dump
            getAllUsers = conn.prepareStatement("select * from users");
            getUserByID = conn.prepareStatement("select * from users where uid = ?");
            validateUser = conn.prepareStatement("select * from users where username = ? and password = ?");
            addUser = conn.prepareStatement("insert into users (username, password, email) values (?, ?, ?)");
            //updateUser = conn.prepareStatement("update users set [...] where [id] = ?");
        }catch(Exception e){
            System.out.println("Error in UserHelper constructor");
            e.printStackTrace();
        }
    }
    
    /**
     * Retrieves a list of all the users in the database
     * @return 
     */
    public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();
        int uid = 0;
        String username = null;
        String pass = null;
        String email = null;
        Date lli = null;
        ResultSet rs;
        try{
            rs = getAllUsers.executeQuery();
            while(rs.next()){
                uid = rs.getInt("uid");
                username = rs.getString("username");
                pass = rs.getString("password");
                email = rs.getString("email");
                lli = rs.getDate("last_access");
                users.add(new User(uid, username, pass, email, lli));
            }
        }catch(Exception e){
            System.out.println("error in userhelper getUsers");
            e.printStackTrace();
        }
        return users;
    }
    
    /**
     * Retrieves a single user from the database based on an id
     * @return 
     */
    public User getUserByID(){
        User user = new User();
        int uid = 0;
        String username = null;
        String pass = null;
        String email = null;
        Date lli = null;
        ResultSet rs;
        try{
            rs = getUserByID.executeQuery();
            while(rs.next()){
                uid = rs.getInt("uid");
                username = rs.getString("username");
                pass = rs.getString("password");
                email = rs.getString("email");
                lli = rs.getDate("last_access");
            }
            user = new User(uid, username, pass, email, lli);
        }catch(Exception e){
            System.out.println("error in userhelper getUsers");
            e.printStackTrace();
        }
        return user;
    }
    
    /**
     * Attempts to validate a user login. If the user has supplied the
     * correct login information, a user object is returned; else null
     * is returned
     * @param username
     * @param password
     * @return 
     */
    public User validateUser(String username, String password){
        User user = null;
        int uid = 0;
        String email = "";
        Date last_access = null;
        ResultSet rs;
        try{
           validateUser.setString(1, username);
           validateUser.setString(2, password);
           rs = validateUser.executeQuery();
           while(rs.next()){
               uid = rs.getInt("uid");
               email = rs.getString("email");
               last_access = rs.getDate("last_access");
           }
           user = new User(uid, username, password, email, last_access);
        }catch(Exception e){
            System.out.println("error in userhelper validateUser");
            e.printStackTrace();
        }
        return user;
    }
    
    /**
     * Adds a new user to the database. If the database call is successful 1 is
     * returned; otherwise, -1 is returned
     * @param newUser
     * @return 
     */
    public int addUser(User newUser){
        return -1;
    }
    
    public void setId(int id){
        try{
            getUserByID.setInt(1, id);
        }catch(Exception e){
            System.out.println("error in userHelper setId");
            e.printStackTrace();
        }
    }

}
