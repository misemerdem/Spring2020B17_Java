package mustafas_package;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class quizarray {
    public static void main(String[] args) {
        char[] arr = {'D','C','A','B'};
        Arrays.sort(arr);
        for (char each: arr){
            System.out.print(each+" ");
            if (each == 'D'){
                continue;
            }
        }
    }
}
