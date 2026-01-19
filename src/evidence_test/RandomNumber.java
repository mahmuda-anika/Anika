package evidence_test;

//Question:-07: Find out the ten unique Random Numbers.
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        while (set.size() < 10) {
            int number = random.nextInt(100);
            set.add(number);
        }
        System.out.println("Unique random numbers : " + set);
    }
}
