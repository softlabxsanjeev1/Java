package Exception;

import java.util.Scanner;

 //   -------------class 2   
 

//  -------class 1
public class Throws_Demo {

    //----------------method declaration
    void calc(){
        System.out.println(6/0);
    }


    public static void main(String[] args) {
        Throws_Demo td = new Throws_Demo();
        // Calculator cl = new Calculator();
        try{
             td.calc();  
        }catch(Exception e){
            System.out.println("\nDivide by zero.\n");
        }
    }
    
}

// public class Calculator {

//     void add(int a, int b){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter divident here = ");
//         int num_1  = sc.nextInt();
//         System.out.print("Enter divisor here = ");
//         int num_2  = sc.nextInt();
//         int quot = num_1/num_2;
//         System.out.println("Answer = "+quot);
//     }

    