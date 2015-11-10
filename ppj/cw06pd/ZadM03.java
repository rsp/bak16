public class ZadM03 {

    public static void main(String[] args) {

        int[] t1 = {1,2,3},
              t2 = {10,-20,30,-40,50},
              t3 = {5,50,500};
        
        printInts(t1);
        printInts(t2);
        printInts(t3);

    }

    static void printInts(int[] t) {
        for (int i = 0; i < t.length; i++)
            System.out.format("%4d", t[i]);
        System.out.println();
    }

}
