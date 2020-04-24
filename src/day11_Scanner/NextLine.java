package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String fullName = input.nextLine(); //accepts "enter"

        System.out.println("Your full name is: "+fullName);

        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();

        System.out.println("You entered: "+sentence);




    }
}
