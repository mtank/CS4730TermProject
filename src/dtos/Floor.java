package dtos;

/**
 *
 * @author Michael
 */
public class Floor {
    
    private int fid;
    private int sid;
    private int floor_num;
        
    /**
     * No argument constructor of Floor
     */
    public Floor(){
        this.fid = 0;
        this.sid = 0;
        this.floor_num = 0;
    }
    
    /**
     * Floor constructor
     * @param a_fid
     * @param a_sid
     * @param a_floor_num
     */
    public Floor(int a_fid, int a_sid, int a_floor_num){
        this.fid = a_fid;
        this.sid = a_sid;
        this.floor_num = a_floor_num;
    }
     
    /**
     * @return the fid
     */
    public int getFid() {
        return fid;
    }

    /**
     * @param fid the fid to set
     */
    public void setFid(int fid) {
        this.fid = fid;
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
     * @return the floor_num
     */
    public int getFloor_num() {
        return floor_num;
    }

    /**
     * @param floor_num the floor_num to set
     */
    public void setFloor_num(int floor_num) {
        this.floor_num = floor_num;
    }
}
