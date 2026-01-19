
package evidence_test;
//Question:-06 Find out the Factorial number from n values.

import java.util.Scanner;



public class Factorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Number : ");
        
        int b = input.nextInt();
        int fact = 1;
        
        for(int i = 1;i<=b;i++){
        fact = fact * i;
        }
        System.out.println("Factorial : " + fact);
        
        
    }
}
