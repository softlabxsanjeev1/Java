package Loops;
//----Skip that lines where i%2 == 0;
public class Skip_even_no {
    public static void main(String[] args) {
        System.out.println("List of odd numbers ");
        System.out.println();
        for(int i = 0; i <= 20; i++){
            if( i%2 == 0)                  // ------ condition terminates here ------
            continue;
            System.out.println(i);
        }
        System.out.println();
    }
}
