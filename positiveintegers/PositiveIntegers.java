/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positiveintegers;

/**
 *
 * @author nanle
 */
import java.util.Scanner;
public class PositiveIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of numbers which you want to input!");
        int numcases = Integer.parseInt(in.nextLine());
        double negativeCounter = 0.0, positiveCounter = 0.0, ZeroCounter = 0.0;
        for(int i = 0; i < numcases; i++){
            int num = in.nextInt();
            if(num<0){
                negativeCounter++;
            }else if(num>0){
                positiveCounter++;
            }else{
                ZeroCounter++;
            }
            
        }
        double positiveInt = positiveCounter/numcases;
        double negativeInt = negativeCounter/numcases;
        double ZeroInt = ZeroCounter/numcases;
        
        System.out.println("The value for positive numbers is:" + " " + positiveInt);
        System.out.println("The value for negative numbers is:" + " " + negativeInt);
        System.out.println("The value for fraction zeroes is:" + " " + ZeroInt);
    }
}
