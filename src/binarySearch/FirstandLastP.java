package binarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstandLastP {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,12,13,15};
        int target = 6;
        int ans = firstAndLastP(arr, target);
        int[] f = {ans-1, ans +1};
        System.out.println(Arrays.toString(f));
    }
    static  int firstAndLastP(int[] arr, int target){
         int start = 0;
         int end = arr.length -1;

         while(start <= end){
             int mid = start + (end - start) / 2;

             if(target < arr[mid]){
                 end = mid -1;
             }else if(target > arr[mid]){
                 start = mid + 1;
             }else{
                 return mid;
             }
         }
         return  -1;

    }
}
