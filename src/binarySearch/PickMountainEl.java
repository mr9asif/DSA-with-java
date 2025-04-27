package binarySearch;

public class PickMountainEl {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int ans = mountainSearch(arr);
        System.out.println(ans);
    }
    static  int mountainSearch(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int mid = start + (end -start) /2;

        if(arr[mid] > arr[mid +1]){
            end = mid;
        }else if(arr[mid] < arr[mid + 1]){
            start = mid +1;
        }
        return arr[start];
    }
}
