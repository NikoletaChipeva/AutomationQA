package Homework2;

//Дадени са два масива със стойности {1, 2, 3} и {1, 2, 3}
//да се състави програма, която проверява дали масивите са еднакви

import java.util.Arrays;

public class Task06 {

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3};
        int [] arr2 = {1, 2, 3};

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The same");
        } else {
            System.out.println("Different");
        }


    }
}
