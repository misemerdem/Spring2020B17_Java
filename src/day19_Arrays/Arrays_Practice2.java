package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println(arr.length); //3

        int[] arr2 = new int[5];
        System.out.println(arr2[0]);
        System.out.println(arr[1]);


        String[]Testers = new String[3]; //"Reem","Madina","Osman"
        //                           index:  0       1        2

        Testers[0] = "Reem";
        Testers[2] = "Osman";


        System.out.println(Testers[0]);// Reem
        System.out.println(Testers[1]);//null
        System.out.println(Testers[2]);//Osman

        System.out.println(Testers.length); //3

        System.out.println("============================================");
        Scanner input = new Scanner(System.in);
        String[]Students = new String[10];

        System.out.println("Give first name");
        String first = input.next();
        Students[0]= first;

        System.out.println("Give second name");
        String second = input.next();
        Students[1]= second;

        System.out.println("Give third name");
        String thrid = input.next();
        Students[2]= thrid;

        System.out.println("Give fourth name");
        String fourth = input.next();
        Students[3]= fourth;

        System.out.println("Give fifth name");
        String fifth = input.next();
        Students[4]= fifth;

        System.out.println("Give sixth name");
        String sixth = input.next();
        Students[5]= sixth;

        System.out.println("Give seventh name");
        String seventh = input.next();
        Students[6]= seventh;

        System.out.println("Give eight name");
        String eighth = input.next();
        Students[7]= eighth;

        System.out.println("Give nineth name");
        String nineth = input.next();
        Students[8]= nineth;

        System.out.println("Give tenth name");
        String tenth = input.next();
        Students[9]= tenth;

        String r = Arrays.toString(Students);
        System.out.println(r);
        System.out.println(Students);






    }
}
