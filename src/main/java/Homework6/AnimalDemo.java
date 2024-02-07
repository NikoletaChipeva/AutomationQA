package Homework6;

public class AnimalDemo {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Who and how makes a noise:");
        bird.makeSomeNoise();
        cat.makeSomeNoise();
        dog.makeSomeNoise();

        System.out.println("-------------------------------");

        System.out.println("Who and how can play:");
        bird.play();
        cat.play();
        dog.play();

    }
}
