package ru.olegcherednik.algo.java.sorting;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author Oleg Cherednik
 * @since 29.07.2021
 */
public final class SortUtils {

    public static int[] createIntArray() {
        return new int[] { 7, 1, 7, 17, 4, 7, 15, 14, 3, 11, 15, 0, 3, 0, 1, 8, 8, 2, 16, 18 };
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void example(Consumer<int[]> sort) {
        int[] arr = createIntArray();
        print(arr);
        sort.accept(arr);
        print(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private SortUtils() {
    }

}
