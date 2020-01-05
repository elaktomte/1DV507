package cf222jf_Assignment3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class UpDownPaneMain extends Application{

	public static void main(String[] args) {
		
		launch();
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		UpDownPane udp = new UpDownPane();
		Scene scene = new Scene(udp);
	
		
		
		scene.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.UP)
			udp.moveUp();
			else if (e.getCode() == KeyCode.DOWN)
			udp.moveDown();
			else if (e.getCode() == KeyCode.LEFT)
				udp.moveLeft();
			else if (e.getCode() == KeyCode.RIGHT)
			udp.moveRight();
			});

		Stage primarystage = new Stage();
		primarystage.setTitle("I feel your lack of faith disturbing");
		primarystage.setScene(scene);
		primarystage.show();
	}

}
