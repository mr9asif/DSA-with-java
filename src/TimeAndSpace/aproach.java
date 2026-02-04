package TimeAndSpace;

public class aproach {
    public static void main(String[] args) {

   // Q. Given an array size of n+1, One of the element duplicate in the array, find the duplicate element;

    // arr
    int[] arr = {2,3,4,5,4};
    int n = arr.length;
 
    // Aproach: 1 --> find using nested loop
    // O(n*n)
/* 
     boolean find = false;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i] == arr[j]){
                System.out.println("duplicate:"+arr[i]);
                find=true;
                break;
            }
        }
    }
    if(find != true){
        System.out.println("not duplicate");
    }
*/ 



    // Aproach 2 --->
    boolean[] flag = new boolean[n+1];

    for(int i = 0; i<n; i++){
        int ele = arr[i];
        if(flag[ele] == true){
            System.out.println("duplicate"+flag[ele]);
        }else{
            flag[ele]=true;
            System.out.println("no duplicate");
        }
        
    }



    }

    
  

}
