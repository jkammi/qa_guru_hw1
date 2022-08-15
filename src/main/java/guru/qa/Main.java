package guru.qa;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("car", 658); //можно изменить Car на Bus/Truck/MotorBike/Bike
        car.checkPenalty(100); //выбрать скорость
        car.sayCarName();
        car.sayCarNumber();

    }
}