package Homework5;

public class Employee extends Person{
    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime (double hours) {
        if (age <18) {
            return 0;
        } else {
            return hours * daySalary * 1.5;
        }
    }
    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Daily Salary: " + daySalary);
    }

}
