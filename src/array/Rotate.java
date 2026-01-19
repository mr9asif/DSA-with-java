package array;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,2,3,1};
        int d= 3;
        int n = arr.length;
        /*
          1. first rotate from 0 to d-1;
          2. rotate d to n-1;
          3. then rotated whole arr. then we will get the full arr from d to rotated.
        
        */ 
        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);

        for(int el : arr){
            System.out.print(el+" ,");
        }
    }

    static void rotate(int[] arr, int i, int j){
        // swap -- it will rotated
      while(i<j){
          int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
      }
    }
}
