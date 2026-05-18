package TwoPointer;

public class TwoSum {
     public static void main(String[] args) {
       int[] arr = {2,3,5,6,8,9};
       int target = 7;
       int i=0;
       int j=arr.length-1;
       boolean found=false;
       while(i<j){
           int sum = arr[i]+arr[j];
           if(sum == target){
               System.out.println("found target: " + target);
               found=true;
               break;
               
           }
           if(sum < target){
               i++;
           }else{
               j--;
           }
       }
       if(!found){
             System.out.println("not foundd");
       }
        
    }
}
