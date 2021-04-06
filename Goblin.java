
/**
 * Write a description of class Goblin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goblin extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_GOBLIN_HP = 10;
    private static final int MIN_GOBLIN_HP = 2;
    private static final int MAX_GOBLIN_STR = 10;
    private static final int MIN_GOBLIN_STR = 5;

    /**
     * Constructor for objects of class Goblin
     */
    public Goblin()
    {
        super(
            Randomizer.nextInt(MAX_GOBLIN_HP-MIN_GOBLIN_HP)+MIN_GOBLIN_HP,    
            Randomizer.nextInt(MAX_GOBLIN_STR-MIN_GOBLIN_STR)+MIN_GOBLIN_STR
        );
    }

}
