package cf222jf_Assignment3;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.util.*;



public class CatchTheCreature extends Application{


	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		Creature cr = new Creature();
		Random rand = new Random();
		
		Image bg = new Image(getClass().getResourceAsStream("bg.jpg"));
		ImageView IWbg = new ImageView(bg);
		StackPane hbox = new StackPane(IWbg);
		hbox.setMaxWidth(800);
		hbox.setMaxHeight(800);
		Text text = new Text();
		text.setText("Current score: ");
		text.setFill(Color.WHITE);
		StackPane textpane = new StackPane(text);
		textpane.setAlignment(Pos.TOP_CENTER);
		StackPane CP = new StackPane(cr.iw);
		CP.setAlignment(Pos.TOP_LEFT);
		
	
		CP.setOnMouseClicked(e -> {
		int score = e.getClickCount();
		text.setText("Current score: "+score);
		});
		hbox.getChildren().addAll(textpane, CP);
		
		Scene scene = new Scene(hbox);
		
		
		AnimationTimer AT = new AnimationTimer(){
		public int timer = 0;	
			@Override
			public void handle(long t) {
				timer++;
				
				if (timer == 60){
				CP.setTranslateY(rand.nextInt(800));
				CP.setTranslateX(rand.nextInt(800));
				timer = 0;
				}
				
			}
			
			
		}
		;
		AT.start();
		
		
		primaryStage.setScene(scene);
		primaryStage.show();


	}

}

