/**
 * Created by Admin on 21.01.2017.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13, -10};

        int negativeCount1 = 0;
        int positiveCount1 = 0;
        int negativeCount2 = 0;
        int positiveCount2 = 0;

        for (int i = 0; i < kraadid1.length; i++) {
            if (kraadid1[i] < 0){
                negativeCount1++;
            }
            if (kraadid1[i] >= 0){
                positiveCount1++;
            }

        }


        System.out.println("Negatiivsed 1: " + negativeCount1);
        System.out.println("Positiivsed 1: " + positiveCount1);

        for (int i = 0; i <kraadid2.length ; i++) {
            if (kraadid2[i] < 0){
                negativeCount2++;
            }
            if (kraadid2[i] >= 0){
                positiveCount2++;
            }

        }
        System.out.println("Negatiivsed 2: " + negativeCount2);
        System.out.println("Positiivsed 2: " + positiveCount2);

        //Arvuta, et mitu positiivset temperatuuri on massiivis rohkem kui negatiivset.

        //kraadid1
        int positiivseidRohkem1 = 0;
        if (positiveCount1 > negativeCount1){
            positiivseidRohkem1 = positiveCount1 - negativeCount1;
        }
        else{
            positiivseidRohkem1 = positiveCount1 - negativeCount1;
            if (positiivseidRohkem1 < 0){
                positiivseidRohkem1 = 0;

            }
        }
        System.out.println("Positiivseid rohkem massiivis kraadid1: " + positiivseidRohkem1);

        //kraadid2
        int positiivseidRohkem2 = 0;
        if (positiveCount2 > negativeCount2){
            positiivseidRohkem2 = positiveCount2 - negativeCount2;
        }
        else{
            positiivseidRohkem2 = positiveCount2 - negativeCount1;
            if (positiivseidRohkem2 < 0){
                positiivseidRohkem2 = 0;
            }
        }
        System.out.println("Positiivseid rohkem massiivis kraadid2: " + positiivseidRohkem2);

    }
}

