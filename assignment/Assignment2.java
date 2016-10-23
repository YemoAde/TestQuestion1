package assignment2;

/**
 *
 * @author nanle
 */
import java.util.*;
public class Assignment2 {

 
    public static void main(String[] args) {
        // Conversion from franheit to celsius
        Scanner in = new Scanner(System.in);
        System.out.println("What operation do you want to Perform");
        
        System.out.println("Press 1 to convert from faranheit to celsius");
        System.out.println("Press 2 to convert from celsius to faranheit");
        
        int decs = in.nextInt();
        if(decs == 1){
            System.out.println("Enter your faranheit value");
               
           double valv = in.nextDouble();
           double ansa = (valv - 32) * .5555555556;
           
           System.out.println(ansa);
            
        }
        if(decs == 2){
            System.out.println("Enter your celsius value");
            double valv = in.nextDouble();
            double ansa = (valv * 1.8) + 32;
            
            System.out.println(ansa);
        }
    }
    
}
