
import java.util.*;
/**
 * Write a description of class digitsclient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class digitsclient
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        digits dig = new digits();
        
        System.out.print("\nenter a number: ");
        int num = keyboard.nextInt();
        
        System.out.print(dig.divide(num) + " digits");
    }
}
