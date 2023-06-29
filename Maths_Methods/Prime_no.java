import java.util.Scanner;

//----------prime no ----------(divided by one and itself) -------------
public class Prime_no {
    public static void main(String[] args) {
        System.out.print("Enter no here = ");
        Scanner scan =  new Scanner(System.in);
        int num = scan.nextInt();
        boolean checker = false;
        //----------base case--------
        if(num == 2){
            System.out.print("Prime ");
        }     

        if(num>2){
            for(int i = 2; i < num; i++){
                if(num%i != 0){
                    checker = true;
                }else{
                    System.out.print("Not prime");
                    break;
                }
                if(checker){
                    System.out.print("Prime");
                    break;
                }
            }
        }
    }
    
}
