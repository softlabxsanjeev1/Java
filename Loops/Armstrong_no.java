package Loops;

import java.util.Scanner;

public class Armstrong_no {
    public static void main(String[] args) {
        System.out.print("Enter no = ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cpy = num;
        
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + (rem*rem*rem);
            num=num/10;
        }
        if(sum == cpy){
            System.out.println("Armstrong NUmber.");
        }else{
            System.out.println("Not an armstrong number.");
        }
        
    }
}


