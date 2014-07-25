package DTO;

/**
 *
 * @author Michael
 */
public class Schematic {
    
    private int sid;
    private int owner_uid;
    private String name;
    private int size;
    
    /**
     * No argument constructor for Schematic
     */
    public Schematic(){
        this.sid = 0;
        this.owner_uid = 0;
        this.name = null;
        this.size = 0;
    }
    
    /**
     * Schematic constructor
     * @param a_sid
     * @param a_owner_uid
     * @param a_name
     * @param a_size
     */
    public Schematic(int a_sid, int a_owner_uid, String a_name, int a_size){
        this.sid = a_sid;
        this.owner_uid = a_owner_uid;
        this.name = a_name;
        this.size = a_size;
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
     * @return the owner_uid
     */
    public int getOwner_uid() {
        return owner_uid;
    }

    /**
     * @param owner_uid the owner_uid to set
     */
    public void setOwner(int owner_uid) {
        this.owner_uid = owner_uid;
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
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
}
