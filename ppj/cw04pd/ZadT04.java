
import java.util.Arrays;

public class ZadT04 {

    public static void main(String[] args) {

        int[] t = new int[20];
        int l = t.length;

        for (int i = 0; i < l; i++)
            t[i] = (int)(Math.random() * 10);

        Arrays.sort(t);

        for (int i = 0; i < l; i++)
            System.out.print(t[i] + " ");

        double s = 0;
        for (int i = 0; i < l; s += t[i++]);
        s /= l;

        double m = (double)(t[(l+1)/2 - 1] + t[(l+1)/2 - l%2]) / 2;
        
        System.out.println("\nmediana: " + m + "\nsrednia: " + s);

    }

}

