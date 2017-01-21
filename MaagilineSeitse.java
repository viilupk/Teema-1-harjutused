import java.util.stream.IntStream;

/**
 * Created by Admin on 21.01.2017.
 */

// Korruta kõik seistmed kahega ja leia arvude keskmine

public class MaagilineSeitse {
    public static void  main (String[] args){
        int[]naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        int sum = 0;
        int average = 0;
        int count = 0;
        int seitsmetesumma = 0;
        int juurdeLiita = 0;


        for (int i = 0; i <naide.length ; i++) {
            if (naide[i] == 7){
                count++;
                seitsmetesumma = count*7;
                juurdeLiita = 2*seitsmetesumma - seitsmetesumma;
            }
        }
        System.out.println(count);
        System.out.println(seitsmetesumma);
        int summa = IntStream.of(naide).sum();
        summa = summa + juurdeLiita;

        System.out.println(summa);
        average = summa / (naide.length);
        System.out.println("Keksmine on: " + average);



    }

}
