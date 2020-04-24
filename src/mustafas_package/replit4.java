package mustafas_package;

import java.util.Scanner;

public class replit4 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        String middleCharacter = "";

        int totalChars = word.length(); //7
        int middleNumber = totalChars/2; //7/2 =3

        if(totalChars % 2 != 0 || totalChars>=3){

            middleCharacter = middleCharacter + word.charAt(middleNumber);
        }else if (totalChars==1){
            middleCharacter=""+word.charAt(0);
            System.out.print(middleCharacter+""+middleCharacter+""+middleCharacter);
        }else if(totalChars % 2 == 0 || totalChars>=4){
            middleCharacter= middleCharacter +word.charAt(middleNumber-1)+word.charAt(middleNumber);
        }else if(totalChars==2) {
            middleCharacter+=word.substring(0,2);
            System.out.print(middleCharacter+""+middleCharacter);
        }


        System.out.println(middleCharacter);



    }
}
