package Methods;

public class Prime_no_1_100 {

    //----------print method----
    static void printPrimeNumber(int low,int high){
        while(low<=high){
            boolean checker = true;
            for(int i =2; i < low-1; i++){
                // condition for not prime
                if(low%i==0){
                 checker = false;
                }
                if(checker && low!=0 && low!=1){
                    System.out.println(low);
                    low++;
                }
            }
        }
    }


    public static void main(String[] args) {
        printPrimeNumber(0,10);
    }
    
}
