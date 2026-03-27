package Array;

import java.util.Arrays;

public class TwoSome {

    //brute force
    /* 
    static int[] brute(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            int f = target - num[i];
            
            // Note: Starting j at i + 1 prevents using the same index twice
            for (int j = i + 1; j < num.length; j++) { 
                if (f == num[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
        */

    // Binary twosome
    public static int[] binary(int[] nums, int target){
          Arrays.sort(nums);
          
          return nums;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 4, 6, 8, 9, 10};
        int target = 8;  
   
        // int[] ans = brute(num, target);
         int[] ans = binary(num, target);
   
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
