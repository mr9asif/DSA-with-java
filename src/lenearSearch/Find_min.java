package lenearSearch;

public class Find_min {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,4,-3,4,5,67};
        int ans = minNum(arr);
        System.out.println(ans);
    }
    static int minNum(int[] arr){
        int min = arr[0];
        for(int i = 1; i <= arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                return min;
            }
        }
        return min;
    }
}
