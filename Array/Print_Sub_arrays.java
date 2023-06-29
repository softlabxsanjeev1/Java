package Array;

public class Print_Sub_arrays {
    public static void main(String[] args) {
        char [] ch = {'a','b','c','d','e','f'};

        for(int i = 0; i < ch.length; i++){
            for(int j = i; j < ch.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(ch[k]+" ");
                }
                System.out.println();
            }
            System.out.println("------------------");
        }
    }
}
