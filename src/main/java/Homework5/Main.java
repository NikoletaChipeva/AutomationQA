package Homework5;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[10];

        people[0] = new Person("Person Dimitar", 30, true);
        people[1] = new Student("Student Ivan", 20, true, 4.5);
        people[2] = new Employee("Employee Georgi", 28, true, 100);
        people[3] = new Person("Person Maria", 25, false);
        ;
        people[4] = new Student("Student Hristina", 19, false, 5.5);
        people[5] = new Employee("Employee Mariela", 16, false, 80);
        people[6] = new Person("Person Ivaylo", 35, true);
        people[7] = new Student("Student Nora", 22, false, 3.75);
        people[8] = new Employee("Employee Milen", 41, true, 150);
        people[9] = new Student("Student Anton", 21, true, 6.0);

        for(Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
                double overtimePayment = ((Employee) person).calculateOvertime(2);
                System.out.println("Overtime payment for 2 hours: $" + overtimePayment);
            } else {
                person.showPersonInfo();
            }
            System.out.println("----------------------------");
        }
    }
}
