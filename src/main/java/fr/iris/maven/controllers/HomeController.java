package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeController implements Initializable {

	private Stage parentStage;
	
	public void setParentStage(Stage parentStage) {
		this.parentStage = parentStage;
	}
	
	@FXML
	public Label titleUI;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.titleUI.setText("Welcome");		
	}
	
	public void handleClick(Event e) throws IOException {
		
		VBox root = FXMLLoader.load(getClass().getClassLoader().getResource("hello.fxml"));
		Scene scene = new Scene(root);
		parentStage.setScene(scene);
		
	}
}
