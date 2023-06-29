package OOPs_in_java;


public class Employe {
    private int eId= 2;
    private String name; 
    private int ph_no;
    private int basic_Sal = 20000;
    private int incentive = 200;


    //--------constructors
    Employe(String empName, int phNumber){
        name = empName;
        ph_no = phNumber;
    }


    //getter used for security purpose or give limited access
    int getPh(){
        return ph_no;
    }

    String getName(){
        return name;
    }

    int get_Bs_salary(){
        return basic_Sal;
    }


    //setter used for security purpose
    void setname(String name){
        this.name = name;  
    }

    void setPhone(int phone){
        ph_no = phone;
    }

}


