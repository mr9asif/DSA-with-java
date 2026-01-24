package Array;

public class Segregate0and1 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,0};  // 0 0 0 0 1 1 1

        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;

            if(i<j) break;

            if(arr[i]==1 && arr[j] == 0){
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
                i++;
                j--;
            }
        }

        for(int el : arr){
            System.out.print(el+",");
        }
    }
    
}
