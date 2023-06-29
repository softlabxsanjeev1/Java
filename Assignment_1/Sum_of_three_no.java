import java.util.Scanner;

public class Sum_of_three_no {
    public static void main(String[] args) {
        int n1,n2,n3,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no : ");
        n1 = sc.nextInt();
        System.out.print("Enter second no. : ");
        n2 = sc.nextInt();
        System.out.print("Enter third no : ");
        n3 = sc.nextInt();
        sum = n1+n2+n3;
        System.out.println("Sum :  "+sum);


    }
}
