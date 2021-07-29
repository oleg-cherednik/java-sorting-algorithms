package ru.olegcherednik.algo.java.sorting;

import static ru.olegcherednik.algo.java.sorting.SortUtils.example;
import static ru.olegcherednik.algo.java.sorting.SortUtils.swap;

/**
 * <a href="https://en.wikipedia.org/wiki/Cocktail_shaker_sort">Cocktail Shaker Sort Sort</a>
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
public final class CocktailShakerSort {

    public static void sortAsc(int[] arr) {
        for (int lo = 0, hi = arr.length - 1; ; lo++, hi--) {
            if (bubbleSortRight(arr, lo, hi))
                break;
            if (bubbleSortLeft(arr, lo, hi - 1))
                break;
        }
    }

    private static boolean bubbleSortRight(int[] arr, int lo, int hi) {
        boolean stop = true;

        for (; lo < hi; lo++) {
            if (arr[lo] <= arr[lo + 1])
                continue;

            swap(arr, lo, lo + 1);
            stop = false;
        }

        return stop;
    }

    private static boolean bubbleSortLeft(int[] arr, int lo, int hi) {
        boolean stop = true;

        for (; lo <= hi; hi--) {
            if (arr[hi] <= arr[hi + 1])
                continue;

            swap(arr, hi, hi + 1);
            stop = false;
        }

        return stop;
    }

    public static void main(String... args) {
        example(CocktailShakerSort::sortAsc);
    }

    private CocktailShakerSort() {
    }

}
