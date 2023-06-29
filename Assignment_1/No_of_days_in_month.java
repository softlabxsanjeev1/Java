import java.util.Scanner;

public class No_of_days_in_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type only first three character in lower case of month name : ");
        String name = sc.nextLine();
        switch(name){
            case "jan" :System.out.println("31");
            break;
            case "feb" :System.out.println("28/29");
            break;
            case "mar" :System.out.println("31");
            break;
            case "apr" :System.out.println("30");
            break;
            case "may" :System.out.println("31");
            break;
            case "jun" :System.out.println("30");
            break;
            case "jul" :System.out.println("31");
            break;
            case "aug" :System.out.println("30");
            break;
            case "sep" :System.out.println("31");
            break;
            case "oct" :System.out.println("30");
            break;
            case "nov" :System.out.println("31");
            break;
            case "dec" :System.out.println("30");
            break;
           default:System.out.println("Please enter valid month name !");

        }


    }
    
}
