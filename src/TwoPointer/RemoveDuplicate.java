package TwoPointer;

public class RemoveDuplicate {
    public static void main(String[] args) {
       int[] arr = {2,2,5,5,8,9};
     
       int i=0;
       int j=1;
       int n= arr.length;
       while(j<n){
           
           if(arr[j] != arr[i]){
                i++;
               arr[i]=arr[j];
                
               
           }else{
               j++;
           }
         
       }
       
       for(int m=0; m<=i; m++){
           System.out.print(arr[m]+ " ");
       }
     
        
    }
}
