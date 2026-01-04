package recursion;

public class recursion {
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        // increasing recursion
        printIncreasing(n-1);

        // self work
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n=5;
        printIncreasing(n);
    }
}

