
public class ZadT02 {

    public static void main(String[] args) {

        int[] t = new int[20];

        for (int i = 0; i < t.length; i++)
            t[i] = (int)(Math.random() * 10);

        for (int i = 0; i < t.length; i++)
            System.out.print(t[i] + " ");
        System.out.println();

        int m = 0;
        for (int i = 0; i < t.length; i++)
            m = t[m] >= t[i] ? m : i;
            
        System.out.println("max: t["+m+"] = "+t[m]);

    }

}

