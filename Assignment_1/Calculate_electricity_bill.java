import java.util.Scanner;

public class Calculate_electricity_bill {
    public static void main(String[] args) {
       int unit,amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter reading/unit : ");
        unit = sc.nextInt();
        if(unit == 0){
            System.out.println("Zero amount");
        }else if(unit >=1 && unit<100){
            amount = unit*6;
            System.out.println("Amount : "+amount);
        }else if(unit >=100 && unit<200){
            amount = unit*8;
            System.out.println("Amount : "+amount);
        }else if(unit >=200 && unit<300){
            amount = unit*10;
            System.out.println("Amount : "+amount);
        }
    }
}
