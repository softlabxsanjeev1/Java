import java.util.Scanner;
public class FInd_CGPA {
    public static void main(String[] args) {
        int maths,hindi,eng;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter markes of students out of 10");

        System.out.print("Maths : ");
        maths = sc.nextInt();       
        System.out.print("Hindi : ");        
        hindi = sc.nextInt();
        System.out.print("English : ");
        eng = sc.nextInt();       

        double cgpa = ((((maths+hindi+eng)*3)/9.5)/10);
        System.out.println("CGPA : "+String.format("%.1f",cgpa));        
}
}
    
