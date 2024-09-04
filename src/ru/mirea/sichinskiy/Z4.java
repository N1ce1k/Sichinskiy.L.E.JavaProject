//package ru.mirea.sichinskiy;
//
//public class RandomApp {
//    int[] numberArray;
//    int arrayLength;
//
//    int numToFind;
//
//    Scanner scan = new Scanner(System.in);
//
//    arrayLength = scan.nextInt();
//}
package ru.mirea.sichinskiy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Z4 {

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

        for (int i = 0; i < numberArray.length; i++) {

            numberArray[i] = random.nextInt(-100, 100);
            numberArray2[i] = random.nextInt(-100, 100);

        }
        System.out.println(Arrays.toString(numberArray));
        System.out.println(Arrays.toString(numberArray2));

        HashSet<Integer> set = new HashSet<>();
        for (int i : numberArray) {
            set.add(i);
        }
        boolean found = false;

        for (int i : numberArray2) {
            if (set.contains(i)) {
                System.out.println(i + " ");

                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет совпадений.");
        }
    }

}
