import java.util.Scanner;
public class Circle_area {
    public static void main(String[] args) {
        int radius;
        System.out.print("Enter radius of circle : ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        int area = (int)(3.14)*(radius*radius);
        System.out.println("Area of cirlce : "+area);
    }    
}
