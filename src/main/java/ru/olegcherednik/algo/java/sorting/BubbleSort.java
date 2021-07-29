package ru.olegcherednik.algo.java.sorting;

import static ru.olegcherednik.algo.java.sorting.SortUtils.example;
import static ru.olegcherednik.algo.java.sorting.SortUtils.swap;

/**
 * <a href="https://en.wikipedia.org/wiki/Bubble_sort">Bubble Sort</a>
 * <ul>
 * <li><tt>0 <= i <= n</tt></li>
 * <li>Time complexity - <tt>O(n<sup>2</sup>)</tt></li>
 * <li>Space complexity - <tt>O(1)</tt></tt></li>
 * </ul>
 *
 * @author Oleg Cherednik
 * @since 28.07.2021
 */
@SuppressWarnings("MethodCanBeVariableArityMethod")
public final class BubbleSort {

    public static void sortAsc(int[] arr) {
        for (int r = arr.length - 1; ; r--) {
            boolean stop = true;

            for (int l = 0; l < r; l++) {
                if (arr[l] <= arr[l + 1])
                    continue;

                swap(arr, l, l + 1);
                stop = false;
            }

            if (stop)
                break;
        }
    }

    public static void main(String... args) {
        example(BubbleSort::sortAsc);
    }

    private BubbleSort() {
    }

}
