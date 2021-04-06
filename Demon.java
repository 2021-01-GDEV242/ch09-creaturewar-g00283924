
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    private static final int MAX_DEMON_HP = 35;
    private static final int MIN_DEMON_HP = 5;
    private static final int MAX_DEMON_STR = 25;
    private static final int MIN_DEMON_STR = 10;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }
}
