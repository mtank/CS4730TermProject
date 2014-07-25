package dtos;

import java.sql.Date;
/**
 *
 * @author Michael
 */
public class User {
    private int uid;
    private String username;
    private String password;
    private String email;
    private Date last_access;
    
    /**
     * No argument User constructor
     */
    public User(){
        this.uid = 0;
        this.username = null;
        this.password = null;
        this.email = null;
        this.last_access = null;
    }
    
    /**
     * User constructor
     * @param a_uid
     * @param a_username
     * @param a_password
     * @param a_email
     * @param a_date 
     */
    public User(int a_uid, String a_username, String a_password, String a_email, Date a_date){
        this.uid = a_uid;
        this.username = a_username;
        this.password = a_password;
        this.email = a_email;
        this.last_access = a_date;
    }

    /**
     * @return the uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the last_access
     */
    public Date getLast_access() {
        return last_access;
    }

    /**
     * @param last_access the last_access to set
     */
    public void setLast_access(Date last_access) {
        this.last_access = last_access;
    }
}
