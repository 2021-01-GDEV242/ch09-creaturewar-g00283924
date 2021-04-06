
/**
 * Write a description of class CyberDemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CyberDemon extends Creature
{
    private static final int MAX_CYBERDEMON_HP = 35;
    private static final int MIN_CYBERDEMON_HP = 5;
    private static final int MAX_CYBERDEMON_STR = 25;
    private static final int MIN_CYBERDEMON_STR = 10;
    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
       super(
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP,    
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR
        );
    }
}
