package day27_DayTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        //days_months_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        create a date  called birthDay: month / days / year
        ex:04/23/20
         */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E MMMM/dd/yy");

        LocalDate birthDay = LocalDate.of(2000,10,06);
        System.out.println(birthDay.format(dtf));
        String str1 = birthDay.format(dtf2);

        System.out.println(str1);

        LocalDate date3 =LocalDate.now();

        System.out.println( date3.format(dtf2) );


    }
}
