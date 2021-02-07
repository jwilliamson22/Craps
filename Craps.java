
/**
 * Write a description of class Craps here.
 *
 * @author (Jack W)
 * @version (2-7-2021)
 */
import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Craps!");
        System.out.println("Would you like to play craps? (y/n)");
        Scanner in = new Scanner(System.in);
        String play = in.nextLine();
        Die dice = new Die();
        System.out.println("Do you need to see the rules for craps? (y/n)");
        String rules = in.nextLine();
        if (rules.equalsIgnoreCase("y"))
        {
            System.out.println("1: A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2: On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over.");
            System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
            System.out.println("3:The player continues to roll the two dice again until one of two things happens: either they roll the point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
        }
        while (play.equalsIgnoreCase("y"))
        {
            System.out.println("Press [Enter] to roll");
            Scanner in3 = new Scanner(System.in);
            String waiting = in3.nextLine();
            int result = dice.rollDice();
            if (result == 7 || result == 11)
            {
                System.out.println("You rolled a " + result);
                System.out.println("You win!");
            }
            else if (result == 2 || result == 3 || result == 12)
            {
                System.out.println("You rolled a " + result);
                System.out.println("You lost :(");
            }
            else
            {
                int count = 0;
                int point = result;
                while ((result != 7 && point != result) || count == 0)
                {
                    count ++;
                    System.out.println("You rolled a " + result);
                    System.out.println("Your point is " + point);
                    System.out.println("Press [Enter] to keep rolling!");
                    Scanner in4 = new Scanner(System.in);
                    String pause = in4.nextLine();
                    result = dice.rollDice();
                    if (result == point)
                    {
                        System.out.println("You rolled a " + result);
                        System.out.println("Congratulations, you win!");
                    }
                    else if (result == 7)
                    {
                        System.out.println("You rolled a " + result);
                        System.out.println("You lose");
                    }
                }
            }
            System.out.println("Would you like to play again (y/n)");
            play = in.nextLine();
        }

    }
}
