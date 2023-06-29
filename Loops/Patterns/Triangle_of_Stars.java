package Loops.Patterns;

public class Triangle_of_Stars {
    public static void main(String[] args) {
        int size = 10;
        for(int row = 1; row < size; row++){
            // space
            for(int sp = 1; sp < size-row; sp++){
                System.out.print(" ");
            }
            //stars
            for(int st = 1; st < 2*row; st++){
                if(st == 1 || st == 2*row-1 || row == size-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
