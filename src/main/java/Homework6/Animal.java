package Homework6;

abstract class Animal implements IAnimal {
   abstract void play();
    void eat () {
        System.out.println("All animals have different way to eat.");
    };

}
