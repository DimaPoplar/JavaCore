package org.example.homework2;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 0, 0, 9};
        System.out.println(countNum(arr));
        System.out.println(minmax(arr));
        System.out.println(twoZero(arr));
    }
    /*
    Задание 1. Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     */

    public static int countNum(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                counter++;
            }

        }
        return counter;
    }

    /*
    Задание 2. Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
     */

    public static int minmax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        int result = max - min;
        return result;
    }

    /*
    Задание 3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     */

    public static boolean twoZero(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
