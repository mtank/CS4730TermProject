package dtos;

/**
 *
 * @author Michael
 */
public class Tag {
    
    private int tid;
    private int sid;
    private String value;
    
    /**
     * No argument constructor of a Tag object
     */
    public Tag(){
        this.tid = 0;
        this.sid = 0;
        this.value = null;
    }
    
    /**
     * Tag object constructor
     * @param a_tid
     * @param a_sid
     * @param a_value 
     */
    public Tag(int a_tid, int a_sid, String a_value){
        this.tid = a_tid;
        this.sid = a_sid;
        this.value = a_value;
    }

    /**
     * @return the tid
     */
    public int getTid() {
        return tid;
    }

    /**
     * @param tid the tid to set
     */
    public void setTid(int tid) {
        this.tid = tid;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
