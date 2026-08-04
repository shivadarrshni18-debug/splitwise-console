/**
 * A friend in the splitwise group with a unique id and display name
 */

package model;
/**
 * create a friend with the given name and assigns the next available id.
 */



public class Friend {

    private  static int lastId =0;
    private final int id;
    private final  String name;
    /**
     * Creates a new Friend with the given name.
     *
     * @param name the display name of the friend
     */

    public Friend(String name){

        lastId++;
        this.id=lastId;
        this.name=name;
    }

    /**
     * Returns the unique ID of the friend.
     *
     * @return the friend's unique ID
     */
    public int getId() {

        return id;
    }
    /**
     * Returns the friend's display name.
     *
     * @return the friend's display name
     */
    public String getName(){

         return name;
    }

}
