
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Creature
{
    private static final int MAX_BALROG_HP = 25;
    private static final int MIN_BALROG_HP = 10;
    private static final int MAX_BALROG_STR = 20;
    private static final int MIN_BALROG_STR = 10;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
      super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );  
    }

}
