package array;

public class SecondMaxArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,10,10,7,8};
        int max = arr[0];
        int Smax=arr[0];

        for(int i=0; i<arr.length; i++){
           for(int j=1; j<arr.length; j++){
              if(arr[j] > max){
                  max=arr[j];
              }

              if(arr[j] > Smax && arr[j] < max){
                   Smax=arr[j];
              }
           }
        }

        System.out.println(Smax+ " "+max);
    }
    
}
