package com.example.javaproject2.week5.day21;

import java.util.Arrays;
import java.util.Comparator;

public class InsertionSortGeneric<T extends Comparable<T>> {

    public T[] sort(T[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((isAscending ? arr[j].compareTo(arr[j-1]) : arr[j-1].compareTo(arr[j])) > 0) {
                    T tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }

        return arr;
    }
    public T[] sort(T[] arr) {
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        Character[] cArr = {'f', 'e', 'g', 'a', 'c'};
        InsertionSortGeneric<Character> is = new InsertionSortGeneric();

        cArr = is.sort(cArr, false);
        System.out.println(Arrays.toString(cArr));

    }
}
