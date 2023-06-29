package Methods;
import java.util.Scanner;

// --perfect no sum of all factors of no = no;
// 6 = 1+2+3;
//28 = 1+2+4+7+14

public class Check_perfect_no {
    
    // -------------method to check perfect no.
    
    static boolean checkPerfect(int num){
        boolean check = false;
        int sum = 0;
        for(int i = 1; num%i == 0; i++){
            if(num%i==0)
            sum+=i;
        }
        if(sum==num){
            check = true;           
        }
        return check;
    }


    public static void main(String[] args) {
        
        // System.out.println("Enetr no here = ");
        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        int num = 28;

        if(checkPerfect(num)){
            System.out.print("Yes !")
        }else{
            System.out.print("no !")
        }
    }
    
}
