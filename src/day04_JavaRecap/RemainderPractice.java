package day04_JavaRecap;

public class RemainderPractice {
    public static void main(String[] args) {
        // 1897651 is odd

        int number = 87654;

        boolean oddNumber = number % 2 != 0; //for odd numbers
        boolean evenNumber = number%  2 == 0; //for even numbers

        boolean divisibleBy3 = number % 3 == 0; //divisible by 3
        boolean divisibleBy5 = number % 5 == 0; //divisible by 5

        System.out.println("The number "+number+" iss odd number: "+ oddNumber);
        System.out.println("The number "+number+" iss even number: "+ evenNumber);
        System.out.println("The number "+number+" iss divisible by 3: "+ divisibleBy3);
        System.out.println("The number "+number+" iss divisible by 5: "+ divisibleBy5);






    }
}
