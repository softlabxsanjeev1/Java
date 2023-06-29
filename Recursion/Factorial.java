package Recursion;

public class Factorial {
    
    //---- method to find factorial------
    static int fact(int num){
        if(num>1){
            return num*fact(num-1);
        }else
        return 1;
    }
    

    public static void main(String[] args) {
        int num = 5;
        long factorial = fact(num);
        System.out.println(num+"! = "+factorial);
    }
}
