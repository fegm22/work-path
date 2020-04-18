package topic1_arrays_strings;

import java.util.Arrays;

/**
 * https://app.codesignal.com/interview-practice/task/izLStwkDr5sMS9CEm
 * <p>
 * You have an unsorted array arr of non-negative integers and a number s.
 * Find a longest contiguous subarray in arr that has a sum equal to s.
 * Return two integers that represent its inclusive bounds.
 * If there are several possible answers, return the one with the smallest left bound. If there are no answers, return [-1].
 * <p>
 * Your answer should be 1-based, meaning that the first position of the array is 1 instead of 0.
 * <p>
 * Example:
 * <p>
 * For s = 12 and arr = [1, 2, 3, 7, 5], the output should be
 * findLongestSubarrayBySum(s, arr) = [2, 4].
 * The sum of elements from the 2nd position to the 4th position (1-based) is equal to 12: 2 + 3 + 7.
 * <p>
 * For s = 15 and arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], the output should be
 * findLongestSubarrayBySum(s, arr) = [1, 5].
 * The sum of elements from the 1st position to the 5th position (1-based) is equal to 15: 1 + 2 + 3 + 4 + 5.
 * <p>
 * For s = 15 and arr = [1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10], the output should be
 * findLongestSubarrayBySum(s, arr) = [1, 8].
 * The sum of elements from the 1st position to the 8th position (1-based) is equal to 15: 1 + 2 + 3 + 4 + 5 + 0 + 0 + 0.
 */
public class FindLongestSubArrayBySum {

    static int[] findLongestSubarrayBySum(int s, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            int j = i+1;
            while (j < arr.length && sum < s) {
                sum += arr[j];
                j++;
            }
            if (sum == s) return new int[]{i + 1, j + 1};
        }

        return new int[]{-1};
    }

    public static void main(String[] args) {
        int sum = 12;
        int[] arr = new int[]{1, 2, 3, 7, 5};

        System.out.println(Arrays.toString(findLongestSubarrayBySum(sum, arr)));

    }

}