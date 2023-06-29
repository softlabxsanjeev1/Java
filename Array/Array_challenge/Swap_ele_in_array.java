package Array.Array_challenge;

public class Swap_ele_in_array {
    public static void main(String[] args) {
        int array[] = {2,5,7,8,9,10,86};            // ----size of array = 6

        System.out.println("Array before swapping --------");
        for(int i = 0; i <= 6; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println();

        //--swapping first element with last 
        int temp = array[0];
        array[0] = array[6];
        array[6] = temp;
        
        System.out.println("Array after swapping ----------");
        for(int i = 0; i <= 6; i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
