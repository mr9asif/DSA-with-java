package lenearSearch;

public class FindEven {
    public static void main(String[] args) {
        int[] arrs = {33,2,444,34,23};
       int ans = findEvenNum(arrs);
        System.out.println(ans);

    }
    static int findEvenNum(int[] arrs){
        int count = 0;
        for(int num : arrs){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        String sr = String.valueOf(num);
        int len = sr.length();
        if(len % 2 == 0){
            return  true;
        }
        return false;
    }
}
