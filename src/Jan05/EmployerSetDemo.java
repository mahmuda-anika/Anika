package Jan05;

import java.util.HashSet;
import java.util.Set;

public class EmployerSetDemo {
    public static void main(String[] args) {

        Set<Employer> set = new HashSet<>();

        set.add(new Employer(1, 50000.50, "Anika"));
        set.add(new Employer(2, 70000.00, "Rahim"));
        set.add(new Employer(3, 90000.00, "Anni")); 

        for (Employer e : set) {
            e.show();
        }
    }
}
