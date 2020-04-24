package day03_VariablesContinue;

public class SalaryCalculator {
/*
Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD
 */

    public static void main(String[] args) {

        double rate = 40;
       float stateTaxRate = 0.04f;
       float federalTaxRate =0.22f;
       byte weeklyHours = 40;

        // salary = rate * weeklyHour * 4 * 12

        double salary = rate * weeklyHours * 52;
        //stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;
        //FederalTax= salary * federalTaxRate
        double federalTax = salary * federalTaxRate;
        // income after tax = salary - (stateTax + federalTax );
        double incomeAfterTax = salary - (stateTax+ federalTax);
        System.out.println("Your salary is: "+ salary); //concatenation
        System.out.println("State tax is: "+ stateTax); // state tax is 4575
        System.out.println("Federal tax is: "+federalTax);
        System.out.println("Total tax is: "+ (stateTax+ federalTax));
        System.out.println("Your Net Salary is: $ " +incomeAfterTax);



    }

}
