import java.util.Scanner;
public class Divide_2_no {                              // n1>n2     , n2!=0
    public static void main(String[] args) {
        int num1,num2;
        float res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = sc.nextInt();

        if(num2 != 0){
            res = num1/num2;
            System.out.println("Result : "+res);
        }else{
            System.out.println("Please enter number_2 greater then 0");
        }


    }    
}
