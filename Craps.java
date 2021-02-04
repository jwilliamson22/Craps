
/**
 * Write a description of class Craps here.
 *
 * @author (Jack W)
 * @version (2-2-2021)
 */
import java.util.Scanner;

public class Craps
{
    // instance variables - replace the example below with your own
    private int roll = 0;
    /**
     * 
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play craps? (Y/N)");
        String play = in.nextLine();
        if (play.equals("N"))
        {
            
        }
        System.out.println("Do you need rules? (Y/N)");
        String rules = in.nextLine();
        if (rules.equals("Y"))
        {
            System.out.println("Rule #1: A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("Rule #2: On this first roll, a 7 or an 11 automatically wins, and a 2,3, or 12 automatically loses and the game is over " +
                "If a 4,5,6,8,9, or 10 are rolled on this first roll, that number becomes the 'point'.");
            System.out.println("Rule #3: The player continues to roll the two dice again until one of two things happens: " +
                "either they roll the 'point' from the first roll, in which case they win; or they roll a 7 in which case they lose " +
                "The player continues to roll until either the 'point' or a 7 is rolled.");
        }
        else
        {
            System.out.println("Great, lets play!");
        }
        
    }
}
