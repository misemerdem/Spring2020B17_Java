package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {

        boolean coldWeather = true;
        if (coldWeather) {
            //true so the print statement gets executed.
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }

        boolean coronaDetected = false;
        if (coronaDetected) {
            //false so the print statement dosen't get executed.
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }

        System.out.println("==========================================================");
        int a = 200;
        boolean evenNumber = a % 2 == 0; // if a number can be divided by 2 without remainder it's an even number.
       // boolean oddNumber = a % 2 != 0; // if a number cannot be divided by 2 evenly

        if (evenNumber) {
            System.out.println(a +" is even number.");
        }
        if (!evenNumber) { //if the number is not even number then it must be odd
            System.out.println(a +" is odd number.");
        }






    }
}
