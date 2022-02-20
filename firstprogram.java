import java.util.Scanner;

public class firstprogram {
    public static void main(String[] args) {
        /**int, float, char, string, long, double */ 
        //int age = 20;
        //float averagemarks = 19.345f;
        //char grade = 'A';
        //String name = "Guru";
        //boolean isValid = false;
        //System.out.println("age");


        // +, -, /, *, %, ++, --

        // int firstNumber = 1234;
        // int secondNumber = 234;

        // double sum = (double)firstNumber % (double)secondNumber;
        // System.out.println(sum);

        // int a = 12;
        // System.out.println(++a); // this statement increments by 1 or either use a = a + 1;
        // System.out.println(a);
        // a--; // this statement decrements by 1
        // System.out.println(a);
        // assignment operator is =

        //Taking user input
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // // int age = sc.nextInt();
        // // float age = sc.nextFloat();
        // String name = sc.nextLine();

        // // System.out.println(name);
        // int age = 123;
        // // conditional operators >, <, >=, <=, ==, !=

        // if(age > 18){
        //     System.out.println("You can vote");
        // } else {
        //     System.out.println("You can not vote");
        // }
        // boolean isEqual = 18 == 18;
        // System.out.println(19 >= 19);

        // char grade = 'E';
        
        // if(grade == 'A'){
        //     System.out.println("your grade is very good");
        // } else if (grade == 'B') {
        //     System.out.println("Very good, Keep Learning");
        // } else if (grade == 'D'){
        //     System.out.println("Keep Improving");
        // } else {
        //     System.out.println("Invalid grades");
        // }


        // Switch Case
        // char grade = 'E';

        // switch(grade){
        // case 'A':
        //        System.out.println("your grade is very good");
        //        break;
        // case 'B':
        //        System.out.println("Very good, Keep Learning");
        //        break;  
        // default:
        //        System.out.println("Invalid grades");
        //        break;
        // }

        // LOGICAL OPERATOR   &&, ||, !

        // int age = 19;
        // if(age > 18 && age < 50){
        //         System.out.println("You can vote");
        //     } else {
        //         System.out.println("You can not vote");
        //     }


        // if( !(age > 18) ){
        //     System.out.println("You can vote");
        // } else {
        //     System.out.println("You can not vote");
        // }


        // LOOPS   for, while, do while
        // for(;;)
        // for(int i = 0; i < 10; i++) {
        //     System.out.println("Guru" + i);
        // }

        // while
        // int a = 23;
        // while(true){
        //     System.out.println(a);
        //     a++;
        //     if(a > 105){
        //         break;
        //     }
        // }
        // or can use below code
        // int a = 23;
        // while(a <= 100){
        //     System.out.println(a);
        //     a++;
        // }

        // Do While Loop  - this will print at least one condition
        // int a = 23;
        // do {
        //     System.out.println(a);
        //     a++;   // always use increment so you will not stuck in infinite loop
        // } while(a <= 100);

        // This program is used to skip specific part or number 
        // int a = 23;     
        // while(a <= 100){
        //     a++;
        //     if (a == 65 ) continue;
        //     System.out.println(a);
           
        // }

        // ARRAY
        // 23, 12, 56, 34, 99

        // int marks[] = new int[5];
        // marks[0] = 23;
        // marks[1] = 12;
        // marks[2] = 56;
        // marks[3] = 34;
        // marks[4] = 99;

        // int marks[] ={23, 12, 56, 34, 99, 12, 34};

        // for(int i = 0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // }

        // Matrix
        // int a[][] = new int[2] [3];
        // System.out.println(a[1][0]);
        // System.out.println(average(3, 6));

        int a[] = new int[3];

        try{
        System.out.println(a[4]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error aaya tha");
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("niche ki line");

    }
    //method
    //returnType funtionName (arguments) {}
    
    // static int average(int firstNumber, int secondNumber) {
    //     int sum = firstNumber + secondNumber;
    //     return sum /2;
    // }

    
}

