package cf222jf_assignment2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Christian och Frida on 2017-02-10.
 */
public class ColorDisplay extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setHeight(400);
        primaryStage.setWidth(400);
        Text text1 = new Text("Color Choice");
        Text text2 = new Text("Red");
        Text text3 = new Text("Green");
        Text text4 = new Text("Blue");
        Button button = new Button("Display Color");
        GridPane gridpane = new GridPane();                 //the gridpane with the text fields to input the color.
        gridpane.add(text2, 0,0);
        gridpane.add(text3,1,0);
        gridpane.add(text4,2,0);
        TextField inputRed = new TextField("0");
        TextField inputGreen = new TextField("0");
        TextField inputBlue = new TextField("0");
        gridpane.add(inputRed , 0 ,1);
        gridpane.add(inputGreen , 1 , 1);
        gridpane.add(inputBlue,2,1);
        Color color = new Color(1,1,1,1);       // Starting color.
        VBox titlebox = new VBox(text1);
        titlebox.setAlignment(Pos.CENTER);
        Pane titlepane = new Pane(titlebox);
        titlepane.setBackground(new Background(new BackgroundFill(color, null,null)));
        titlepane.setMinSize(375,50);

        VBox box = new VBox();              // the Box for the scene.
        text1.setFont(new Font(40));
        text2.setFont(new Font(15));
        text3.setFont(new Font(15));
        text4.setFont(new Font(15));
        button.setFont(new Font(15));
        VBox buttonbox = new VBox(button);
        buttonbox.setAlignment(Pos.CENTER);
        buttonbox.setMinSize(375,50);       //aligning to center the button.
        Pane buttonpane = new Pane(buttonbox);


        box.getChildren().addAll(titlepane, gridpane, buttonpane);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(starta_skiten -> {               // The button and what the button does.
            double red;
            double green;
            double blue;
            red = Integer.valueOf(inputRed.getText());
            green = Integer.valueOf(inputGreen.getText());
            blue = Integer.valueOf(inputBlue.getText());

            if (red > 255 || red <0 || green > 255 || green <0 || blue > 255 || blue < 0){      //Control of values.
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Input error!");
                alert.setHeaderText("Input error");
                alert.setContentText("The Color value must be between 0-255.");
                alert.showAndWait();
            }
            else {
                Color color2 = new Color(red / 255, green / 255, blue / 255, 1); //Setting the color.
                titlepane.setBackground(new Background(new BackgroundFill(color2, null, null))); // changing the BG color.
            }

        });



    }

    public static void main(String[] args) {
        launch();
    }
}
