package EsimeneHalloMaailm;

/**
 * Created by Siim Kallari on 13/9/2015.
 */
public class Tsykkel {

    public static void main(String[] args) {

        int[] kiirused = {90, 10, 200, 110, 50};

        int l = 0;
        while (l < kiirused.length) {
            if (kiirused[l] > 90) {
                System.out.println("Trahv");
            } else {
                System.out.println("Tulemused analüüsitud");
            }
            l = l + 1;
        }
    }
}
