package mustafas_package;
import java.util.Scanner;
public class replit {


    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Item1, count and its price:");

    String item1= scan.next();
    double price1= scan.nextDouble();
    int count1=scan.nextInt();

    System.out.println("Enter Item2, count and its price:");

    String item2= scan.next();
    double price2= scan.nextDouble();
    int count2=scan.nextInt();

    System.out.println("Enter Item3, count and its price:");

    String item3= scan.next();
    double price3= scan.nextDouble();
    int count3=scan.nextInt();


    String report=" ";
        if(count1==0|| count2>0 || count3>0){
        report="Item2: "+item2+" Price: "+price2*count2+", Item3: "+item3+" Price: "+price3*count3;
        System.out.println("Total price: "+price2*count2+price3*count3);
    }else if(count2==0|| count1>0 || count3>0 ){
        report="Item1: "+item1+" Price: "+price1*count1+", Item3: "+item3+" Price: "+price3*count3;
        System.out.println("Total price: "+price1*count1+price3*count3);
    }else if(count3==0|| count1>0 || count2>0){
        report="Item1: "+item1+" Price: "+price1*count1+", Item2: "+item2+" Price: "+price2*count2;
        System.out.println("Total price: "+price1*count1+price2*count2);
    }else if (count1==0 || count2==0 || count3>0) {
        report="Item3: "+item3+" Price: "+price3*count3;
        System.out.println("Total price: "+price3*count3);
    }else if (count1==0 || count2>0 || count3==0) {
        report="Item2: "+item2+" Price: "+price2*count2;
        System.out.println("Total price: "+price2*count2);
    }else if (count1>0 || count2==0 || count3==0) {
        report="Item1: "+item1+" Price: "+price1*count1;
        System.out.println("Total price: "+price1*count1);



    }
        System.out.println(report);


}
}