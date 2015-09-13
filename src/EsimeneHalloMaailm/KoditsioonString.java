package EsimeneHalloMaailm;

/**
 * Created by Siim Kallari on 13/9/2015.
 */
public class KoditsioonString {
    public static void main(String[] args) {
        String sihtpunkt = "Tallinn";

        if (sihtpunkt.equals("Tartu")) {
            System.out.println("Keera paremale");
        } else if (sihtpunkt.equals("Viljandi")) {
            System.out.println("Keera vasakule");
        } else {
            System.out.println("Sõida otse");
        }
    }
}
