package Homework1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        double amount = Double.parseDouble(scanner.nextLine());
        boolean dayOff = Boolean.parseBoolean(scanner.nextLine());;

        //Ако не е почивен ден ще работя
        if (dayOff) {
            System.out.println("Ще работя!");
        }
        // Ако имам пари и е почивен ден, ще отида на кино
        if (amount > 0 && dayOff) {
            System.out.println("Ще отида на кино.");
        }
        // Ако нямам пари, ще стоя вкъщи и ще гледам телевизия
        else {
            System.out.println("Ще стоя вкъщи и ще гледам телевизия.");
        }
        // Ако е почивен ден и имам по-малко от 10 лв, ще отида за сладолед
        if (dayOff && amount < 10) {
            System.out.println("Ще отида за сладолед.");
        }

    }
}
