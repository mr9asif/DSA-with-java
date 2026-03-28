package TwoPointer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumtoZeroNoDuplicate {
     public static List<List<Integer>> findTriplets(int[] a) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(a);

        for(int i = 0; i < a.length - 2; i++) {

            // skip duplicate i
            if(i > 0 && a[i] == a[i-1]) continue;

            int left = i + 1;
            int right = a.length - 1;

            int target = -a[i];

            while(left < right) {

                int s = a[left] + a[right];

                if(s == target) {

                    result.add(Arrays.asList(a[i], a[left], a[right]));

                    left++;
                    right--;

                    // skip duplicates
                    while(left < right && a[left] == a[left-1]) left++;
                    while(left < right && a[right] == a[right+1]) right--;
                }
                else if(s < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = findTriplets(arr);

        System.out.println("Triplets with sum = 0 :");

        for(List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
