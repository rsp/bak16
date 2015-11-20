public class ZadM17 {

    static int[] even(int[] t) {
        int i, j;
        j = countEven(t);
        int[] r = new int[j];
        for (i=j=0; i < t.length; i++)
            if (t[i] % 2 == 0) r[j++] = t[i];
        return r;
    }

    static int countEven(int[] t) {
        int j = 0;
        for (int i:t) j+=1-i%2;
        return j;
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
