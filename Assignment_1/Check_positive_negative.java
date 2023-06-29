import java.util.Scanner;

public class Check_positive_negative {
    public static void main(String[] args) {
        int n;
        System.out.print("Enetr no : ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        if(n==0){
            System.out.println("Zero.");
        }else{
            String res = (n<0)?"Negative":"Positive";             // ternary operator
            System.out.println(res);
        }
    }    
}
