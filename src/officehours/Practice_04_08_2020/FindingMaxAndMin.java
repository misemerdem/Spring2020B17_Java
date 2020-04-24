package officehours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -23456789; //10
        int min = 23456789;

        int i =1;
        while(i <=5){
            System.out.println("Enter a number");
            int num = input.nextInt(); // 0, -5, 10

            if(num>max) { //whichever the user input is larger, will be assigned max
                max = num;
            }

            if(num<min) { //whichever the user input is smaller, will be assigned min
                min= num;
            }

            i++;

        }

        System.out.println("maximum number is "+max);
        System.out.println("minimum number is "+min);








    }
}
