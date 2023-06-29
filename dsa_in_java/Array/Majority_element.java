package dsa_in_java.Array;

public class Majority_element{
    //---method to find majority element
    public static int majorityElement(int num[]){
        int maj = num[0];
        int count = 1;
        for(int i = 1; i<num.length;i++){
            if(maj == num[i]){
                count++;
            }else if(count==0){
                maj = num[i];
                count = 1;
            }else{
                count--;
            }
        }
        return maj;
    }

    public static void main(String[] args) {
        int num[] = {1,2,4,4,4,5,5,6,6,6,6,6};
        int num2 = majorityElement(num);
        System.out.print("Majority element in given array : "+num2);

    }
}