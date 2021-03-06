//Author Name: Able Varghese
//Student No: 300 806 936
//Program description: Program to Calculate the maximum heart rate and target heart rate of a person when he/she inputs their age.

/* * #############################LOGIC FOR THE ENTIRE APPLICATION& ###################################33
 * 
 * int Age = 40;
 * 
 * maximumHeartRate = 220 - 40;
 * 
 * targetLowerRangeOfHeartRate = 0.50*maximumHeartRate;
 * 
 * targetUpperRangeOfHeartRate = 0.85*maximumHeartRate;
 * 
 * System.out.println('maximum heart rate '+ maximumHeartRate);
 * System.out.println('lower target heart range '+ targetLowerRangeOfHeartRate);
 * System.out.println('upper target heart range '+ targetUpperRangeOfHeartRate);
 * 
 * */
//********************************************************************************************
package ExamHearRateCalculator;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("ExamCalculatorView.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
		
	}
}
