package Homework2;

//Напишете програма, която създава масив с 10 елемента от тип int и обходете масива:
//1) с помоща на for loop
//2) с помоща на while loop
//Да се изведат елементите на екрана.

public class Task04 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        // 1. Обхождане на масива с for loop

        for (int number : numbers) {
            System.out.println(number);
        }

        // 2. Обхождане на масива с while loop

        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }

}
