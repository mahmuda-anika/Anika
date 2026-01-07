
package Jan05;


public class ArrayException {
     static void method1() {
        method2();
    }

    static void method2() {
        int[] arr = {10, 20, 30};
        System.out.println(arr[5]);
    }

    public static void main(String[] args) {

        try {
            method1();
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem: " + e);
        } 
        catch (Exception e) {
            System.out.println("Other exception: " + e);
        }

        System.out.println("Program continues...");
    }
}
