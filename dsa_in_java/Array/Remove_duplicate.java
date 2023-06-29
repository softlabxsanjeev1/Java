package dsa_in_java.Array;

public class Remove_duplicate {

    // function to remove duplicate  or return single element
public static int duplicateRemove(int arr[],int n){
    if(n == 0 || n == 1){
        return n;
    }
    // creating another array for storing unique elemnt
    int[] temp = new int[n];
    int j = 0;

    for(int i = 0; i < n-1; i++){
        if(arr[i] != arr[i+1]){
            temp[j++] = arr[i];
        }
    }
    
    temp[j++] = arr[n-1];

    //changing original array
    for(int i = 0; i<j; i++){
        arr[i] = temp[i];
    }
    return j;
}


    // main function
    public static void main(String[] args) {
        int a[] = {1,1,2,2,2};
        int n = a.length;
        n = duplicateRemove(a,n);
        
        for(int i = 0; i < n;i++){
            System.out.print(a[i]+" ");
        }
}

}
    
