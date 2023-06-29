package OOPs_in_java;
//-------Abstract classes

public abstract class Bank {
    String name;
    
    abstract void readdata();
    abstract void writedata();
}

//-Admin class that use the member fun of abstract class bcz abstract class ka obj nahi banta
class Admin extends Bank{
    void readdata(){

    }
    void writedata(){

    }
}


//-marketing class extend member function of bank class
class Marketing extends Bank{
    void readdata(){

    }

    void writedata(){

    }
}

