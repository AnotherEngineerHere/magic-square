package ui;
import model.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MagicController {
		String chosen = "";
	  @FXML
	    private TextField sizeTF;

	    @FXML
	    private ComboBox<?> startPositionCB;

	    @FXML
	    private ScrollPane Sp;

	    @FXML
	    private Pane containerPane;

	    @FXML
	    private GridPane m	atrixPane;

	    @FXML
	    private Label verifyLabel;

	    @FXML
	    private RadioButton RadBut1;

	    @FXML
	    private ToggleGroup DirGroup;

	    @FXML
	    private RadioButton RadBut2;
	     

	    @FXML
	    /**
	     * 
	     * @param event
	     */
	    public void changeButName(ActionEvent event) {
		    String b =(String)startPositionCB.getValue();
		    String a = startPositionCB.getPromptText();
	    	if(a.equals("Select an option")) {
	    		if(b.equals("UP")) {
	    		RadBut1.setText("NW");
	    		RadBut2.setText("NE");
	    		}
	    		if(b.equals("DOWN")) {
		    		RadBut1.setText("SW");
		    		RadBut2.setText("SE");
		    		}
	    		if(b.equals("LEFT")) {
		    		RadBut1.setText("NW");
		    		RadBut2.setText("SW");
		    		}
	    		if(b.equals("RIGHT")) {
		    		RadBut1.setText("SE");
		    		RadBut2.setText("SE");
		    		}
	    	}
	    }
	    @FXML
	    /**
	     * 
	     * @param event
	     */
	    public void rB1(ActionEvent event) {
	    	chosen = RadBut1.getText();
	    }
	    @FXML
	    /**
	     * 
	     * @param event
	     */
	    public void rB2(ActionEvent event) {
	    	chosen = RadBut2.getText();
	    }
	    
    @FXML
    /**
     * 
     * @param event
     */
    public void showMatrix(ActionEvent event) {
    	String b =(String)startPositionCB.getValue();
    	int s = Integer.parseInt(sizeTF.getText());
    	if(s%2 !=0) {
    	MagicSquare ms = new MagicSquare(s);
    	String c=((String)startPositionCB.getValue());
    	GridPane gp = new GridPane();  
    	gp.setAlignment(Pos.CENTER);
    	gp.setHgap(10);
    	gp.setVgap(10);
    	ms.calculate(c, chosen);
    	
    	for(int i = 0; i<s; i++) {
    		for(int j = 0; j<s; j++) {
    			gp.add(new Button (ms.printMatrix(i, j)), j, i);
    		}
    	}
    	verifyLabel.setText("La constante magia es: "+ms.magicVerify());
    	containerPane.getChildren().clear();
    	containerPane.getChildren().add(gp);
    	}else {
			verifyLabel.setText("The number is not even");
		}
    }	   

}
