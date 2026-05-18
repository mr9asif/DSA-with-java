package Basic;

public class Basic {
 public static void main(String[] args) {
       //** */ Divition of data type
    int x = 5/2; //2
    double y = 5.0/2; // 2.5

    //  so if i give int only then give only int if anyone give double or higer dataype it will do that/
    // System.out.println(y);

    // ** ASCI Value by Char
    /*
      char a = 97, b=98, c=99.....z=122
      char A=65, B=66....
      char 0=48, 1=49 ....
    
    
    */ 
   char ch = 'a';
//    System.out.println(ch+0); // here i use char+int that's why it convert into int

   int sp = 32;
   char s = (char) sp;
//    System.out.println("space here" +s);  // 32 is space 

// ***  BODMAS
/*
   * , / , % > +, -  // here first 3 operation has more power
  *, / , % is equal power and start left to right

*/

/**
 * Increment
 *  x++ // here it will update later
 * ++x // here update first
 * 
 *  */ 
  int u = 10;
  System.out.println(u++);  // 10
  System.out.println(++u); //12
  System.out.println(u); //12

 }
}
