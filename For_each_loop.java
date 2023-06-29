public class For_each_loop {
    public static void main(String[] args) {
        int [] myarray = {1,2,3,4,5,6};
        for(int i : myarray){
            System.out.println(i);
        }
        
        System.out.println();
        // print characters

        char [] mychararray = {'A','B','c','D','E'};
        for(char j : mychararray){
            System.out.println(j);
        }

        System.out.println();

        // print ascii code
        char [] array = {'A','B','c','D','E'};
        for(int k : array){
            System.out.println(k);
        }

    }
}
