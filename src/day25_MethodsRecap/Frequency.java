package day25_MethodsRecap;

public class Frequency {
    // remove duplicates from string

    // Frequency of string

    // merge two array and return third one

    // max number from array

    // min number from array

    public static String RemoveDuplicates(String str){
        String result =  "";      //AB

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }

        }

        return result;
    }
}
