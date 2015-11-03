
public class ZadT12 {

    public static void main(String[] args) {

        int l = 20, m = 10;
        int[] t = new int[l];

        for (int i = 0; i < l; i++)
            t[i] = (int)(Math.random() * m);

        for (int i = 0; i < l; i++)
            System.out.print(t[i] + " ");
        System.out.println();

        for (int i = l-1; i >= 0; i--)
            if (t[i] % 3 == 0) {
                for (int j = i; j < l; j++)
                    t[j] = j < l-1 ? t[j+1] : 1;
            }

        for (int i = 0; i < l; i++)
            System.out.print(t[i] + " ");

    }

}

