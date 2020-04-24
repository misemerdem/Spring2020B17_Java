package day16_ForLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "abab";

        String result = ""; //ab

        for(int i =0; i <= 3; i++) {//0,1,2,3
            /*
            if ( !result.contains(""+str.charAt(i))) {
            result += str.charAt(i);
             */

            if (result.contains(""+str.charAt(i))) {
                // if string result does not contains str.charAt(i), then we concate it to result, if it does we will not
                continue;
            }

            result += str.charAt(i);

        }


        System.out.println(result);






    }
}
