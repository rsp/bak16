public class ZadM03 {

    public static void main(String[] args) {

        int[] t1 = {1,2,3,4,5,6,7,8},
              t2 = {10,20,30,40,50,60,70,80},
              t3 = {100,200,300,400,500,600,700};

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
