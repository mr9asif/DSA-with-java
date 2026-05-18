package TwoPointer;

public class MergePosNegArray {
   
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;

        // Count negatives
        int negCount = 0;
        for (int num : nums) {
            if (num < 0) negCount++;
        }

        int posCount = n - negCount;

        // Create arrays
        int[] neg = new int[negCount];
        int[] pos = new int[posCount];

        // Fill arrays
        int ni = 0, pi = 0;
        for (int num : nums) {
            if (num < 0)
                neg[ni++] = num;
            else
                pos[pi++] = num;
        }

        // Case 1: No negatives
        if (negCount == 0) {
            for (int i = 0; i < posCount; i++)
                pos[i] = pos[i] * pos[i];
            return pos;
        }

        // Case 2: No positives
        if (posCount == 0) {
            for (int i = 0; i < negCount; i++)
                neg[i] = neg[i] * neg[i];

            reverse(neg);
            return neg;
        }

        // Square negatives
        for (int i = 0; i < negCount; i++)
            neg[i] = neg[i] * neg[i];

        // Reverse negatives
        reverse(neg);

        // Square positives
        for (int i = 0; i < posCount; i++)
            pos[i] = pos[i] * pos[i];

        // Merge
        int[] res = new int[n];
        int i = 0, j = 0, id = 0;

        while (i < negCount && j < posCount) {
            if (neg[i] <= pos[j]) {
                res[id++] = neg[i++];
            } else {
                res[id++] = pos[j++];
            }
        }

        while (i < negCount)
            res[id++] = neg[i++];

        while (j < posCount)
            res[id++] = pos[j++];

        return res;
    }

    // ✅ FIX: make static
    public static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {

        // ✅ FIX: sorted input
        int[] arr = {-8, -6, 0, 2, 5, 8};

        int[] res = sortedSquares(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}