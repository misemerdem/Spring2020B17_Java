package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        //                     0        1          2        3
        String[] DevTeam = {"Zeynep","Haider", "Jovid","Muhtar"};

        String [] TestersTeam ={"Rahman", "Aishan", "Osman","Ali"};

        String [] PO ={"Brazy", "Donald"};

        String [][] ScrumTeam ={DevTeam,TestersTeam, PO};
        //                         0   ,     1        2


        ScrumTeam [0][3] = "Jean";
        System.out.println(ScrumTeam[0] [3]);
        String info = ScrumTeam [1][2];

        System.out.println(info);

        System.out.println("===============================================");

        for (String eachEmployee :ScrumTeam[2]){
            System.out.println(eachEmployee);
        }

        System.out.println("================================================");
        System.out.println(ScrumTeam[2][1]);







    }
}
