
public class ZadT06 {

    public static void main(String[] args) {

        int l = 20;
        int[] t = new int[l];
        int[] t2;
        
        for (int i = 0; i < l; i++)
            t[i] = (int)(Math.random() * 10);

        for (int i = 0; i < l; i++)
            System.out.println(t[i]);

        System.out.println("nieparzyste:");

        int n = 0;
        for (int i = 0; i < l; i++) n += t[i] % 2;
        t2 = new int[n];

        int j = 0;
        for (int i = 0; i < l; i++)
            if (t[i] % 2 != 0) t2[j++] = t[i];

        for (int i = 0; i < n; i++)
            System.out.println(t2[i]);
        
    }

}

