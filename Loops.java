

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: Print numbers from 1 to 5
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
        // syntax for for loops:
        //for (initialisation ; condition ; increment/ decrement){
        //body }
//        for( int num = 1 ; num <= 5 ; num +=1) {
//            System.out.println(num);
//        }
        // print numbers from 1 to n n means user input
        System.out.println("enter the number-");
        Scanner input = new Scanner(System.in);
        //int n = input.nextInt();
//        for (int num = 0; num < n; num++) {
//            //System.out.println(num);
//            System.out.println("hello world");
//        }
        // while loop
        /*
        syntax
        while (condition){
        //body
        }

       */
//        int num = 1;
//        while (num <= 5){
//            System.out.println(num);
//            num += 1;}


        // when you don't know how many times loop will run
        // do while loop
    /*
    syntax =
    do {
    }
    while (condition); */
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);



    }

}

