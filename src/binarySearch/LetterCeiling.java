package binarySearch;

public class LetterCeiling {
    public static void main(String[] args) {
        char[] letter = {'c','d', 'g', 'h', 'k'};
        char target = 'c';
        char ans = letterCeil(letter, target);
        System.out.println(ans);

    }
    static char letterCeil(char[] letter, char target){
        int start = 0;
        int end = letter.length - 1;

        while(start <= end){
            int mid =start + (end - start) /2;
            if(target < letter[mid]){
                end = mid -1;
            }else{
                start = mid  + 1;
            }
        }
        return letter[start % letter.length];
    }
}
