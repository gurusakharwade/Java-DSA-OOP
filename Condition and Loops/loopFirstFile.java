import java.util.Scanner;

public class loopFirstFile {
    public static void main(String[] args) {
        //Q: print numbers from 1 to 5
        /*
           syntax of for loops:

           for (initialization; condition; increment/decrement) {
              // body
            }
         */
         // Q: Print number from 1 to 5
//         for (int num = 1; num <= 5; num +=1){
//             System.out.println(num);
//         }

         // Print number from 1 to n
//        Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//
//        for (int num = 0; num <= n; num++) {
//            System.out.print(num + " ");
//        }



        // while loops
        /*
             Syntax:
             while (condition) {
                 // body
             }
         */

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }


        // do while
        /*
             do {

             } while (condition);

         */

        int n = 1;
        do {
            System.out.println("Hi World");
        } while (n != 1);
    }
}
