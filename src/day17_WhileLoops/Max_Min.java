package day17_WhileLoops;

import java.util.Scanner;
/*
1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
 */
public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int MaxNumber = -99999999; // any number user provided will be greater than this number
                     // first user entered variable will be initilized to MaxNumber
                    // MaxNumber = ;
        int MinNumber = 999999999;

        for (int i =1; i <10; i++) { // i: 1, 2, 3, 4, 5
            System.out.println("Enter a number");
            int num = input.nextInt(); // 1, 3, -2, 0, 0,
            if (num > MaxNumber) {
                MaxNumber = num;
            }
            if (num<MinNumber) {
                MinNumber =num;
            }

        }

           System.out.println("Maximum Number: "+MaxNumber);
           System.out.println("Minimum Number: "+MinNumber);












    }
}
