package dtos;

/**
 *
 * @author Michael
 */
public class Block {
    private int bid;
    private String name;
    private String meta_name;
    private String pic_url;
    
    /**
     * No argument constructor of a Block
     */
    public Block(){
        this.bid = 0;
        this.name = null;
        this.meta_name = null;
        this.pic_url = null;
    }
    
    /**
     * Block constructor
     * @param a_id
     * @param a_name
     * @param a_meta_name
     * @param a_pic_url 
     */
    public Block(int a_id, String a_name, String a_meta_name, String a_pic_url) {
        this.bid = a_id;
        this.name = a_name;
        this.meta_name = a_meta_name;
        this.pic_url = a_pic_url;
    }

    /**
     * @return the bid
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
     * @return the meta_name
     */
    public String getMeta_name() {
        return meta_name;
    }

    /**
     * @param meta_name the meta_name to set
     */
    public void setMeta_name(String meta_name) {
        this.meta_name = meta_name;
    }

    /**
     * @return the pic_url
     */
    public String getPic_url() {
        return pic_url;
    }

    /**
     * @param pic_url the pic_url to set
     */
    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }
}