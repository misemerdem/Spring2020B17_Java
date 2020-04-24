package day12_JavaRecap;

//import

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            String str =  input.next();
            System.out.println(str); // next() only takes the first word


        // 7921 JonesBranch Dr, Mclean VA, 22034
            String fullAdress = "";

        System.out.println("Enter the number of the building: ");
        short Bnumber = input.nextShort();

        fullAdress += Bnumber+" ";

        System.out.println("Enter the Street Name: ");
        String streetName = input.next();
        fullAdress+= streetName+=" ";

        System.out.println("Enter the type of the road: ");
        String roadType = input.next();
        fullAdress+= roadType+=", ";

        System.out.println("Enter the city name, state, zipcode");
        String cityName = input.next();
        fullAdress += cityName+" ";

        String state = input.next();
        fullAdress += state+", ";

        int zipCode = input.nextInt();
        fullAdress += zipCode;

        System.out.println(fullAdress);











    }
}
