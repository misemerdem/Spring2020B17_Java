package day03_VariablesContinue;

public class Variables {
    public static void main(String[] args) {

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 87 + 2 > 10;
        System.out.println(result3);


        System.out.println(9>= 8); //true
        System.out.println(10 != 11); //true
        System.out.println("Muhtar" == "Good Guy"); //false


        System.out.println(true != false); //true

        // 1. true, 2. false, 3.maybe

        //System.out.println(9 = 9);
        // = operator is only used for assigning values to variables

        char ch1 = 'A' ;
        System.out.println(ch1);

        char ch2 = '1';
        System.out.println(ch2);

        char ch3 = 100;
        System.out.println(ch3);

        char ch4 = 5000;
        System.out.println(ch4);

        char ch5 = 48000;
        System.out.println(ch5);

        char ch6 = 32000;
        System.out.println(ch6); //number is 97

        char character1 = 'a';
        //short s1 = character1;

        int num1 = character1;
        System.out.println(num1); //97

        int total = 'a'+'b';
        //           97+98=195

        System.out.println(total);




    }
}
