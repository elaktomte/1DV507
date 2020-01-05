package cf222jf_assignment2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Testing extends Application{

        public void start(Stage primaryStage){
            HBox box = new HBox();
            Text text = new Text("Yatta!");
            text.setFont(new Font(200));
            box.getChildren().add(text);
            Scene scene = new Scene(box);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public static void main(String[] args)
        {
            launch();
        }
    }

