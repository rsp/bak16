
public class ZadT07 {

    public static void main(String[] args) {

        int l = 20;
        int[] t1 = new int[l], t2 = new int[l];
        
        for (int i = 0; i < l; i++) {
            t1[i] = (int)(Math.random() * 10);
            t2[i] = (int)(Math.random() * 10);
        }

        for (int i = 0; i < l; i++)
            System.out.println(t1[i] * t2[i]);

    }

}

