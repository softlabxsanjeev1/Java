import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
         System.out.print("Enter no hre = ");
         Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();
         int fact = 1;

         //---------- factorial logic
         if(num == 0 || num == 1){
            System.out.print(num+"! = "+num+" = "+fact);
         }else{
            for(int i = 1; i <= num; i++){
                fact*=i;
            }
            System.out.print(num+"! = "+fact);
         }

    }
}
