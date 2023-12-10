package Homework1;

import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.util.Scanner;

public class Task06 {

    Scanner scanner = new Scanner(System.in);

    int dayNumber = Integer.parseInt(scanner.nextLine());

    if (dayNumber < 1 || dayNumber > 7 ) {
        System.out.println("Invalid number");
    }

    switch (dayNumber) {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;

    }


}
