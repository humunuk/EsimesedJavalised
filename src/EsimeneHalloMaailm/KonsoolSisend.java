package EsimeneHalloMaailm;

/**
 * Created by Siim Kallari on 13/9/2015.
 */

import java.util.Scanner;

public class KonsoolSisend {
    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);

        System.out.println("Mis on sinu nimi?");
        String nimi = klaviatuur.nextLine(); // Line salvestab terve rea kui on tühikud vahel
        System.out.println("Kui vana sa oled?");
        int vanus = klaviatuur.nextInt();
        System.out.println("Kui palju palka sa saad?");
        Double palk = klaviatuur.nextDouble();

        System.out.println("Tere, " + nimi);
        System.out.println("Sa oled " + vanus + " aastane");
        System.out.println("Sa saad palka: " + palk);
    }
}
