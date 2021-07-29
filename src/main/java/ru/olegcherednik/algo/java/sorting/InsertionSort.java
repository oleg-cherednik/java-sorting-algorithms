package ru.olegcherednik.algo.java.sorting;

import static ru.olegcherednik.algo.java.sorting.SortUtils.swap;

/**
 * <a href="https://en.wikipedia.org/wiki/Insertion_sort">Insertion Sort</a>
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
public final class InsertionSort {

    public static void sortAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--)
                swap(arr, j, j + 1);
    }

    private InsertionSort() {
    }

}
