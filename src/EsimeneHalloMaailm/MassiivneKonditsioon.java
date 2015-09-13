package EsimeneHalloMaailm;

/**
 * Created by Siim Kallari on 13/9/2015.
 */

import java.util.Arrays;

public class MassiivneKonditsioon {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 4, 3};

        if (Arrays.equals(a,b)) {
            System.out.println("Need massiivid on tõesed");
        } else {
            System.out.println("Nope, nope, nope, nope");
        }
    }
}
