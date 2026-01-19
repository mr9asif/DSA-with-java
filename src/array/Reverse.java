package array;



public class Reverse{
    public static void main(String[] args) {
        int[] arr ={2,4,5,7,1};
        
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            // swap
            int temp =arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
        }

        for( int el : arr){
            System.out.println(el+" ");
        }
    }
}

