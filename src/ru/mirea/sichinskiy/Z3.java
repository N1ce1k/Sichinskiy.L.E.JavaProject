package ru.mirea.sichinskiy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Z3 {

    public static void main(String[] args) {

        int[] numberArray;
        int[] numberArray2;

        int arrayLength;

        int numToFind;

        int iterationsCount = 0;

        System.out.println("Введите размер массива");

        Scanner scan = new Scanner(System.in);

        arrayLength = scan.nextInt();

        numberArray = new int[arrayLength];
        numberArray2 = new int[arrayLength];


        Random random = new Random();

        for(int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(-100, 100);
            numberArray2[i] = random.nextInt(-100, 100);

        }
        System.out.println(Arrays.toString(numberArray));
        System.out.println(Arrays.toString(numberArray2));
        boolean found = false;

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray2.length; j++) {
                if (numberArray[i] == numberArray2[j]) {
                    System.out.print(numberArray[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Нет совпадений.");
        }
    }
}