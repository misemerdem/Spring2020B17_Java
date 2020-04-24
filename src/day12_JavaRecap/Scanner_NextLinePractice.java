package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 7921 JonesBranch Dr, Mclean VA, 22034
        // fullAddress: Building-number Street, city, state, state zipcode

        System.out.println("Building Number: ");
        int Bnumber = input.nextInt(); //7925 + Enter ==> 7925
        System.out.println("Building Number is: "+Bnumber);

        input.nextLine(); // enter from the previous int

        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println("Street is: "+street);

        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt(); // 22034 + Enter
        System.out.println("Zip code is: ");

        input.nextLine(); // enter from the previous int

        System.out.println("enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();

        String fulladress = Bnumber+" "+street+", "+cityState+" "+zipCode;

        System.out.println(fulladress);

        input.close(); //closes the scanner


















    }
}
