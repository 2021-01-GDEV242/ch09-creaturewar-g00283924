
/**
 * Write a description of class Wyvern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wyvern extends Creature
{
    private static final int MAX_WYVERN_HP = 999;
    private static final int MIN_WYVERN_HP = 420;
    private static final int MAX_WYVERN_STR = 200;
    private static final int MIN_WYVERN_STR = 120;

    /**
     * Constructor for objects of class Wyvern
     */
    public Wyvern()
    {
        super(
            Randomizer.nextInt(MAX_WYVERN_HP-MIN_WYVERN_HP)+MIN_WYVERN_HP,    
            Randomizer.nextInt(MAX_WYVERN_STR-MIN_WYVERN_STR)+MIN_WYVERN_STR
        );  
    }
}

