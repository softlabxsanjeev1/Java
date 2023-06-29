package Exception;

public class Exception_handling {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        //---exception handling
        try{
             System.out.println(6/0);
        }catch(Exception e){
            System.out.println("Not applicable (Exception)");
        }finally{
            System.out.println("Use to clean memory or close oppened file.(finally)");
        }

        System.out.println(4);
        System.out.println(5);       

    }
}
