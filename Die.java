
/**
 * Write a description of class Die here.
 *
 * @author (Jack W)
 * @version (2021-2-7)
 */

public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        roll = 1;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return total of dice
     */
    public int rollDice()
    {
        // put your code here
        int roll1 = (int) (Math.random() * 6) + 1;
        int roll2 = (int) (Math.random() * 6) + 1;
        int total = roll1 + roll2;
        return total;
    }
}
