package ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;


public class MagicShowGUI extends Application {
	
	
	public void start(Stage stage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("MagicSquareGUI.fxml"));
		Scene scene = new Scene (root);
		stage.setTitle("Magic Square");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main (String[] args) {
		launch(args);
	}
}