package Array.Array_challenge;

public class Reverse_an_array {
    public static void main(String[] args) {

        int arr[] = { 1, 5, 6, 8, 45, 60, 70};           // --array initialization

        //-Array before reverse
        System.out.print("Before reverse :  ");
        for (int value : arr) {
            System.out.print(+value+" ");
        }
        System.out.println();

        //-------------Logic to reverse an array
        int first = 0; 
        int last = arr.length-1;
        while(last > first){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        // print array after reverse
        System.out.print("After reverse  :  ");
        for (int values : arr) {
            System.out.print(values+" ");
        }
    }
}
