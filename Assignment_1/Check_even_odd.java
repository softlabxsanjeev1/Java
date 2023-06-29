import java.util.Scanner;

public class Check_even_odd {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter no : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num==1 || num%2 != 0){
            System.out.println("Odd no !");
        }else{
            System.out.println("Even no !");
        }        
    }  
}
