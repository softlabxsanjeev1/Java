import java.util.Scanner;
public class Area_and_parameter {
    public static void main(String[] args) {

        //area od triangle
        //area of circle
        //parameter of circle
        int height,base,radius;

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Shapename from below : ");
        System.out.println();
        System.out.println("tiangle_area ");
        System.out.println("circle_area");
        System.out.println("circle_parameter");
        System.out.print(" -> ");

        // use switch case
        String userselection   = sc.nextLine();
        switch(userselection){
            case "triangle_area" :
            {
                System.out.print("Height :");
                height = sc.nextInt();
                System.out.print("Base :");
                base = sc.nextInt();
                double tarea = (0.5)*(base*height);
                System.out.println("Area of traingle : "+tarea);
            }
            break;

            case "circle_area" :
            {
                System.out.print("Radius :");
                radius = sc.nextInt();
                double carea = (3.14 *(radius*radius));
                System.out.println("Area of Circle : "+carea);
            }
            break;

            case "circle_parameter" :
            {
                System.out.print("Radius :");
                radius = sc.nextInt();
                double cpara = (2*3.14 *radius);
                System.out.println("Area of Circle : "+cpara);
            }
            break;

            default :System.out.println("Please enter valid input");
        }
    }
    
}
