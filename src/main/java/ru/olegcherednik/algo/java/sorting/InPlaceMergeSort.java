package ru.olegcherednik.algo.java.sorting;

import static ru.olegcherednik.algo.java.sorting.SortUtils.example;

/**
 * <a href="https://en.wikipedia.org/wiki/Merge_sort">Merge Sort</a>
 * <ul>
 * <li><tt>0 <= i <= n</tt></li>
 * <li>Time complexity - <tt>O(n log n)</tt></li>
 * <li>Space complexity - <tt>O(1)</tt></tt></li>
 * </ul>
 *
 * @author Oleg Cherednik
 * @since 19.01.2022
 */
@SuppressWarnings("MethodCanBeVariableArityMethod")
public final class InPlaceMergeSort {

    public static void sortAsc(int[] arr) {
        sortAsc(arr, 0, arr.length - 1);
    }

    private static void sortAsc(int[] arr, int lo, int hi) {
        if (hi > lo) {
            int mid = lo + (hi - lo) / 2;
            sortAsc(arr, lo, mid);
            sortAsc(arr, mid + 1, hi);
            merge(arr, lo, mid, hi);
        }
    }

    private static void merge(int[] arr, int lo, int mid, int hi) {
        if (arr[mid] > arr[mid + 1]) {
            for (int i = lo, j = mid, k = mid + 1; i <= j && k <= hi; i++) {
                if (arr[i] > arr[k]) {
                    rotateRight(arr, i, k++);
                    j++;
                }
            }
        }
    }

    private static void rotateRight(int[] arr, int lo, int hi) {
        int tmp = arr[hi];

        if (hi - lo >= 0)
            System.arraycopy(arr, lo, arr, lo + 1, hi - lo);

        arr[lo] = tmp;
    }

    public static void main(String... args) {
        example(InPlaceMergeSort::sortAsc);
    }

    private InPlaceMergeSort() {
    }

}
