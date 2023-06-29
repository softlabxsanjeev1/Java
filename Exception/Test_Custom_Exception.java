package Exception;

// user defined exeption class that inherrit exception class
class My_Exception extends Exception{
    My_Exception(int age){
        if(age<18){
            try{
                throw new Exception("\nAge not valid !\n");
            } catch(Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Checkin...........");
        }
    }
}



//main method
public class Test_Custom_Exception {
    public static void main(String[] args) {
        My_Exception my = new My_Exception(12);
    }
    
}
