package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        String r = Arrays.toString(arr);
        System.out.println(r);

        System.out.println(arr); //array MUST be coverted to string before printed

        String names[] ={"Madina","Fatih","Osman"};

        System.out.println(Arrays.toString(names));

        double[] nums = {10,20,30,40,50};

        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]+1); // to understand if num is string or a number










    }
}
