package FooriHarjutus;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Siim Kallari on 9/20/15.
 */
public class Ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor("üleval", primaryStage);
        Foor foor2 = new Foor("all", primaryStage);
        Foor foor3 = new Foor("paremal", primaryStage);
        Foor foor4 = new Foor("vasakul", primaryStage);

        // Algseis tuleb luua ja sealt saaks edasi liikuda

        algSeis(foor1, foor2, foor3, foor4);

         for (int i = 0; i < 3; i++) {
             rohelisestPunaseks(foor1);
             rohelisestPunaseks(foor2);
             foor3.paus(5.5 + i * 2.5);
             foor4.paus(5.5 + i * 2.5);
             punasestRoheliseks(foor3);
             punasestRoheliseks(foor4);
             foor3.paus(2);
             foor4.paus(2);
             rohelisestPunaseks(foor3);
             rohelisestPunaseks(foor4);
             foor1.paus(9.5 + i / 2);
             foor2.paus(9.5 + i / 2);
             punasestRoheliseks(foor1);
             punasestRoheliseks(foor2);
             foor1.paus(1.25);
             foor2.paus(1.25);
         }
    }

    private void rohelisestPunaseks(Foor foor) {
        foor.roheline();
        foor.paus(0.5);
        foor.roheline();
        foor.paus(0.5);
        foor.roheline();
        foor.paus(0.5);
        foor.roheline();
        foor.paus(0.5);
        foor.roheline();
        foor.paus(0.5);
        foor.roheline();
        foor.paus(0.5);
        foor.roheline();
        foor.kollane();
        foor.paus(1);
        foor.kollane();
        foor.punane();
    }

    private void punasestRoheliseks(Foor foor) {
        foor.kollane();
        foor.paus(1);
        foor.punane();
        foor.kollane();
        foor.roheline();
    }

    private void algSeis(Foor foor1, Foor foor2, Foor foor3, Foor foor4) {
        foor1.roheline();
        foor2.roheline();
        foor3.punane();
        foor4.punane();
    }
}
