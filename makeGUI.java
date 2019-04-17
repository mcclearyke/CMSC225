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


    public static void main(String[] args) {
        launch(args);
    }

private void start(Stage primaryStage) throws Exception {
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
	String[] lengths = {"Inches","Feet","Miles","Centimeters","Meters","Kilometers"};
	lengthSelection1 = new ChoiceBox<>(lengths);
		lengthSelection1.setValue("Inches"); 
	lengthSelection2 = new ChoiceBox<>(lengths);
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





//Making the secne
	//setLayout(new FlowLayout());

	//String[] lengths = {"Inches","Feet","Miles","Centimeters","Meters","Kilometers"};

	//length1Label = new Label("Select the length you'd like to convert: "); 
	//add(length1Label);

	//ChoiceBox<String> lengthSelection1 = new ChoiceBox<>(lengths);
   // lengthSelection1.setSelectedIndex(0);
    //lengthSelection1.setValue("Inches"); //Setting a defult
	
	//lengthValue1Label = new Label("Enter the length:  ");

	//lengthAmount1 = new TextField(10);
	//add(lengthAmount1);

	//length2Label = new Label("Select the length you'd like to conevert to: ");

	//ChoiceBox<String> lengthSelection2 = new ChoiceBox<>(lengths);
    //lengthSelection2.setSelectedIndex(1);
    //lengthSelection2.setValue("Inches"); //Setting a defult 

	//convertButton = new Button("Convert");
	//add(convertButton);
	//	convertButton.addActionListener(this);

	//conversionLabel = new Label("Converted length:  ");
	//
		//convertedLength = new TextField(10);
	//add(convertedLength);

	//clearButton = new Button("Clear");
	//add(clearButton);

	//setTitle("Length Converter");
	//setSize(350, 400);
	//setVisible(true);
}
}

