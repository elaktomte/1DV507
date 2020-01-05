package cf222jf_Assignment3;
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;
import javafx.stage.*;
import javafx.scene.*;




public class UpDownPane extends GridPane{
	ImageView[][] arr = new ImageView[7][7];
	public int X;
	public int Y;
	Image theImage = new Image(getClass().getResourceAsStream("DV.jpg"));

	public UpDownPane(){
		super();
		
		
		for (int y = 0; y < 7 ; y++){
			
			for (int x = 0; x <7; x++){
				arr[x][y] = new ImageView();
				arr[x][y].setFitHeight(100);
				arr[x][y].setFitWidth(100);
				this.add(arr[x][y], x, y);
			}

		}
	
		arr[3][3].setImage(theImage);
		X = 3;
		Y = 3;
		
	}
	
	public void moveUp(){
		arr[X][Y].setImage(null);
		Y--;
		if (Y < 0)
			Y=6;
		arr[X][Y].setImage(theImage);
		
	}
	public void moveDown(){
		arr[X][Y].setImage(null);
		Y++;
		if (Y>6)
			Y=0;
		arr[X][Y].setImage(theImage);
	}
	public void moveRight(){
		arr[X][Y].setImage(null);
		X++;
		if(X > 6)
			X=0;
		arr[X][Y].setImage(theImage);
	}
	public void moveLeft(){
		arr[X][Y].setImage(null);
		X--;
		if (X < 0)
			X=6;
		arr[X][Y].setImage(theImage);
	}


}
