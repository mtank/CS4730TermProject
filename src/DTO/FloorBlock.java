package DTO;

/**
 *
 * @author Michael
 */
public class FloorBlock {
    
    private int fid;
    private int x;
    private int y;
    private Block block;
    
    /**
     * No argument FloorBlock constructor
     */
    public FloorBlock() {
        this.fid = 0;
        this.x = -1;
        this.y = -1;
        this.block = null;
    }
    
    /**
     * FloorBlock constructor
     * @param a_fid
     * @param a_x
     * @param a_y
     * @param a_block 
     */
    public FloorBlock(int a_fid, int a_x, int a_y, Block a_block){
        this.fid = a_fid;
        this.x = a_x;
        this.y = a_y;
        this.block = a_block;
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
    public Block getBlock() {
        return block;
    }

    /**
     * @param block the block to set
     */
    public void setBlock(Block block) {
        this.block = block;
    }
}
