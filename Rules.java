
/**
 * Write a description of class Rules here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Rules
{
    public static void main(String[]args)
    {
        System.out.println("Rule #1: A player rolls two six-sided dice and adds the numbers rolled together.");
        System.out.println("Rule #2: On this first roll, a 7 or an 11 automatically wins, and a 2,3, or 12 automatically loses and the game is over " +
            "If a 4,5,6,8,9, or 10 are rolled on this first roll, that number becomes the 'point'.");
        System.out.println("Rule #3: The player continues to roll the two dice again until one of two things happens: " +
            "either they roll the 'point' from the first roll, in which case they win; or they roll a 7 in which case they lose " +
            "The player continues to roll until either the 'point' or a 7 is rolled.");
    }

}
