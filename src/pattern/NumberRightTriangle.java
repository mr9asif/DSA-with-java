package pattern;

//1
//1 2
//1 2 3
//1 2 3 4

//so here basically i or row is number and colum also,, here also colum increase by row..same rightTriangle

public class NumberRightTriangle {
    public static void main(String[] args) {
        for(int i =1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
