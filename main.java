import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Admin on 19.10.2016.
 */
public class main {
    public static void main(String[] args) {
        int[][] tabel = new int[10][10];
        int count1 = 0;
        int count2 = 0;

        while (count1 < 10) {
            count2 = 0;
            while (count2 < 10) {
                tabel[count1][count2] = (count2 + count1);
                count2++;

            }
            count1++;
        }
        int count3 = 0;
        while (count3 < 10) {
            System.out.println((Arrays.toString(tabel[count3])));
            count3++;

        }
    }
}

