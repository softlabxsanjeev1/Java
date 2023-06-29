package Exception;
public class Throw_Demo {

    // method use thro and throws
    static void calcAge(int age) throws Exception{
        if(age < 18){
            throw new Exception(" \nAge not valid\n");
        }else{
            System.out.println("Checkin");
        }
    }


    //main method
    public static void main(String[] args) {
        int age = 12;
        try{
            Throw_Demo.calcAge(age);
        }catch(Exception e){
           e.printStackTrace();
           System.out.println("\n");
        }
    }
    
}
