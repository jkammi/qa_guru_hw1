package guru.qa;

public class Truck extends Vehicle {
    int maxSpeed = 120;
    public Truck(String carName, int carNumber) {
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