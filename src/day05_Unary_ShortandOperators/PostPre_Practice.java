package day05_Unary_ShortandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++  + a-- + a++;
        //  49  + 49   + 50  + 49 =197
        System.out.println(a);
       int b = 1;
           b = -b-- + b++ / -b-- * --b;
       //  b = -1   + 0  / - 1   * -1 = -1
        // 0  / - 1 = 0
        // 0 * -1 =0
        //0 + -1 = -1
        System.out.println(b);

        int z = 2;
            z = -z-- + z++ / -z-- * --z;
            // -2 + 1 / -2 * 0 = -2
        System.out.println(z);

        int k = 3;
           // k = -k-- + -k++ / -k-- * ++k;
            // -3 + -4 / -5 * 5 = 1

        System.out.println(-k++);






    }
}
