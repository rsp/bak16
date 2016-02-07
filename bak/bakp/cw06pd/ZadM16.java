public class ZadM16 {

    static int[] even(int[] t) {
        return java.util.stream.IntStream.of(t).filter(i->i%2==0).toArray();
    }

    static void printInts(int[] t) {
        for (int i:t)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] t = {0,1,2,3,4,5,6,7,8,9};
        printInts(t);
        int[] p = even(t);
        printInts(p);

    }

}
