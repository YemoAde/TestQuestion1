/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examprep;

import java.util.Scanner;

/**
 *
 * @author joshuagideon
 */
public class ExamPrep {
    static Scanner console = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        String myString = console.nextLine();
        String[] array = myString.split(" ");
        
            int[] myNumbers = new int[array.length];

            for(int i = 0; i< array.length; i++){
                myNumbers[i] = Integer.valueOf(array[i]);
            }
        
        for(int i = 0; i< array.length; i++){
            System.out.println(myNumbers[i]);
        }
        
        int numPos=0, numNeg=0, numZero = 0;
        
        for (int item: myNumbers){
            if(item == 0){
                numZero ++;
            }
            if(item > 0){
                numPos ++;
            }
            if(item < 0){
                numNeg ++;
            } 
//            float fracPos = numPos/array.length;
//            float fracNeg = numNeg/array.length;
//            float fracZero = numZero/array.length;
        }
        
        System.out.format("Postive %f", (float) numPos / array.length);
        System.out.format("Negative %f", (float) numPos / array.length);
        System.out.format("Zero %f", (float) numZero / array.length);
        
    }
    
}
