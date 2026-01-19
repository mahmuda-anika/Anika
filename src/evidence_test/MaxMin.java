
package evidence_test;

//2: Find out the Max-Min number among n number of values.

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Length : ");
        int m = input.nextInt();
        
        if(m <=0){
            System.out.println("Invalid Length");
            
       
        }
        int [] arr = new int[m];
        System.out.println("Enter Numbers : ");
        for (int i = 0; i < m; i++) {
            arr[i]= input.nextInt();
            
        }
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < m; i++) {
            if (arr[i]> max){
            max = arr[i];
            }
            if(arr[i]< min){
            min = arr[i];
            }
            
        }
        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);
    }
}

