package day23_Methods;

public class Methods_WithParameters2 {
    // 3. create a function that can reverse amy string

    //"Muhtar" ==> rathuM,  "Cybertek" ==> ketrebyC

    public static void main(String[] args) {
        String names = "Misem";
        ReverseString(names);

    }

    public static void ReverseString(String str){
        for (int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }

    }

}
