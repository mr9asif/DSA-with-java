package pattern;

//no: 1
//              *
//             * *
//            * * *
//           * * * *

// no: 2
//       *
//     * * *
//   * * * * *
// * * * * * * *

//no: 3
// * * * * * * *
//   * * * * *
//     * * *
//       *

//no: 4
//       *
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

//no:5

//           *
//           **
//           ***
//           ****
//           *****
//           ******
//           *****
//           ****
//           ***
//           **
//           *


public class Pyramid {
    public static void main(String[] args) {
//        int rows = 4; // Number of rows for the pattern
// no:1
//        for (int i = 1; i <= rows; i++) {
//            // Print leading spaces
//            for (int j = i; j < rows; j++) {
//                System.out.print(" ");
//            }
//
//            // Print stars with spaces between them
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//
//            // Move to the next line after each row
//            System.out.println();
//        }
//
//no:1        // Outer loop for each row
//        for (int i = 1; i <= rows; i++) {
            // Print leading spaces (rows - i)
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print(" ");
//            }
//
//            // Print stars with spaces (i stars in the i-th row)
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//
//            // Move to the next line after finishing one row
//            System.out.println();
//        }

//no:2
//        int rows = 3;
////        // Outer loop for each row
//        for (int i = 0; i <= rows; i++) {
//            // Print leading spaces (rows - i)
//            for (int j = 0; j < rows -i  ; j++) {
//                System.out.print("  ");
//            }
//
//            // Print stars with spaces (i stars in the i-th row)
//            for (int k = 0; k < 2*i +1; k++) {
//                System.out.print("* ");
//            }
//
//            // Move to the next line after finishing one row
//            System.out.println();
//        }

//        no:3
//        int rows = 4;
//        for(int i=rows; i >0; i--){
////            space
//            for(int j=0; j < rows - i; j++){
//                System.out.print("  ");
//            }
////            start
//            for(int k=0; k < 2 * i -1; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



//        no:4

//        int rows = 3;
////        // Outer loop for each row
//        for (int i = 0; i <= rows; i++) {
//            // Print leading spaces (rows - i)
//            for (int j = 0; j < rows -i  ; j++) {
//                System.out.print("  ");
//            }
//
//            // Print stars with spaces (i stars in the i-th row)
//            for (int k = 0; k < 2*i +1; k++) {
//                System.out.print("* ");
//            }
//
//            // Move to the next line after finishing one row
//            System.out.println();
//        }
//        for(int i=rows; i >0; i--){
//////            space
//            for(int j=0; j < rows - i + 1; j++){
//                System.out.print("  ");
//            }
////            start
//            for(int k=0; k < 2 * i -1; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        no:5

//         for(int i=0; i<6; i++){
//             for(int j=0; j< i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//       }
//         for(int i=0; i<6; i++){
//             for(int j=i; j< 6; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
    }
}
