package cf222jf_assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Christian och Frida on 2017-02-10.
 */
public class RandomMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setHeight(400);
        primaryStage.setWidth(400);
        RandomPanel rp = new RandomPanel();
        VBox vbox = new VBox(rp);
        Pane pane = new Pane(vbox);
        Scene scene = new Scene(pane);


        primaryStage.setScene(scene);
        primaryStage.show();




    }

    public static void main(String[] args) {
        launch();
    }
}
