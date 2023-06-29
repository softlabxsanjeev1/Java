package OOPs_in_java;

                       //---------------Inherritance------------------

//-------------------super class
public class Dadaji {
    String name;
    String surname = "Yadav";    
}

//----sub class 1
class Father extends Dadaji{
    String name = "Balkrishan";
}

//----------sub class 2 inherrits property of all above classes 
class Me extends Father{
    String name = "Sanjeev";
}


class Run {
    public static void main(String[] args) {
        Me m = new Me();
        System.out.print("Full name : "+m.name+" "+m.surname);
    }
}
