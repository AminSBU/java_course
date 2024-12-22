import java.util.Scanner;
/**
 * Write a description of class numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class numbers
{
    public static void LoopNumbers(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Minimum: ");
        int MinNumber = scanner.nextInt();
        System.out.println("Maximum: ");
        int MaxNumber = scanner.nextInt();
        
        /* print numbers in 0 to 9 with for loop */
        for(int i = MinNumber; i <= MaxNumber; i++)
        {
            System.out.println(i);
        }
    }
}
