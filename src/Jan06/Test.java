
package Jan06;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Class obj1 = new Class();
        Class2 obj2 = new Class2();

        int[] arr1 = obj1.generateNumbers1(5); // generate first 5 numbers
        int[] arr2 = obj2.generateNumbers2(5); // generate first 5 numbers multiplied by 2

        System.out.println("Array from Class1: " + Arrays.toString(arr1));
        System.out.println("Array from Class2: " + Arrays.toString(arr2));
    }
}
