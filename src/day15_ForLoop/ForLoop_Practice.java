package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        /*
        odd number between 0 ~ 100 in a single line seperated by a space
                           1 3 5 7 9 ......
         */

        String resultOdd = "";

        for (int  number = 1; number <= 100; number +=2 ) {
           // System.out.print(number+" ");
            // result += number+" ";
            resultOdd = resultOdd + number+" ";
        }

        System.out.println(resultOdd);


        /*
        even number between 0 ~ 100
                    0 2 4 6 8 10 .....
         */

        String resultEven = "";

        for ( int number = 0; number<=100; number +=2 ) {
            resultEven += number+" ";
        }

        System.out.println(resultEven);






    }
}
