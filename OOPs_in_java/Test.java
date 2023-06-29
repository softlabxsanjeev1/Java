package OOPs_in_java;

public class Test {
    public static void main(String[] args) {
        // obj 1
        Employe enginer = new Employe("Sanjeev", 70); 
        // obj 2
        Employe enginer2 = new Employe(null, 0);

        //value update by using setter function
        enginer2.setPhone(80);
        enginer2.setname("Sanjeev Kumar");
        
        // value get by using getter function
        System.out.println("------Value get by obj 1------");
        System.out.println("Phone no = "+enginer.getPh());
        System.out.println("Name = "+enginer.getName());
        System.out.println("Basic salary = "+enginer.get_Bs_salary());
        System.out.println();
        

        // value get by using object 2
        System.out.println("------- value get by obj 2--------");
        System.out.println("Name : "+enginer2.getName());
        System.out.println("Phone no : "+enginer2.getPh());
    }
}
