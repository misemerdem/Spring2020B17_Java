package day07_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 400.5;

        boolean aMin = a < b && a < c; //if a is less than both b and c, then a is the minimum
        boolean bMin = b < a && b < c; //  if b is less than both  a and c, then b is the minimum.
        boolean cMin = c < a && c < b; // if c is less than both b and a, then c is minimum.

        if(aMin) {
            System.out.println(a+" is the minimum number");
        }
        if(bMin) {
            System.out.println(b+" is the minimum number");
        }
        if(cMin) {
            System.out.println(c+" is the minimum number");
        }















    }
}
