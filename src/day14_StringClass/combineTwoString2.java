package day14_StringClass;

import java.util.Scanner;

/*
Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

 */
public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        System.out.println("Enter first word"); //Apple
        String word1 = input.next(); //pple

        word1 = word1.substring(1);


        System.out.println("Enter second word"); //Banana
        String word2 = input.next();//anana

        word2 = word2.substring(1);




        String result = word1+word2;
        System.out.println(result);













    }
}