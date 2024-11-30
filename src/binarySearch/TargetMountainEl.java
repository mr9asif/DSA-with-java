package binarySearch;

public class TargetMountainEl {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        int target = 4;

        int peak = findPeak(arr);
        System.out.println("Peak Index: " + peak);

        int ans = searchInMountainArray(arr, target, peak);
        System.out.println("Target Index: " + ans);
    }

    // Function to search for the target using peak index
    static int searchInMountainArray(int[] arr, int target, int peak) {
        int ans = binarySearch(arr, 0, peak, target, true);
        if (ans != -1) {
            return ans;
        }
        return binarySearch(arr, peak + 1, arr.length - 1, target, false);
    }

    // Binary search implementation for both ascending and descending parts
    static int binarySearch(int[] arr, int start, int end, int target, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }

    // Function to find the peak element in the mountain array
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in the descending part of the mountain
                end = mid;
            } else {
                // You are in the ascending part of the mountain
                start = mid + 1;
            }
        }
        // Start and end converge to the peak index
        return start;
    }
}
