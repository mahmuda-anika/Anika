package Jan06;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TraineeRepository repo = new TraineeRepository();
        Map<Integer, Trainee> trainees = repo.getTrainees();

        System.out.println("All Trainees:");
        for (Map.Entry<Integer, Trainee> entry : trainees.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
