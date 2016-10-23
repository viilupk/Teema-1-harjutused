import java.util.Scanner;

/**
 * Created by Admin on 23.10.2016.
 */
public class main {
    public static void main(String[] args) {
            Scanner klaviatuur = new Scanner(System.in);

            System.out.println("Sisesta arv, mida soovid kuupi tõsta?");
            int sisestatudArv = klaviatuur.nextInt();

            int aste = 3;
        double tulemus = Math.pow(sisestatudArv, aste);
        System.out.println(tulemus);
        }

    }

