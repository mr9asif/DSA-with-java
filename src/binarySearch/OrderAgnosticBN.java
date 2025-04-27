package binarySearch;

public class OrderAgnosticBN {
    public static void main(String[] args) {
//        int[] arr = {2,3,4,6,8,10,13,15};
        int[] arr = {19,17,14,12,10,2,1,0,-1,-1};
        int target = 10;

        int ans = orderAgnosticBN(arr, target);
        System.out.println(ans);

    }
    static  int orderAgnosticBN(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//        boolean Acc;
//        if(start < end){
//            Acc = true;
//        }else{
//            Acc= false;
//        }
        boolean isAcc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) /2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAcc){
               if(target < arr[mid]){
                   end = mid -1;
                 }else{
                   start = mid +1;
               }
            }else{
                if(target < arr[mid]){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
            return -1;

    }
}
