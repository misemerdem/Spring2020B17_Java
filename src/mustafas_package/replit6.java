package mustafas_package;

import java.util.Scanner;

public class replit6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String reverse1 = "" + word.charAt(4)+ word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);



        if(word.length()<5) {
            System.out.println("Too long!");
        }else if (word.length()>5){
            System.out.println("Too short!");
        }else{
            System.out.println(reverse1);
        }







    }
}
