package dsa_in_java.String;

import java.util.Scanner;

public class Convert_string_into_char { 
    
    //mthod to convert string into characters
    public static char convertString(String str){
        int strlen = str.length();
        char arr[] = new char[strlen];

        // loop to break str into char
        for(int i = 0; i< strlen; i++){
            arr[i] = str.charAt(i);
        }

        // print char array
        for( char value : arr){
            System.out.println(value+",");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr your name here : ");
        String str = scan.nextLine();
        System.out.println("String : "+str);

        // char arr[] = new char[str.length()];

       char arr1 = convertString(str);
        System.out.println("Converted string : "+arr1);

        


        
    }
}
