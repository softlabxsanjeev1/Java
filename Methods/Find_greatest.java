package Methods;

import javax.swing.plaf.nimbus.State;

//--------------------- Method overloading (same name methods with diff. returntype/ parameters)-----------
public class Find_greatest {

    // ----- methods 1-----------
    static int greatestNumber(int a, int b){
    if(a>b){
        return a;
    }else{
       return b;
    }
}

    // ----- method 2-----------
    static int greatestNumber(int a, int b, int c) {
        if(a>b && a>c){
           return a;
        }else if(b>a && b>c){
           return b;
        }else{
           return c;
        }
    }


    public static void main(String[] args) {

       int res1 = greatestNumber(3,6);
       System.out.println("Greatest between two no."+res1);
       System.out.println();

        int res2 = greatestNumber(5, 9, 7);
        System.out.println("Greatest between three = "+res2);
    }
}
