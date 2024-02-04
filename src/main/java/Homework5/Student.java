package Homework5;

public class Student extends Person{
    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        setScore(score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >=2 && score <=6) {
            this.score = score;
        } else {
            System.out.println("Invalid score. Please, provide a score between 2 and 6.");
        }
    }
    public void showStudentInfo(){
        showPersonInfo();
        System.out.println("Score: " + score);
    }
}
