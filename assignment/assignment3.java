package assignment2;

/**
 *
 * @author nanle
 */
import java.util.*;
public class assignment3 {
    
    
    public static void main(String ags[]){
        String mainString, ReverseString = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter string to check if it is  palindrome");
        
        mainString = in.nextLine();
        
        int lengt = mainString.length();
        
        for ( int i = lengt - 1; i >= 0; i-- )
         ReverseString = ReverseString + mainString.charAt(i);
        
        if(mainString.equals(ReverseString))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not palindrome");
    }
}
