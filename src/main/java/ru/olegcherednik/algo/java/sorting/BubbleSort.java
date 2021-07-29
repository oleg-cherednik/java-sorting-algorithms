package ru.olegcherednik.algo.java.sorting;

import java.util.Arrays;
import java.util.Random;

import static ru.olegcherednik.algo.java.sorting.SortUtils.swap;

/**
 * <a href="https://en.wikipedia.org/wiki/Bubble_sort">Bubble Sort</a>
 * <ul>
 * <li>Time complexity - <tt>O(n<sup>2</sup>)</tt></li>
 * <li>Space complexity - <tt>O(1)</tt></tt></li>
 * </ul>
 *
 * @author Oleg Cherednik
 * @since 28.07.2021
 */
@SuppressWarnings("MethodCanBeVariableArityMethod")
public final class BubbleSort {

    public static int[] sortAsc(int[] arr) {
        if (arr == null)
            return null;

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

        return arr;
    }

    private BubbleSort() {
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
