
package Jan06;

public class Class2 {
    // Method that returns an array of integers
    public int[] generateNumbers2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1) * 2; // Fill array with 2, 4, 6, ...
        }
        return arr;
    }
}