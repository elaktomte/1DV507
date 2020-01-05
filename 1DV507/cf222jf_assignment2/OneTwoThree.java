package cf222jf_assignment2;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OneTwoThree extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("One, Two, Three");
		VBox hbox = new VBox();
		primaryStage.setHeight(300);
		primaryStage.setWidth(300);


		Text text = new Text();
		Text text2 = new Text();
		Text text3 = new Text();
		text.setText("One");
		text2.setText("Two");
		text3.setText("Three");
		text.setFont(new Font(15));
		text2.setFont(new Font(15));
		text3.setFont(new Font(15));
		VBox vbox = new VBox(text);
		vbox.setMinSize(300,80);
		vbox.setAlignment(Pos.TOP_LEFT);
		VBox vbox2 = new VBox(text2);
		vbox2.setMinSize(300,80);
		vbox2.setAlignment(Pos.CENTER);
		VBox vbox3 = new VBox(text3);
		vbox3.setMinSize(275,80);
		vbox3.setAlignment(Pos.BOTTOM_RIGHT);

		Pane pane1 = new Pane(vbox);
		Pane pane2 = new Pane(vbox2);
		Pane pane3 = new Pane(vbox3);
		pane1.setBackground(new Background(new BackgroundFill(new Color(1,1,1,1),null,null)));
		pane2.setBackground(new Background(new BackgroundFill(new Color(0,1,1,1),null,null)));
		pane3.setBackground(new Background(new BackgroundFill(new Color(1,0,0,1),null,null)));


		hbox.getChildren().addAll(pane1,pane2,pane3);
		Scene scene = new Scene(hbox);

		primaryStage.setScene(scene);
		primaryStage.show();

		
	}
	public static void main(String[] args) {
		launch();
	}




}
