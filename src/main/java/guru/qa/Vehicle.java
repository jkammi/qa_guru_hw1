package guru.qa;

public abstract class Vehicle {
    String carName;
    int carNumber;

    public Vehicle(String carName, int carNumber) {
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public abstract void checkPenalty(int speed);

    void sayCarName() {
        System.out.println("Name of your vehicle: " + carName);
    }

    void sayCarNumber() {
        System.out.println("Number of your vehicle: " + carNumber);
    }
}
