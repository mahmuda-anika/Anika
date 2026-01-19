
package evidence_test;
//Question:-05: Find out the Fibonacci number.

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Numbers : ");
        int a = input.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.print(first + " " + second);
        
        for(int i = 3; i<=a; i++){
            fibo = first + second;
            System.out.print(" " + fibo);
        first = second;
        second = fibo;
        }
        System.out.println();
        
    }
}
