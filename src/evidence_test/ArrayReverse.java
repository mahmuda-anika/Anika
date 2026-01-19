
package evidence_test;
//Question:-05: Sort the Array in Reverse order.

import java.util.Arrays;
import java.util.Scanner;



public class ArrayReverse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Array total input : ");
        int n = input.nextInt();
        
        int[]a = new int[n];
        
        System.out.println("Enter a Number : ");
        for (int i = 0; i < n; i++) {
            a[i]= input.nextInt(); 
        }
        Arrays.sort(a);
        System.out.println("Array in Reverse : ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");    
        }
        input.close();
    }
}
