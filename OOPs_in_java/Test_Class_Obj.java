package OOPs_in_java;

//---class Employee
class Employee{
    static int empId = 101;     //globally declaration of data memebers
    int basic_Sal = 20000;
    int incentive = 200;
    int ph_no = 0;

    //------------member functions
    void count_Salary(){
        System.out.println("salary = "+basic_Sal+incentive);
    }
}

public class Test_Class_Obj {
    public static void main(String[] args) {
         //-create object
    Employee engineer = new Employee();

    //-----we accees it without call object bcz it is static data memeber;
    System.out.println("Employee id = "+Employee.empId);
    System.out.println("Basic salary = "+engineer.basic_Sal);

     System.out.println("Total salary = "+engineer.count_Salary());        
    }
   
}
