import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class FinalGUI extends Application {
	private Label length1Label;
	private Label length2Label;
	private Label conversionLabel;
	private Label lengthValue1Label;
	private TextField lengthAmount1;
	private TextField convertedLength;
	private Button convertButton;
	private Button clearButton;
	private ChoiceBox<String> lengthSelection1;
	private ChoiceBox<String> lengthSelection2;
	private Stage window;


    public static void main(String[] args) {
        launch(args);
    }

private void start(Stage primaryStage) throws Exception {
	window = primaryStage;
	Scene scene = null;
	GridPane gridPane = null;

	gridpane = new GridPane();
	scene = new Scene(gridPane);

	// Labels
	length1Label = new Label("Select the length you'd like to convert: "); 
	lengthValue1Label = new Label("Enter the length:  ");
	length2Label = new Label("Select the length you'd like to conevert to: ");
	conversionLabel = new Label("Converted length:  ");

	//Textfields
	lengthAmount1 = new TextField();
		lengthAmount1.setPrefColumnCount(15);
		lengthAmount1.setEditable(true);
		lengthAmount1.setText("Enter Value");

	convertedLength = new TextField();
		convertedLength.setPrefColumnCount(15);
		convertedLength.setEditable(false);

	//Buttons
	convertButton = new Button("Convert");
	clearButton = new Button("Clear");

	//ChoiceBox
	lengthSelection2 = new ChoiceBox<>();
		lengthSelection1.getItems().add("Inches");
        lengthSelection1.getItems().add("Feet");
        lengthSelection1.getItems().add("Miles");
        lengthSelection1.getItems().add("Centimeters");
        lengthSelection1.getItems().add("Meters");
        lengthSelection1.getItems().add("Kilometers");
			lengthSelection1.setValue("Inches"); 

	lengthSelection2 = new ChoiceBox<>();
		lengthSelection2.getItems().add("Inches");
        lengthSelection2.getItems().add("Feet");
        lengthSelection2.getItems().add("Miles");
        lengthSelection2.getItems().add("Centimeters");
        lengthSelection2.getItems().add("Meters");
        lengthSelection2.getItems().add("Kilometers");
			lengthSelection2.setValue("Inches"); 

	//Making the grid
	gridPane.setPadding(new Insets(10,10,10,10));
	gridPane.setHgap(10);
	gridPane.setVgap(10);

	gridPane.add(length1Label, 0, 0);
	gridPane.add(lengthSelection1, 1, 0);
	gridPane.add(lengthValue1Label, 0, 1);
	gridPane.add(lengthAmount1, 1, 1);
	gridPane.add(length2Label, 0, 2);
	gridPane.add(lengthSelection2, 2, 0);
	gridPane.add(convertButton, 2, 2);
	gridPane.add(conversionLabel, 0, 3);
	gridPane.add(convertedLength, 3, 0);
	gridPane.add(clearButton, 4, 4);
	
	convertButton.setOnAction(new EventHandler<ActionEvent>() {

	}

 	  primaryStage.setScene(scene));   
      primaryStage.setTitle("Length Converter"); 
      primaryStage.show();        
}
}
