package lenearSearch;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {2,3,4,54,3,45},
                {4,33,55,4,3,4,33}
        };
        int target = 45;
        boolean ans = search1(nums, target);
        System.out.println(ans);
        int[] ans2 = search2(nums, target);
        System.out.println(Arrays.toString(ans2));

    }
    static  boolean search1(int[][] arr, int target){
        for(int[] el: arr){
            for(int e: el){
                if(e == target){
                    return true;
                }
            }
        }
            return false;
    }

    static int[] search2(int[][] arr, int target){
         for(int row = 0; row<arr.length; row++){
             for(int col=0;  col< arr[row].length; col++){
                      if(arr[row] [col] == target){
                          return new int[] {row, col};
                 }
             }
         }
         return new int[] {-1,-1};
    }
}
