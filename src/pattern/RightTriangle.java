package pattern;

//*
//**
//***
//****

//so here if my row is increase my colum al increase..i mean if row 1 colum 1, if row 2 colum 2, so j<=i
public class RightTriangle {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for( int j = 0; j<i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
