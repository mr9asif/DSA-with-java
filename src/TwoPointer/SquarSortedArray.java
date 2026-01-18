package TwoPointer;

public class SquarSortedArray {
     public static void main(String[] args) {
        int[] arr = {-7, -3, -1, 2, 4, 5}; // example input
        int n = arr.length;
        int[] result = new int[n]; // to store sorted squares

        int i = 0;         // start pointer
        int j = n - 1;     // end pointer
        int pos = n - 1;   // position to fill in result array (from largest to smallest)

        while (i <= j) {
            int left = arr[i];
            int right = arr[j];

            if (Math.abs(left) > Math.abs(right)) { //here Math.abs for ignore possitive or negative to comapre the number only.
                result[pos] = left * left;
                i++; // move start forward
            } else {
                result[pos] = right * right;
                j--; // move end backward
            }
            pos--; // move backward in result array
        }

        // Print the sorted squared array
        System.out.print("Sorted squares: ");
        for (int k = 0; k < n; k++) {
            System.out.print(result[k] + " ");
        }
    }
}
