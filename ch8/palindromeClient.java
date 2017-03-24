
import java.util.*;
/**
 * Write a description of class palindromeClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class palindromeClient
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        palindrome pal = new palindrome();
        
        System.out.print("\nenter a palindrome: ");
        String input = keyboard.next();
        System.out.print(pal.isPal(input));
        
    }
}
