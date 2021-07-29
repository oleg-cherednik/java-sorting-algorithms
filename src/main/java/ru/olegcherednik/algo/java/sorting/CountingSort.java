package ru.olegcherednik.algo.java.sorting;

/**
 * <a href="https://en.wikipedia.org/wiki/Counting_sort">Counting Sort</a>
 *
 * <ul>
 * <li><tt>0 <= i <= n</tt></li>
 * <li><tt>0 <= A[i] <= k</tt></li>
 * <li>Average time complexity - <tt>O(n+k)</tt></li>
 * <li>Space complexity - <tt>O(k)</tt></tt></li>
 * </ul>
 *
 * @author Oleg Cherednik
 * @since 29.07.2021
 */
@SuppressWarnings("MethodCanBeVariableArityMethod")
public final class CountingSort {

    public static int[] sortAsc(int[] arr) {
        int max = getMax(arr);
        int[] count = new int[max + 1];

        for (int val : arr)
            count[val]++;

        for (int i = 0, j = 0; i < count.length; i++)
            for (int k = 0; k < count[i]; k++)
                arr[j++] = i;

        return arr;
    }

    private static int getMax(int[] arr) {
        int max = 0;

        for (int val : arr)
            max = Math.max(max, val);

        return max;
    }

    private CountingSort() {
    }

}
