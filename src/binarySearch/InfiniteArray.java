package binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 11, 13, 15, 20, 23, 25};
        int target = 9;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target) {
//        initial start and end and lenght 3
        int start = 0;
        int end = 2;
        int len = 3;

        while (target > arr[end]) {
            start = end + 1;
            end = end + len;

        }
        return  binarySearch (arr, target, start, end);
    }
     static  int binarySearch(int[] arr, int target, int start, int end){
         while(start <= end){
             int mid = start + (end - start) /2;
             if(target> arr[mid]){
                 mid = end +1;
             }else if(target < arr[mid]){
                 mid = end -1;
             }else{
                 return  mid;
             }
         }
         return -1;
     }


}
