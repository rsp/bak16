
public class ZadT05 {

    public static void main(String[] args) {

        int l = 20;
        int[] t = new int[l];
        int[] t2 = new int[l];
        
        for (int i = 0; i < l; i++)
            t[i] = (int)(Math.random() * 10);

        for (int i = 0; i < l; i++)
            System.out.println(t[i]);

        System.out.println("odwrotnie:");

        for (int i = 0; i < l; i++)
            t2[l-i-1] = t[i];

        for (int i = 0; i < l; i++)
            System.out.println(t2[i]);
        
    }

}

