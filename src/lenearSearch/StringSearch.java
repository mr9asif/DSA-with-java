package  lenearSearch;

import java.util.Arrays;

public  class StringSearch {
    public static void main(String[] args) {
        String name = "Asif khan";
        char target = 's';
        boolean ans = Search(name, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean Search(String name, char target){
        if(name.length() == 0){
            return false;
        }
        for(char ch: name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}