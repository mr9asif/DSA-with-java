

import java.util.Arrays;
public class bubble_Sort{

    static void swap(int[] arr, int i, int j){
         int temp=arr[i];
         arr[i] =arr[j];
         
         arr[j]=temp;
    }

    static void bubbleSort(int[] arr){
        boolean swap = false;
       for(int i=0; i<arr.length-1; i++){
         for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                swap(arr,i, j+1);
                swap=true;
            }
            if(swap) break;
         }
       }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,10,70,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}