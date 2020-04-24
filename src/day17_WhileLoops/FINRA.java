package day17_WhileLoops;
/*
3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA

 */

public class FINRA {
    public static void main(String[] args) {

        String result ="";

        for (int i =1; i <=30; i++) { // prints the numbers that are divisible by both 3 and 5
            if ( i % 3 == 0 && i % 5 == 0) {
               // System.out.println("FINRA"+" ");
                result += "FINRA ";//concatenation
            }else if (i % 3 ==0) { // prints the numbers that are ONLY divisible by 3
               // System.out.println("FIN"+" ");
                result += "FIN ";//concatenation
            }else if (i % 5 == 0) { // prints the numbers that are ONLY divisible by 3
               // System.out.println("RA"+" ");
                result += "RA ";//concatenation
            }else{ // prints the numbers that are not divisible by either 3 or 5
               // System.out.println(i);
                result += i+" "; //concatenation
            }

            System.out.println(result);



        }

    }
}
