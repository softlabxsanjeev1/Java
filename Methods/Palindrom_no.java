package Methods;
import java.util.Scanner;

public class Palindrom_no {

    //--method to check palindrom no.
    static int checkPalindrom(int num){
        int i = 0;
        int num2 = 0;
        while(num>0){
           int rem = num%10;
            num2 = rem*10+rem;
            num = num/10;
        }
        return num2;  
}


    //--main method------
    public static void main(String[] args) {

        System.out.print("Enter number here = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int res = checkPalindrom(num);

        if(res == num){
            System.out.println(num+" is palindrom no.");
        }else{
            System.out.println(num+" is not a palindrom no.");
        }
    }
    
}
