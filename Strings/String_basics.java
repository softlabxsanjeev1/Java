package Strings;

public class String_basics {
    public static void main(String[] args) {
        String myName = "Sanjeev Kumar";        // string initialization
        System.out.print(myName);
        System.out.println();


        //------second method
        System.out.println("------------------");
        System.out.println(" 0   ->  "+myName.charAt(0));   //------- print char of string
        System.out.println();


        //----------use loop to print all char
        System.out.println("-----------------");
        System.out.println("Index"+"      "+"char");
        for(int i = 0; i<myName.length(); i++){
            System.out.println("  "+i+"   ->    "+myName.charAt(i));
        }

    }
}
