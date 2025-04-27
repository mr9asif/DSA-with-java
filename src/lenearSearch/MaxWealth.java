package lenearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] persons = {
                {2,3,44}, {3,22,4}, {22,2,4}
        };
        int ans = maxWealth(persons);
        System.out.println(ans);

    }
    static int maxWealth(int[][] persons){
     int max = Integer.MIN_VALUE;
//        row loop
        for(int[] rowp : persons){
//            each row sum
            int sum = 0;
            for(int colp: rowp){
                sum +=colp;
            }
            if(sum > max){
                return max = sum;
            }
        }

    return max;
    }
}
