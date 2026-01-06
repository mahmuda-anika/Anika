package Jan06;

import java.util.Map;
import java.util.HashMap;

public class TraineeRepository {
    
    public Map<Integer, Trainee> getTrainees() {
        Map<Integer, Trainee> trainees = new HashMap<>();

        trainees.put(1, new Trainee(101, new Address(1001, "Dhanmondi")));
        trainees.put(2, new Trainee(102, new Address(1002, "Gulshan")));
        trainees.put(3, new Trainee(103, new Address(1003, "Banani")));

        return trainees;
    }
}
