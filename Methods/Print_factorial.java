package Methods;

import java.util.Scanner;

public class Print_factorial {

    // ------factorial method
    static int printFactorial(int num){
        int fact=1;
            for(int i = 1; i <= num; i++){
                fact*=i;
            }        
        return fact;
    }


    public static void main(String[] args) {
        System.out.print("Enter number here = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int factorial=printFactorial(num);     //--- printFactorial method calling      
        System.out.println(num+"! = "+factorial);       
    }
    
}
