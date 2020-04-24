package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some number");
      //  String name = input.next(); //Enter+Enter+Enter+Muhtar it only takes Muhtar
        int num = input.nextInt(); //13+Enter ==> 13
        System.out.println(num);

        input.nextLine();// Enter that comes from 13 will printed

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println(name);











    }
}
