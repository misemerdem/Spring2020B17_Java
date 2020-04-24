package officehours.Practice_03_11_2020;

public class quiz1 {
    public static void main(String[] args) {
        int a = 3,  b = 2;

        long c = (a+b) * 2 / 3 % 2 ;
        System.out.println(c);
        long z = 3_000L;
        double by = (float)a;
        int k =(short)b;
        System.out.println(k % 1000);
        System.out.println ( 10/3 );
        System.out.println (  10/3.0  );
        System.out.println (  (int)(10.0/3)   );


        int  x =  10;

        int  y =  x++;

        System.out.println( y++  + "  " +  x++  + "  " + y);
    }
}
