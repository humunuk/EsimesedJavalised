package EsimeneHalloMaailm;

/**
 * Created by Siim Kallari on 13/9/2015.
 */
public class MassiivneMuutuja {
    public static void main(String[] args) {
        int[] minuRaha = {150, 250, 10, 25, 30};
        minuRaha[2] = 25;

        int count = 0;
        while (count < minuRaha.length) {
            System.out.println(minuRaha[count]);
            count++;
        }
    }
}
