package Homework2;

//Задача 5
//Да се състави масив със следните стойности {10 12 1 8 4}.
// След създаването на масива да се копират стойностите в нов масив

public class Task05 {
    public static void main(String[] args) {

        int [] numbers = {10, 12, 1, 8, 4};

        int [] newNumbers = new int [numbers.length];

        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        for (int number : newNumbers) {
            System.out.println(number);
        }

    }
}
