package dsa_in_java.Array;

public class Valid_mountain_array {
    
    // check method
    public static boolean checkValid(int arr[],int size){
        if(arr.length < 3)return false;                                   //use 2 pointer solution

        int start = 0;
        int end = arr.length -1;
        while(start < end){
            if(arr[start+1]>arr[start]){
                start++;
            }else if(arr[end-1]>arr[end]){
                end--;
            }else{
                break;
            }
        }
        return start != 0 && end != arr.length-1 && start == end;
    }
    

    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,5,3,2,0};
        int size1 = arr.length; 
        boolean num = checkValid(arr, size1);
        if(num == true){
            System.out.println("Valid mountain array !");
        }else{
            System.out.println("Not a valid mountain array !");
        }
    }
}
