package cf222jf_assignment2;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.scene.*;
import javafx.application.*;

import java.beans.EventHandler;
import java.util.*;
import javafx.scene.shape.*;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import java.util.Random;

/**
 * Created by Christian och Frida on 2017-02-10.
 */
public class RandomPanel extends BorderPane {
    String randomNumber;
    Button button = new Button("Random number from 1-100");
    final Text text = new Text(randomNumber);
    VBox vbox1 = new VBox(button);
    VBox vbox2 = new VBox(text);
    Pane pane1 = new Pane(vbox1);
    Pane pane2 = new Pane(vbox2);
    Random rand = new Random();




    public RandomPanel() {
        super();
        button.setOnAction(randomize -> {
            randomNumber = ""+rand.nextInt(101);
            text.setText(randomNumber);
        });
        pane1.setMinSize(100,100);
        pane2.setMinSize(100,100);
        this.setTop(pane1);
        this.setBottom(pane2);


    }
}