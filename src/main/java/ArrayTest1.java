import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA. User: lo Date: 8/29/13 Time: 11:50 AM To change this template use
 * File | Settings | File Templates.
 */
public class ArrayTest1 {
    public static void main(String[] argc) {
        int[][] re = getArray(5, 6);
    }
    private static int[][] getArray(final int c,final int l) {
        int[][] re = new int[c][l];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
                re[i][j] = (i+1)*(j+1);
                System.out.printf("%d\t", re[i][j]);
            }
            System.out.println();
        }
        return re;
    }
}
