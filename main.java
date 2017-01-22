import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Admin on 22.01.2017.
 */
public class main {
    public static void main(String[] args){
        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7};

        // loeb kõik arvud, mis ei ole 3, uude listi
        ArrayList<Integer> kolmedväljas = new ArrayList();

        for (int i = 0; i <naide.length ; i++) {
            if (naide[i] != 3){
                kolmedväljas.add(naide[i]);
            }
        }
        //System.out.println("Vastus: " + kolmedväljas);


        ArrayList<Integer> mood = new ArrayList<>();

        //Näitab, et mitu korda igat numbrit jadas esineb.
        for (int i: kolmedväljas){
            int sagedus = Collections.frequency(kolmedväljas, i);
            //System.out.println(sagedus);
            //System.out.println(i);

            int frequency = 0;
            if (sagedus == frequency){
                mood.add(i);
            }

            if (sagedus > frequency){
                mood.clear();
                mood.add(i);

                frequency = sagedus;
            }
        }
        System.out.println(mood);




    }
}
