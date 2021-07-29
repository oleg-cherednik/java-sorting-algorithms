package ru.olegcherednik.algo.java.sorting;

import java.util.Arrays;
import java.util.Random;

import static ru.olegcherednik.algo.java.sorting.SortUtils.swap;

/**
 * <a href="https://en.wikipedia.org/wiki/Selection_sort">Selection Sort</a>
 * <ul>
 * <li><tt>0 <= i <= n</tt></li>
 * <li>Average time complexity - <tt>O(n<sup>2</sup>)</tt></li>
 * <li>Space complexity - <tt>O(1)</tt></tt></li>
 * </ul>
 *
 * @author Oleg Cherednik
 * @since 29.07.2021
 */
@SuppressWarnings("MethodCanBeVariableArityMethod")
public final class SelectionSort {

    public static void sortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            swap(arr, i, getMinIndex(arr, i));
    }

    private static int getMinIndex(int[] arr, int i) {
        int minIndex = i;

        for (; i < arr.length; i++)
            if (arr[i] < arr[minIndex])
                minIndex = i;

        return minIndex;
    }

    private SelectionSort() {
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
