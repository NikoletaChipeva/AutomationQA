package Homework2;

//Да се прочете масив от екрана с 5 числа по избор от тип double и да се отпечатат всички резултати

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        double [] numbers = new double[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Въведете дробно число:");
            numbers[i] = Double.parseDouble(scanner.nextLine());
        }

        for (double number : numbers) {
            System.out.println(number);
        }
    }
}
