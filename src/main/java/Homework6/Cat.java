package Homework6;

public class Cat extends Animal {
    @Override
    public void makeSomeNoise() {
        System.out.println("The cat meows.");
    }

    @Override
    public void play () {
        System.out.println("The cat plays with a small ball.");
    }
    public void climb() {
        System.out.println("Котката се катери!");
    }

}
