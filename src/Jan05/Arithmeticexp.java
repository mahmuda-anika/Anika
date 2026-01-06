package Jan05;

public class Arithmeticexp {

    static void calculate() {
        int a = 10;
        int b = 0;
        int c = a / b; 
        System.out.println(c);
    }

    public static void main(String[] args) {

        try {
            calculate();
        }
        catch (ArithmeticException e) {   
            System.out.println("Arithmetic Exception handled: " + e);
        }

        System.out.println("Program continues...");
    }
}
