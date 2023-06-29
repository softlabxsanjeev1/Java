package Methods;

public class Methods {


    //--1-- Non-return type method-------
    static void myName(){
        System.out.println("Sanjeev kumar");
    }

    // --2-- Non return type with parameter
    static void myFriend(int paisa){
        System.out.println("Amount = "+paisa);
    }

    // --3-- return type method
    static int myMethod(){
        System.out.println("Hello my name is Sanjeev kumar.");
        return 0;   //-- return 10 bhee use kar sakta hai.
    }

    // --4-- return type method with parameter
    static String city(String loc){
        System.out.print("My city : ");
        return "Bahadurgarh";


    }
    public static void main(String[] args) {

        myName();  // calling 1st method

        myFriend(50); // calling 2nd method

        myMethod();  // calling 3rd method
        int rvalue = myMethod();
        System.out.println("Return value = "+rvalue); //get return value of return type method

        System.out.println(city("Xyz"));
        
    }
    
}
