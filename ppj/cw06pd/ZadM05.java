public class ZadM05 {

    public static void main(String[] args) {

        System.out.println();

        int[][] tt = {{1,1,1,1,1,1,1,1},
                      {100,0,0,0,50,0,0,0},
                      {100,100,100,100,100,500,500}};

        for (int i = 0; i < tt.length; i++) {
            printInts(tt[i]);
            System.out.println("   suma = " + suma(tt[i])); 
        }

    }

    static int suma(int[] t) {
        int s = 0;
        for (int i = 0; i < t.length; i++) s+= t[i];
        return s;
    }

    static void printInts(int[] t) {
        for (int i = 0; i < t.length; i++)
            System.out.format("%4d", t[i]);
    }

}
