package Homework1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        //Размяна на стойностите
        int tempNumber = number1;
        number1 = number2;
        number2 = number3;
        number3 = tempNumber;

        int sum1 = number1 + number2;
        int sum2 = sum1 - number3;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println("Резултат1: " + sum1);
        System.out.println("Резултат2: " + sum2);

    }
}
