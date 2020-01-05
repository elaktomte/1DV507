package cf222jf_Assignment3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.*;




public class XchartUI extends Application{



	@Override
	public void start(Stage primaryStage) throws Exception {
		final FileChooser file_man = new FileChooser();
		File infile = file_man.showOpenDialog(primaryStage);


		if (infile  == null){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No file selected!");
			alert.setHeaderText("No file selected!");
			alert.setContentText("Program will now terminate");
			alert.showAndWait();
		}
		else{
			RadioButton rb1 = new RadioButton();
			rb1.setText("Barchart");
			RadioButton rb2 = new RadioButton();
			rb2.setText("Pie Chart");
			ToggleGroup tg = new ToggleGroup();
			rb1.setToggleGroup(tg);
			rb2.setToggleGroup(tg);

			Group bg = new Group(rb1,rb2);





			Scanner scan = new Scanner(infile);
			ArrayList<Integer> lista = new ArrayList<Integer>();
			int tio = 0, tjugo = 0, trettio = 0, fyrtio = 0, femtio = 0, sextio = 0, sjuttio = 0, åttio = 0, nittio = 0, hundra = 0, övriga = 0;

			while (scan.hasNext()){
				int heltal = scan.nextInt();
				lista.add(heltal);
			}
			scan.close();
			for (int i = 0; i < lista.size(); i++){
				if (lista.get(i) >= 0 && lista.get(i) <=10){
					tio++;	
				}
				if (lista.get(i) > 10 && lista.get(i) <=20){
					tjugo++;
				}
				if (lista.get(i) > 20 && lista.get(i) <=30){
					trettio++;
				}
				if (lista.get(i) > 30 && lista.get(i) <=40){
					fyrtio++;
				}
				if (lista.get(i) > 40 && lista.get(i) <=50){
					femtio++;
				}
				if (lista.get(i) > 50 && lista.get(i) <=60){
					sextio++;
				}
				if (lista.get(i) > 60 && lista.get(i) <=70){
					sjuttio++;
				}
				if (lista.get(i) > 70 && lista.get(i) <=80){
					åttio++;
				}
				if (lista.get(i) > 80 && lista.get(i) <=90){
					nittio++;
				}
				if (lista.get(i) > 90 && lista.get(i) <=100){
					hundra++;
				}
				if (lista.get(i) < 0  || lista.get(i) > 100){
					övriga++;
				}

			}


			HBox chartbox = new HBox();
			HBox buttonbox = new HBox();




			primaryStage.setTitle("Charts");

			//Barchart

			CategoryAxis xAxis = new CategoryAxis();
			NumberAxis yAxis = new NumberAxis();
			BarChart<String, Number> barchart = new BarChart<>(xAxis, yAxis);
			barchart.setTitle("Heltal");
			xAxis.setLabel("Tiotal");
			yAxis.setLabel("Antal");
			XYChart.Series<String, Number> heltal = new XYChart.Series<>();
			heltal.setName("Heltal");

			heltal.getData().add(new XYChart.Data<String, Number>("0-10", tio));
			heltal.getData().add(new XYChart.Data<String, Number>("11-20", tjugo));
			heltal.getData().add(new XYChart.Data<String, Number>("21-30", trettio));
			heltal.getData().add(new XYChart.Data<String, Number>("31-40", fyrtio));
			heltal.getData().add(new XYChart.Data<String, Number>("41-50", femtio));
			heltal.getData().add(new XYChart.Data<String, Number>("51-60", sextio));
			heltal.getData().add(new XYChart.Data<String, Number>("61-70", sjuttio));
			heltal.getData().add(new XYChart.Data<String, Number>("71-80", åttio));
			heltal.getData().add(new XYChart.Data<String, Number>("81-90", nittio));
			heltal.getData().add(new XYChart.Data<String, Number>("91-100", hundra));
			heltal.getData().add(new XYChart.Data<String, Number>("övriga", övriga));
			barchart.getData().addAll(heltal);






			buttonbox.getChildren().addAll(rb1,rb2);

			//PieChart

			ObservableList<PieChart.Data> pieChartData =
					FXCollections.observableArrayList(
							new PieChart.Data("1-10", tio),
							new PieChart.Data("11-20", tjugo),
							new PieChart.Data("21-30", trettio),
							new PieChart.Data("31-40", fyrtio),
							new PieChart.Data("41-50", femtio),
							new PieChart.Data("51-60", sextio),
							new PieChart.Data("61-70", sjuttio),
							new PieChart.Data("71-80", åttio),
							new PieChart.Data("81-90", nittio),
							new PieChart.Data("91-100", hundra),
							new PieChart.Data("Övriga", övriga));

			final PieChart chart = new PieChart(pieChartData);
			chart.setTitle("Heltal");
			chartbox.getChildren().add(barchart);

			chartbox.setVisible(true);
			chart.setVisible(false);


			rb1.setOnMouseClicked(barch ->{ 
				chartbox.setVisible(true);
				chart.setVisible(false);
				

			});
			rb2.setOnMouseClicked(pieC ->{ 
				chartbox.setVisible(false);
				chart.setVisible(true);
				

			});

			
			buttonbox.setAlignment(Pos.TOP_RIGHT);
			Group group = new Group(chartbox,chart,buttonbox);
			Scene scene = new Scene(group,700,400);

			primaryStage.setScene(scene);
			primaryStage.show();
		}


	}

	public static void main(String[] args){
		launch();

	}


}
