package Homework3;

public class CarPerson {
    public static void main(String[] args) {
        Car car1 = new Car(2023, 25000.50, true, 60.0, 50.0, "Gasoline");
        Car car2 = new Car(2022, 30000.25, false, 55.0, 45.0, "Diesel");

        car1.useFuel(35.0);
        car2.changeEngineFuelOperationSystem("Electric");

        // За първата кола:
        System.out.println("Car 1:");
        System.out.println("Year: " + car1.year);
        System.out.println("Price: " + car1.price);
        System.out.println("Is sport car: " + car1.isSportCar);
        System.out.println("Fuel tank capacity: " + car1.fuelTankCapacity);
        System.out.println("Free fuel: " + car1.freeFuel);
        System.out.println("Engine fuel operation system: " + car1.engineFuelOperationSystem);

        // За втората кола:
        System.out.println("\nCar 2:");
        System.out.println("Year: " + car2.year);
        System.out.println("Price: " + car2.price);
        System.out.println("Is sport car: " + car2.isSportCar);
        System.out.println("Fuel tank capacity: " + car2.fuelTankCapacity);
        System.out.println("Free fuel: " + car2.freeFuel);
        System.out.println("Engine fuel operation system: " + car2.engineFuelOperationSystem);
    }
}
