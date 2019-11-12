package dad.template.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalApp extends Application {
	
	private CalController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new CalController();
		
		Scene escena = new Scene(controller.getRoot());
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Calculadora FXML");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
