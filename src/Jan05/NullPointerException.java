
package Jan05;

public class NullPointerException {

    static void show() {
        String name = null;
        System.out.println(name.length()); 
    }

    public static void main(String[] args) {

        try {
            show();  
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception handled: " + e);
        }

        System.out.println("Program continues...");
    }
}
