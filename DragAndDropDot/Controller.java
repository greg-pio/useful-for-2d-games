package DragAndDropDot;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;

public class Controller {
		
	@FXML
	private MenuItem Close;
	@FXML
	private MenuItem About;
	@FXML
	private AnchorPane plane;
	@FXML
	private BorderPane border;
		
	@FXML
	private void onClose() {
		Platform.exit();
	}
	
	@FXML 
	private void onAbout() {
		
	}
		
	@FXML
	private Circle dot;
		
	double dragx, dragy;
	
	@FXML
	private void MouseEnter() {
		dot.setOnMouseEntered(e -> {
			dot.setCursor(Cursor.HAND);	
		});		
	}
	
	@FXML
	private void MousePressed() {		
		dot.setOnMousePressed(e -> {
			dot.setCursor(Cursor.CLOSED_HAND);
			dragx = dot.getLayoutX() - e.getSceneX();
			dragy = dot.getLayoutY() - e.getSceneY();
		});
	}
	
	@FXML
	private void MouseReleased() {
		dot.setOnMouseReleased(e -> {
			dot.setCursor(Cursor.HAND);
		});
	}

	@FXML
	private void MouseDragged() {
		dot.setOnMouseDragged(e -> {
			dot.setLayoutX(e.getSceneX() + dragx);
			dot.setLayoutY(e.getSceneY() + dragy);
		});
	}	
}





