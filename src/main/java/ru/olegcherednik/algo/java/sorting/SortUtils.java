package ru.olegcherednik.algo.java.sorting;

/**
 * @author Oleg Cherednik
 * @since 29.07.2021
 */
public final class SortUtils {

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private SortUtils() {
    }

}
