import java.io.IOException;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

@SuppressWarnings("deprecation")
public class CalculatorController {

	@FXML
	private TextField inputYear;
	@FXML
	private Label lblResult;
	@FXML
	private MenuItem menuItemAuthor;
	@FXML
	private MenuItem backTC;
	
	public void calculate() {
		Integer yob = Integer.parseInt( inputYear.getText() );
		
		Integer cy = new Date().getYear() + 1900;

		if( !yob.equals("") && yob <= cy && !yob.equals(null) ) {
		 Integer age = cy - yob;
			
		 lblResult.setText( String.valueOf(age) );
		 inputYear.clear();	
		} else 
			lblResult.setText( "!ERROR! Please, write the year." );
	}
	
	public void showAbout() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("author.fxml"));
        
        Scene scene = new Scene(root);
        
        CalculatorApp.lnkstage.setScene(scene);
	}
	
	public void backToCalculator() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        
        Scene scene = new Scene(root);
        
        CalculatorApp.lnkstage.setScene(scene);
	}
	
}
