package EsimeneHalloMaailm;

/**
 * Created by root on 9/13/15.
 */
public class Konditsioon {
    public static void main(String[] args) {
        int kiirus1 = 50;
        int kiirus2 = 90;
        int kiirus3 = 110;

        if (kiirus2 > 90) {
            System.out.println("Trahv");
        } else if (kiirus2 == 90) {
            System.out.println("Napikas");
        } else {
            System.out.println("Legaalne");
        }
    }
}
