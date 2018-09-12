package DragAndDropDot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setTitle("Drag and drop dot");		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

class Delta {
	double x, y;
	
	public Delta() {
		x = 0;
		y = 0;
	}
}