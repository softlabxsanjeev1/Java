package Loops.Patterns;

import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

//--------------------Hollow square---------
public class Pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
       for(int row = 1; row < size; row++){
            for(int col = 1; col < size; col++){

                //-----------print stars

                if(row==1 || row==size-1  || col==1 || col==size-1){
                    System.out.print(" * ");                     
                }else{
                System.out.print("   ");    //--------------3 space
                }
            }
            System.out.println();
        }
    }
    
}
