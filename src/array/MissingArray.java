package Array;

public class MissingArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,3};
         int n = arr.length+1;
         int sum = n*(n+1)/2;
         int arrSum=0;
         for(int el: arr){
            arrSum +=el;
         }
         int res= sum - arrSum;
         System.out.println(res);
    }
    
}
