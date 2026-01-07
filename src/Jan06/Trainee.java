
package Jan06;


public class Trainee {
    private int traineeId;
    private Address traineeAddress;

    // Constructor
    public Trainee(int traineeId, Address traineeAddress) {
        this.traineeId = traineeId;
        this.traineeAddress = traineeAddress;
    }

    // Getters
    public int getTraineeId() {
        return traineeId;
    }

    public Address getTraineeAddress() {
        return traineeAddress;
    }

    @Override
    public String toString() {
        return "Trainee [id=" + traineeId + ", address=" + traineeAddress + "]";
    }
 
}
