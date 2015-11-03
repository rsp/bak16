
public class ZadT10 {

    public static void main(String[] args) {

        int l = 20, m = 10;
        int[] t = new int[l];

        for (int i = 0; i < l; i++)
            t[i] = (int)(Math.random() * m);

        for (int i = 0; i < l; i++)
            System.out.println(t[i]);

        int[] w = new int[m];
        for (int i = 0; i < m; i++) w[i] = 0;
        for (int i = 0; i < l; i++) w[t[i]]++;
        
        for (int i = 0; i < m; i++)
            if (w[i] > 0) System.out.println(i + ": " + w[i]);

    }

}

