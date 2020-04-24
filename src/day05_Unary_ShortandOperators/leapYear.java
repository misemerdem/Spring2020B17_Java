package day05_Unary_ShortandOperators;

public class leapYear {
    /*
    Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true
    2. write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
     */

    public static void main(String[] args) {
      short year = 2020;

      //leapYear: year % 4==0
        // if returns true ==> leapYear, if it turns false ==> not leapYear

        boolean leapYear = year % 4 == 0; //if the year can be divided by 4 without any remainder, then it's leap year

        String result = year+ " is leap year: " + leapYear;
        System.out.println(result);



    }
}
