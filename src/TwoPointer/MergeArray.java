package TwoPointer;

public class MergeArray {
    // two even and odd sorted array has given i have to merge them using two pointer so that it's take only O(n) times. if i do simple brute force it will take n log(n) times. that's why two pointer.
   public static void main(String[] args) {
      int[] a = {1,3,5};
    int[] b = {2,4,6};
     
    int n= a.length, m=b.length;

    int[] arr = new int[n+m];

    int i=0, j=0, id=0;

    while(i<n && j<m){
        if(a[i] < b[j]){
            arr[id]=a[i];
            id++;
            i++;
        }else{
            arr[id]=b[j];
            id++;
            j++;
        }
    }
    // for after finish one array other should also push new array
      while(i <n){
          arr[id]=a[i];
            id++;
            i++;
      }
      while(j<m){
          arr[id]=b[j];
            id++;
            j++;
      }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
   }
}
