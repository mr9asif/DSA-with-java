package binarySearch;

import java.util.Arrays;

public class FirstandLastP {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 5, 5, 5, 7, 8, 9}; // Sorted array
        int target = 5; // The target to find
        int[] ans = searchRange(nums, target);
        System.out.println("Target: " + target + " -> Result: " + Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Find the first occurrence
        ans[0] = search(nums, target, true);
        // Find the last occurrence
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Target is found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Move left to find the first occurrence
                } else {
                    start = mid + 1; // Move right to find the last occurrence
                }
            }
        }
        return ans;
    }
}
