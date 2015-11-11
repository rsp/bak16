public class ZadM16 {

    public static void main(String[] args) {

        int[] t = {0,1,2,3,4,5,6,7,8,9};

        printInts(t);

        int[] p = filter(t);

        printInts(p);

    }

    static int[] filter(int[] t) {
        int i, j;
        int[] p = new int[t.length];
        for (i=j=0; i < t.length; i++)
            if (t[i] % 2 == 0) p[j++] = t[i];
        int[] r = new int[j];
        for (i = 0; i < j; i++) 
            r[i] = p[i];
        return r;
    }
        
    static void printInts(int[] t) {
        for (int i = 0; i < t.length; i++)
            System.out.format("%3d", t[i]);
        System.out.println();
    }

}
