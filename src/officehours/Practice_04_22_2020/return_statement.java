package officehours.Practice_04_22_2020;

public class return_statement {
    public static void main(String[] args) {
        /*
        if (10>9){
            return;
        }
         */

        method1();

        System.out.println("Hello Batch 18");


    }

    public static void method1(){
        if (10>9){
            return;
        }

        System.out.println("Hello Cybertek");

    }

    public static void method2(){
        return; //exist only
    }

    public static int method3(){
        return 123; //exists after returning the value
    }





}
