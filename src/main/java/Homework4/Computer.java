package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    // Creating constructor
    public Computer(int year, double price,  String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    public int comparePrice(Computer compare){
        if (this.price > compare.price) {
            return -1;
        } else if (this.price < compare.price) {
            return 1;
        } else {
            return 0;
    }

    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(2022, 2200, "Windows");
        Computer computer2 = new Computer(2023, 2500, "MacOS");

        int result = computer1.comparePrice(computer2);

        if (result == -1){
            System.out.println("The price of the first computer is higher than the price of the second one.");
        } else if (result == 1) {
            System.out.println("The price of the second computer is higher than the price of the first one.");
        } else {
            System.out.println("The prices of both computers are equal.");
        }
    }




}

