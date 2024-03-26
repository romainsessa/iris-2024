package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController implements Initializable {

	// Model
	private String text;
	
	// View
	@FXML
	public Label titleUI;
	@FXML
	public TextField field;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Default value for Model
		text = "Hello";
		// Init view with model
		titleUI.setText(text);		
	}
	
	public void handleClick(Event e) {
		//Update model
		this.text = field.getText();
		//Update view
		this.titleUI.setText(this.text);
	}

}
