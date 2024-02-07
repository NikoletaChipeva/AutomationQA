package Homework6;

public class Bird  extends Animal {
    @Override
    public void makeSomeNoise() {
        System.out.println("Тhe bird tweets.");
    }
    @Override
    public void play (){
        System.out.println("The bird tittups.");
    }

    public void fly() {
        System.out.println("The bird flies!");
    }
    public void sing(int birdCount) {
        if (birdCount == 1) {
            System.out.println("Тhe bird tweets");
        } else {
            System.out.println("Тhe birds tweet loudly.");
        }
    }
}
