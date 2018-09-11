package FollowingDot;

import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Controller {
		
	@FXML
	private MenuItem Close;
	@FXML
	private MenuItem About;
	@FXML
	private AnchorPane plane;
		
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
	private void onPlaneClick() {
		plane.setOnMouseClicked(e -> {
			TranslateTransition tt = new TranslateTransition(Duration.millis(2000), dot);
			tt.setToX(e.getSceneX() - dot.getCenterX());
			tt.setToY(e.getSceneY() - dot.getCenterY() - 25);
			tt.setCycleCount(1);
			tt.setAutoReverse(false);
			tt.play();
		});		
	}
	
	// moves dot instantly to point of click
	/*
	@FXML
	private void onPlaneClick() {
		plane.setOnMouseClicked(e -> {
			dot.setCenterX(e.getX());
			dot.setCenterY(e.getY());
		});
	}
	*/
		
	// creates a black dot on click
	/*
	@FXML
	private void onPlaneClick() {
		plane.setOnMouseClicked(e -> {
			Circle dot = new Circle (e.getX(), e.getY(), 10);
			plane.getChildren().add(dot);
		});
	}
	*/
	

}
