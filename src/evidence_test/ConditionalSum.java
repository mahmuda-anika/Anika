
package evidence_test;

//Question:-06: Find out the Conditional Sum until input 0(zero).

import java.util.Scanner;


public class ConditionalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        
        System.out.println("Enter a Number : ");
        
        while(true){
        num = input.nextInt();
        if(num==0){
        break;
        }
        sum +=num;
        }
        System.out.println("Total sum : " + sum);
        input.close();
    }
}
