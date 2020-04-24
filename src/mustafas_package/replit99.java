package mustafas_package;

import java.util.Scanner;

public class replit99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        int n=0;
        str+=" ";
        for (int i=1; i <= str.length()-1;i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
            }else{
                count=(count>=2)?(count+1):0;
                n+=count%3+count/3;
                count=0;
            }
        }
        System.out.println(n);
    }
}
