package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private TextField txtNumberOne;
	@FXML
	private TextField txtNumberTwo;
	@FXML
	private Label labelResult;
	@FXML
	private Button btSum;
	@FXML
	public void onBtSumAction() {
		try {
			double numberOne = Double.parseDouble(txtNumberOne.getText());
			double numberTwo = Double.parseDouble(txtNumberTwo.getText());
			double sum = numberOne + numberTwo;
			labelResult.setText(String.format("%.2f", sum));
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}
	
	
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Alert title", "Alert header" , "Alert content", AlertType.INFORMATION);
	}
}
