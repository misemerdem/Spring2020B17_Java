package officehours.Practice_03_11_2020;

public class Practice_Variables {
    /*
    declear variable: DataType variableName = Data;
    String: for text data
    Primative data types:
    byte, short, int, long: they only accept whole numbers
    float, double: accept decimals
     */
  /*
        brand
        year
        price
        model
        Max miles
         */
    public static void main(String[] args) {

        String brand = "BMW";
        System.out.println(brand);
// variables that are decleared in a block, must be initilaized before use

        short year = 2020;
        float price = 5000.50f;
        String model = "X6";
        short Maxmiles = 32767;

 /* +: when we apply + to String of text, it concatenates it
      when we apply + to numbers, addition
   */
        System.out.println(9+10); //19 addition: both left and right side of the + values are numbers.
        System.out.println("9"+"10"); //910
        System.out.println("9"+ 10); //910
        System.out.println("The vehichle "+ year + " "+ brand+" " + model+", has "+ Maxmiles+" miles, price is "+ price+" dollars");




    }

}
