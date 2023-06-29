import java.util.Scanner;

public class AddTwoParagraphs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first paragraph = ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second paragraph = ");
        String str2 = scanner .nextLine();

        System.out.println(str1+"\n"+str2);   /*--- combine paragraph --- */

    }
}