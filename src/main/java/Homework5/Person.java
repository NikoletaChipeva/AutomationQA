package Homework5;

public class Person {
    protected String name;
    protected int age;
    protected boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (isMan) {
            System.out.println("Gender: Man");
        } else {
            System.out.println("Gender: Woman");
        };
    }
}
