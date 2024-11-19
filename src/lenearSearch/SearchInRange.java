package lenearSearch;

//this is about Search in range like we can search from 2 index to 6 index only..something like that

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {0,3,4,3,2,3,4,5};
        int target = 2;
        int start = 2;
        int end = 5;
        int ans = search(nums,  target, start,  end);
        System.out.println(ans);
    }

    static int search(int[] nums, int target, int start, int end){
//        loop for nums and find target start to end
        for(int i = start; i<=end; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
