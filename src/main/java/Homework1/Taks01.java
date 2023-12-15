package Homework1;
import java.util.Scanner;
public class Taks01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете своето първо цяло число");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведеното от Вас първо цяло число е " + number1);

        System.out.println("Въведете своето второ цяло число");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведеното от Вас второ цяло число е " + number2);

        System.out.println("Въведете своето трето цяло число");
        int number3 = Integer.parseInt(scanner.nextLine());

        if (number1 <= number3 && number3 <= number2) {
            System.out.println("Въведеното число е в диапазона между Вашето първо и второ цяло число");
        } else {
            System.out.println("Въведеното число е извън диапазона на въведените първо и второ цяло число");
        }

    }
}
