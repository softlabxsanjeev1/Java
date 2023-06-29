package Loops;

public class Labelled_break_continue {
    public static void main(String[] args) {
        external: for(int i=1; i<=5; i++){
            internal: for(int j = 1; j<=5 ;j++){
                if(i==3){
                    break external;                 // ----------use labeled break;
                } System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
