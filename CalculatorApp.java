import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

	public class CalculatorApp extends Application {
		
		public static Stage lnkstage;

	    @Override
	    public void start(Stage stage) throws IOException {
	    	lnkstage = stage;
	    	Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
	        
	        Scene scene = new Scene(root);
	        
	        stage.setScene(scene);
	        stage.show();
	    }

	    public static void main(String[] args) {
	        launch();
	    }
	}
