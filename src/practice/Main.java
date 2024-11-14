import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,4};
        int target = 4;
        int ans = lenearSearch(arr, target);
        System.out.println(ans);
    }
    static int lenearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<= arr.length; i++){
            int el = arr[i];
            if(el == target){
                return i;
            }

        }
        return -1;
    }
}