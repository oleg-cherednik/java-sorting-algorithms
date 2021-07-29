package ru.olegcherednik.algo.java.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * <a href="https://en.wikipedia.org/wiki/Merge_sort">Merge Sort</a>
 * <ul>
 * <li><tt>0 <= i <= n</tt></li>
 * <li>Time complexity - <tt>O(n log n)</tt></li>
 * <li>Space complexity - <tt>O(n)</tt></tt></li>
 * </ul>
 *
 * @author Oleg Cherednik
 * @since 29.07.2021
 */
@SuppressWarnings("MethodCanBeVariableArityMethod")
public final class MergeSort {

    public static void sortAsc(int[] arr) {
        int[] aux = new int[arr.length];
        sortAsc(arr, aux, 0, arr.length - 1);
    }

    private static void sortAsc(int[] arr, int[] aux, int lo, int hi) {
        if (hi > lo) {
            int mid = lo + (hi - lo) / 2;
            sortAsc(arr, aux, lo, mid);
            sortAsc(arr, aux, mid + 1, hi);
            merge(arr, aux, lo, mid, hi);
        }
    }

    private static void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        System.arraycopy(arr, lo, aux, lo, hi - lo + 1);

        for (int i = lo, j = lo, k = mid + 1; i <= hi; i++) {
            if (j > mid)
                arr[i] = aux[k++];
            else if (k > hi)
                arr[i] = aux[j++];
            else if (aux[k] < aux[j])
                arr[i] = aux[k++];
            else
                arr[i] = aux[j++];
        }

    }

    private MergeSort() {
    }

    public static void main(String... args) {
        int[] arr = new int[20];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(20);

        System.out.println(Arrays.toString(arr));
        sortAsc(arr);
        System.out.println(Arrays.toString(arr));
    }

}
