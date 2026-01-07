
package plm_solving;

import java.util.Scanner;


public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int [] number = new int[5];
        int sum = 0;
       
        System.out.println("Enter 5 numbers : ");
        
        for (int i = 0; i < 5; i++) {
            number [i] = input.nextInt();
            
        }
        
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        
            System.out.print("The sum is : " + sum);
            int avg = sum/number.length;
            System.out.print("The average is : " + avg);
            
        }
    }

