package cf222jf_Assignment3;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.collections.*;


public class Creature extends StackPane{
	Image theImage = new Image(getClass().getResourceAsStream("DV.jpg"));
	ImageView iw = new ImageView(theImage);

}
