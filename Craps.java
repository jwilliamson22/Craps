
/**
 * Write a description of class Craps here.
 *
 * @author (Jack W)
 * @version (2-2-2021)
 */
import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        
        
        int total = d1.roll() + d2.roll();
        if (total == 7 || total == 11)
        {
         // won the game   
        }
        else if (total == 2 || total == 3 || total == 12)
        {
            // lost the game
        }
        else
        {
            int point = total;
            total = d1.roll() + d2.roll();
            while (total != 7 && total != point)
            {
                // have not won or lost yet, roll again
                total = d1.roll() + d2.roll();
            }
            // give the right message
            if (total == point)
            {
                // won the game
            }
            else
            {
                // lost the game
            }
        }
    }
}
