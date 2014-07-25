package DTO;

/**
 *
 * @author Michael
 */
public class Schematic {
    
    private int sid;
    private User owner;
    private String name;
    private int size;
    private Floor[] floors;
    private Tag[] tags;
    
    /**
     * No argument constructor for Schematic
     */
    public Schematic(){
        this.sid = 0;
        this.owner = null;
        this.name = null;
        this.size = 0;
        this.floors = null;
        this.tags = null;
    }
    
    /**
     * Schematic constructor
     * @param a_sid
     * @param a_owner
     * @param a_name
     * @param a_size
     * @param a_floors
     * @param a_tags 
     */
    public Schematic(int a_sid, User a_owner, String a_name, int a_size, Floor[] a_floors, Tag[] a_tags){
        this.sid = a_sid;
        this.owner = a_owner;
        this.name = a_name;
        this.size = a_size;
        this.floors = a_floors;
        this.tags = a_tags;
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
     * @return the owner
     */
    public User getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(User owner) {
        this.owner = owner;
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

    /**
     * @return the floors
     */
    public Floor[] getFloors() {
        return floors;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    /**
     * @return the tags
     */
    public Tag[] getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(Tag[] tags) {
        this.tags = tags;
    }
}
