package guru.qa;

public class Bus extends Vehicle {
    int maxSpeed = 40;
    public Bus(String carName, int carNumber) {
        super(carName, carNumber);
    }

    @Override
    public void checkPenalty(int speed) {
        if (speed > maxSpeed) {
            System.out.println("You received a fine.");
        } else {
            System.out.println("Your speed is normal.");
        }
    }
}