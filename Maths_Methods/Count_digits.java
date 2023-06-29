import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int counter = 0;
        while(num>0){
            int rem = num%10;
            counter++;
            num=num/10;
        }
        System.out.print("No of digits = "+counter);         
    }
    
}
