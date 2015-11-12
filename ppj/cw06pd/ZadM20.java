public class ZadM20 {

    static void printInts(int[] t) {
        for (int i = 0; i < t.length; i++)
            System.out.print(t[i] + " ");
        System.out.println();
    }

    static void bubble(int[] t, int o) {

        int s, c = -1, l = t.length;
        for (int j = 0; j < l-1 && c != 0; j++) {
            c = 0;
            for (int i = 0; i < l-j-1; i++)
                if (o*(t[i]-t[i+1]) > 0) {
                    s = t[i];
                    t[i] = t[i+1];
                    t[i+1] = s;
                    c++;
                }
        }
    }

    static void eosort(int[] t) {

        int i, ei, oi, l = t.length;

        printInts(t);

        for (i=ei=0; i < l; i++)
            if (t[i] % 2 == 0) ei++;

        int[] r = new int[l], e = new int[ei], o = new int[l-ei];

        for (i=ei=oi=0; i < l; i++) {
            if (t[i] % 2 == 0) e[ei++] = t[i];
            else o[oi++] = t[i];
        }

        bubble(e, 1);
        bubble(o,-1);

        for (i=ei=oi=0; i < l; i++)
            r[i] = t[i] % 2 == 0 ? e[ei++] : o[oi++];

        printInts(r);
        System.out.println();

    }

    public static void main(String[] args) {

        int[][] t = {{0,1,2,3,4,5,6,7,8,9},
                     {8,2,0,6,4,3,5,9,1,7},
                     {9,7,1,2,8,6,5,3,4,0}};

        for (int i = 0; i < t.length; i++)
            eosort(t[i]);

    }

}
