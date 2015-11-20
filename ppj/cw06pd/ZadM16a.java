public class ZadM16a {

    static int[] even(int[] t) {
        int j = 0;
        for (int i:t) j += 1-i%2;
        int[] r = new int[j];
        j = 0;
        for (int i:t) if (i%2==0) r[j++] = i;
        return r;
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
