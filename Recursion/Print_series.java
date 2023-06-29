package Recursion;

public class Print_series {

    //-----------method to print series--------
    static void printSeries(int num){
        // System.out.println(num);         // print reverese counting
        if(num>0){
            printSeries(num-1);
            System.out.println(num);         
        }        
    }


    public static void main(String[] args) {
        printSeries(5);
    }    
}
