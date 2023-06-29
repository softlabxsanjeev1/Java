package dsa_in_java.String;

import java.util.Scanner;

public class Reverse_words {
    public static void main(String[] args) {
        System.out.print("Enter string here including spaces : ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        if(s.length() == 0 || s == null){
            System.out.println(" ");
        }

        int i =0;
        int n = s.length();
        String res  = " ";

        while(i<n){
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        if(i >= n){
            break;
        }
       
        int j = i+1;
        while(j<n && s.charAt(j) != ' '){
            j++;
        }
        String w = s.substring(i, j);
        if(res.length() == 0){
            res = w;
        }else{
            res = w+" "+res;
        }
        i=j+1;
}
System.out.println(res);
}}
