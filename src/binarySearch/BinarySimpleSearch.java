package binarySearch;

public class BinarySimpleSearch {
    public static void main(String[] args) {
//        int[] arr ={-2,-1, 0, 2, 5, 7 , 8, 9,14,15, 20, 24, 25};
        int[] arr ={30, 22, 21, 20, 10, 5,2,1};
        int target = 20;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
//    ans will be the index
//    if not find it will be -1;
    static  int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
//        mid= start + end /2 but it can getter than int max value..so best practice is mid = start + (end - start) /2
        while (start <= end){
        int mid = start + (end-start) / 2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
