import java.util.ArrayList;

/**
 * Created by Admin on 22.01.2017.
 */
public class PikadSoned {
    public static void main(String[] args) {
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"};

        int sum = 0;

        for (int i = 0; i <naide.length ; i++) {

            naide[i].length();
            //System.out.println(naide[i]);
            //System.out.println(naide[i].length());

            sum = sum + naide[i].length();
        }
        System.out.println(sum);

        int keskmine = 0;
        keskmine = sum/naide.length;
        System.out.println(keskmine);

        //leia, et mitu sõna on pikemad kui keskmine (Sõna keskmine pikkus on 6)
        int tulemus = 0;
        for (int i = 0; i <naide.length ; i++) {
            if (naide[i].length()>keskmine){
                tulemus++;
            }

        }
        System.out.println(tulemus);

    }
}