package Loops.Patterns;

public class Piramid_pattern {
    public static void main(String[] args) {
        int size = 5;

        //-----------print piramid pattern----------
        for(int row = 0; row < size; row++){
            //-------print spaces---------------
            for(int sp = 0; sp < size-row;sp++){
                System.out.print("   ");
            }
            //---------print stars -------------
            for(int st = 0; st <= row; st++){
                System.out.print(" * ");
            }
            //----------- print stars -----------
            for(int st=1;st<=row;st++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
