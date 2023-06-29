package Exception;

public class Nested_try {
    public static void main(String[] args) {
        try{
            try{
                System.out.println(6/0);
            }finally{
                System.out.println("Finally \n");
            }
        }catch(Exception e){
            System.out.println("Catch---------\n");
                                                 //------------try inside catch
            try{
                System.out.println("Try inside catch-");
                System.out.println();
            }catch(Exception ex){
                System.out.println("Catch inside catch");
            }
        }
    }
}
