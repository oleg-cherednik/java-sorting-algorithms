package ru.olegcherednik.algo.java.sorting;

import static ru.olegcherednik.algo.java.sorting.SortUtils.swap;

/**
 * <a href="https://en.wikipedia.org/wiki/Selection_sort">Selection Sort</a>
 * <ul>
 * <li><tt>0 <= i <= n</tt></li>
 * <li>Time complexity - <tt>O(n<sup>2</sup>)</tt></li>
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

}
