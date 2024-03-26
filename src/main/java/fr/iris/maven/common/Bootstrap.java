package fr.iris.maven.common;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Bootstrap extends Application  {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = FXMLLoader.load(getClass().getClassLoader().getResource("hello.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("HW");
		primaryStage.setHeight(300);
		primaryStage.setWidth(300);
		primaryStage.show();
		primaryStage.centerOnScreen();
	}

}