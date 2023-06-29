package Strings;

public class Reverse_of_string {
    public static void main(String[] args) {
        String myString = "Sanjeev Kumar";    // initialization
        System.out.println("String :  "+myString);
        System.out.println();

         //-print reverse of string
         System.out.print("Reverse string :  ");
         for(int i = myString.length()-1; i>=0; i--){
            System.out.print(myString.charAt(i));
         }
         System.out.println();
         System.out.println();

    }
    
}
