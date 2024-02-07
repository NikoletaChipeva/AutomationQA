package Homework6;

public class Dog extends Animal{

    @Override
    public void makeSomeNoise() {
        System.out.println("The Dog barks.");
    }
    @Override
    public void play () {
        System.out.println("Тhe dog plays with a stick.");
    }

    public void bringStick() {
        System.out.println("The dog brings stick.");
    }

}
