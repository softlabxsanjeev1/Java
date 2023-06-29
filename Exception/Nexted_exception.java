package Exception;

//multiple try
//multiple catch
//multiple finally

public class Nexted_exception {
    public static void main(String[] args) {
        try{
            System.out.println(6/0);
        }catch(NullPointerException e){
            System.out.println(e);                            // catch 1
        }catch(ArithmeticException a){
            System.out.println("Exception 1");
        }finally{
            System.out.println("Execution complete");
        }
    }
}
