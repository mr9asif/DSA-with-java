package TwoPointer;
import java.util.Arrays;

public class ClosestTripletsum {
          public static void findClosestTriplet(int[] a, int target) {

        Arrays.sort(a);

        int minDiff = Integer.MAX_VALUE;

        int x = 0, y = 0, z = 0;

        for(int i = 0; i < a.length - 2; i++) {

            int left = i + 1;
            int right = a.length - 1;

            while(left < right) {

                int sum = a[i] + a[left] + a[right];
                int diff = Math.abs(target - sum);

                if(diff < minDiff) {
                    minDiff = diff;

                    x = a[i];
                    y = a[left];
                    z = a[right];
                }

                if(sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        System.out.println("Closest Triplet: " + x + ", " + y + ", " + z);
        System.out.println("Sum = " + (x+y+z));
    }

    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        findClosestTriplet(arr, target);
    }
}
