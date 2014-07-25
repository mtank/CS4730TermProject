package dtos;

/**
 *
 * @author Michael
 */
public class FloorBlock {
    
    private int fid;
    private int x;
    private int y;
    private int bid;
    
    /**
     * No argument FloorBlock constructor
     */
    public FloorBlock() {
        this.fid = 0;
        this.x = -1;
        this.y = -1;
        this.bid = 0;
    }
    
    /**
     * FloorBlock constructor
     * @param a_fid
     * @param a_x
     * @param a_y
     * @param a_bid 
     */
    public FloorBlock(int a_fid, int a_x, int a_y, int a_bid){
        this.fid = a_fid;
        this.x = a_x;
        this.y = a_y;
        this.bid = a_bid;
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
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the block
     */
    public int getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(int bid) {
        this.bid = bid;
    }
}
