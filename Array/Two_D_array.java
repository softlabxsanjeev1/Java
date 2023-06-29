package Array;

public class Two_D_array {
    public static void main(String[] args) {

        // --2-D array initialization
        int my2dArray1[][] = {
                { 3, 4 },
                { 7, 8 }
        };
        
        System.out.println(my2dArray1[1][0]); // print arry element

        // arry to take user input

        int myarr1[][] = new int[2][2];
        myarr1[0][0] = 2;
        myarr1[0][1] = 4;
        myarr1[1][0] = 8;
        System.out.println(myarr1[0][1]);

    }
}
