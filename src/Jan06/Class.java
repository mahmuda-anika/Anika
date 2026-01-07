
package Jan06;

public class Class {
    // Method that returns an array of integers
    public int[] generateNumbers1(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;  // Fill array with 1, 2, 3, ...
        }
        return arr;
    }
}
