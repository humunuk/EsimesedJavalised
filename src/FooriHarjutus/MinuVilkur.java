package FooriHarjutus;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by Siim Kallari 13/9/2015.
 */

public class MinuVilkur extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Foor foor = new Foor();

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.5),
                event -> foor.kollane()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }
}
