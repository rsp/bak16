
public class ZadT11 {

    public static void main(String[] args) {

        int l = 20, m = 10;
        int[] t = new int[l];

        for (int i = 0; i < l; i++)
            t[i] = (int)(Math.random() * m);

        for (int i = 0; i < l; i++)
            System.out.print(t[i] + " ");
        System.out.println();

        int s, c = -1;
        for (int j = 0; j < l-1 && c != 0; j++) {
            c = 0;
            for (int i = 0; i < l-j-1; i++)
                if (t[i] > t[i+1]) {
                    s = t[i];
                    t[i] = t[i+1];
                    t[i+1] = s;
                    c++;
                }
        }

        for (int i = 0; i < l; i++)
            System.out.print(t[i] + " ");
        System.out.println();

    }

}

