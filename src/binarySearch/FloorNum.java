package binarySearch;

public class FloorNum {
    public static void main(String[] args) {
//        floor = smalest num <= target;
//        ceil = end num of < target so end;
        int[] arr = {2,3,4,6,9,12,13,15,17,20,24,25};
        int target = 10;
        int ans = ceilingNum(arr, target);
        System.out.println(ans);
    }

    static int ceilingNum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target > arr[mid]){
                start = mid +1;
            }else if (target < arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return end;
    }

}
