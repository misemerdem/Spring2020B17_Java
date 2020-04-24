package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

       String[] beautifulPeople = {"Harun","Serhat","Fayssel","Mohammed","Omar","Arzu"};
       //                            1        2        3         4        5        6
       /*
        System.out.println(beautifulPeople[6]);

        String s1 = beautifulPeople[2];
        System.out.println(s1);

        */

       for (int i = 0; i<= 5; i++) {
          String name = beautifulPeople[i];
           System.out.println(name);
       }


       String[] emails ={"cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};

       //print out all the user who registered with their gmail
        //max: 4
        for (int i = 0; i<=3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }
        }




    }
}
