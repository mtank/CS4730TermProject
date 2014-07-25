package DTO;

/**
 *
 * @author Michael
 */
public class Color {
    
    private int cid;
    private String name;
    private int meta_num;
    
    /**
     * No argument constructor of a Color object
     */
    public Color(){
        this.cid = 0;
        this.name = null;
        this.meta_num = 0;
    }
    
    /**
     * Color constructor
     * @param a_cid
     * @param a_name
     * @param a_meta_num 
     */
    public Color(int a_cid, String a_name, int a_meta_num){
        this.cid = a_cid;
        this.name = a_name;
        this.meta_num = a_meta_num;
    }

    /**
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the meta_num
     */
    public int getMeta_num() {
        return meta_num;
    }

    /**
     * @param meta_num the meta_num to set
     */
    public void setMeta_num(int meta_num) {
        this.meta_num = meta_num;
    }
}
