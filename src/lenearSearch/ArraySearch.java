package lenearSearch;

//search the index of the target...using lenear search

class ArraySearch {
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
                return el;
            }

        }
        return -1;
    }
}




//find the target value...

//here in lenearSearch method i have to be use static ohterwise i have to be create a obj of this class....
//class ArraySearch{
//    public static void main(String[] args) {
//         int[] nums = {2,3,4,-1, 55,78,34};
//         int target = 55;
//         int ans = lenearSearch(nums, target);
//        System.out.println(ans);
//    }
//
//    static int lenearSearch(int[] arr, int target){
//        for(int el: arr){
//            if(el == target){
//                return el;
//            }
//        }
//            return -1;
//    }
//}