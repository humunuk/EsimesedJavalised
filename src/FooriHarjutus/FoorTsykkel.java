package FooriHarjutus;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by Siim Kallari on 9/20/15.
 */

public class FoorTsykkel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Foor foor = new Foor();

        Timeline punane = new Timeline(new KeyFrame(Duration.seconds(0.0), event -> foor.punane()),
                new KeyFrame(Duration.seconds(4.0), event -> foor.punane()));
        Timeline kollane = new Timeline(new KeyFrame(Duration.seconds(0.0), event -> foor.kollane()),
                new KeyFrame(Duration.seconds(1.0), event -> foor.kollane()));
        Timeline roheline = new Timeline(new KeyFrame(Duration.seconds(0.0), event -> foor.roheline()),
                new KeyFrame(Duration.seconds(4.0), event -> foor.roheline()));
        Timeline rohelineback = new Timeline(new KeyFrame(Duration.seconds(1.0), event -> foor.roheline()),
                new KeyFrame(Duration.seconds(0.5), event -> foor.roheline()));
        rohelineback.setCycleCount(2);
        Timeline kollaneback = new Timeline(new KeyFrame(Duration.seconds(1.0), event -> foor.kollane()),
                new KeyFrame(Duration.seconds(0.5), event -> foor.kollane()));
        kollaneback.setCycleCount(2);


        SequentialTransition tsykkel = new SequentialTransition(punane, kollane, roheline, rohelineback, kollaneback);
        tsykkel.setCycleCount(Animation.INDEFINITE);
        tsykkel.play();

    }

//    private void tsykkel() {
//
//        // Foori lihtne tsükkel
//        foor.punane();
//        foor.paus(2.0);
//        foor.punane();
//        foor.kollane();
//        foor.paus(0.5);
//        foor.kollane();
//        foor.paus(0.5);
//        foor.kollane();
//        foor.paus(0.5);
//        foor.kollane();
//        foor.paus(0.5);
//        foor.roheline();
//        foor.paus(5.0);
//        foor.roheline();
//        foor.paus(0.5);
//        foor.roheline();
//        foor.paus(0.5);
//        foor.roheline();
//        foor.paus(0.5);
//        foor.kollane();
//        foor.paus(0.5);
//        foor.kollane();
//        foor.paus(0.5);
//        foor.kollane();
//        foor.paus(0.5);
//        foor.kollane();
//        foor.punane();
//
//    }


}
