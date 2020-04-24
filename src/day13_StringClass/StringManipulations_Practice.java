package day13_StringClass;

import java.util.Scanner;

/*
input: cyBerTek sChooL
output: Cybertek
        School
 */
public class StringManipulations_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine(); //cybertek school

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName =lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("Your first name is "+firstName);
        System.out.println("Your last name is "+lastName);



        /*
        write a program that asks the users first and last names, then prints the initals.
        ex:
        input: cybretek school
        output: CS

         */

        System.out.println("Write your first name: ");
        String firstname1 = input.next();

        System.out.println("Write your last name: ");
        String lastname1 = input.next();

        String firstname2= firstname1.substring(0,1).toUpperCase();
        String lastname2 = lastname1.substring(0,1).toUpperCase();

        System.out.println(firstname2+lastname2);





















    }


}
