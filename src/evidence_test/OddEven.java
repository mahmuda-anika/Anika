
package evidence_test;

//questions :1 -  Find out the Odd-even number among n number of values.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Number : ");
        int num = input.nextInt();
        
        if(num% 2 ==0){
            System.out.println(num + " is a Even Number");
        }else{
            System.out.println(num + " is a Odd Number");
        }
        input.close();
    }
}
