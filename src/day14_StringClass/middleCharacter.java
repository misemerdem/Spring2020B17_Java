package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");

        String word = input.next();    //bananas
                                      // 0123456

        String middleCharacter = ""; // to store the middle characters at the end

        int totalChars = word.length(); //7
        int middleNumber = totalChars/2; //7/2 =3

        if(totalChars % 2 != 0){// odd numbers
                      // middleCharacter += word.charAt(middleNumber);
            middleCharacter = middleCharacter + word.charAt(middleNumber);
        }else{
            middleCharacter= middleCharacter +word.charAt(middleNumber-1)+word.charAt(middleNumber);
        }


        System.out.println(middleCharacter);
















    }
}
