package ArrowsDot;

import javafx.application.Platform;
import javafx.fxml.FXML;
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
		
	@FXML
	private void initialize() {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				plane.requestFocus();
			}
		});
	}

	@FXML
	private void dotArrow() {
		
		plane.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case UP:    dot.setCenterY(dot.getCenterY() - 3); break;
			case RIGHT: dot.setCenterX(dot.getCenterX() + 3); break;
			case DOWN:  dot.setCenterY(dot.getCenterY() + 3); break;
			case LEFT:  dot.setCenterX(dot.getCenterX() - 3); break;
			default:
				break;	
			}				
		});		
	}		
}
	
	
	
