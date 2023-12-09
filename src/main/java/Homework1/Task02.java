package Homework1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете последователно две цели числа:");
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Въведете последователно две дробни числа:");
        double number3 = Double.parseDouble(scanner.nextLine());
        double number4 = Double.parseDouble(scanner.nextLine());

        // Размяна на целите числа
        int tempInt = number1;
        number1 = number2;
        number2 = tempInt;
        System.out.println("Въведените цели числа в обратен ред са: ");
        System.out.println(number1);
        System.out.println(number2);

        //Размяна на дробните числа

        double tempD = number3;
        number3 = number4;
        number4 = tempD;

        System.out.println("Въведените дробни числа в обратен ред са: ");
        System.out.println(number3);
        System.out.println(number4);

        // Конвертиране на числата от int to double
        double number1Double = (double) number1;
        double number2Double = (double) number2;

        // Извеждане на сумата на числата след кастване от int to double
        System.out.println("Сума на числата след кастване от int to double: " + (number1Double + number2Double + number3 + number4));

        // Конвертиране на числата от double to int
        int number3Int = (int) number3;
        int number4Int = (int) number4;

        // Извеждане на сумата на числата след кастване от double to int
        System.out.println("Сума на числата след кастване от double to int: " + (number1 + number2 + number4Int + number4Int));
    }
}










