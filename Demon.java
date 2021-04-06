
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;  
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        str=10;
        hp=10;
        max_hp = hp;
    
    }
    
    public Demon (int str, int hp) {
       //implement this
    }
    
    public int attack(){
        // TODO: implement a damage method
        return 0;
    }
    
    public boolean isAlive() {
        // TODO: implement a method to report if the creature yet lives
        return false; //change this
    }
    
    public boolean isKnockedOut() {
        //TODO: implement a method to report if the creature has been killed
        return false; //change this
    }
    
    public void takeDamage(int damage) {
        // TODO: implement this
    }
}
