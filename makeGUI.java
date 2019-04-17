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
	public static void main(String[] args) {
	    launch(args);
	}
	
	Stage window;
	Label length1Label;
	Label length2Label;
	Label conversionLabel;
	Label lengthValue1Label;
	TextField lengthAmount1;
	TextField convertedLength;
	Button convertButton;
	Button clearButton;
	ChoiceBox<String> lengthSelection1;
	ChoiceBox<String> lengthSelection2;
    
	@Override
	public void start(Stage applicationStage){
		window = applicationStage;
		Scene scene = null;
		GridPane gridPane = null;
	
		gridPane = new GridPane();
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
		lengthAmount1.setPromptText("Enter value");
	
		convertedLength = new TextField();
		convertedLength.setPrefColumnCount(15);
		convertedLength.setEditable(false);

		//Buttons
		convertButton = new Button("Convert");
		clearButton = new Button("Clear");
	
		//ChoiceBox
		lengthSelection1 = new ChoiceBox<>();
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
		gridPane.add(lengthSelection2, 1, 2);
		gridPane.add(convertButton, 1, 3);
		gridPane.add(conversionLabel, 0, 4);
		gridPane.add(convertedLength, 1, 4);
		gridPane.add(clearButton, 4, 4);
		
		convertButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				double lengthValue1 = 0.0;
				boolean correctFormat = true;
					try {
						lengthValue1 = Double.valueOf(lengthAmount1.getText());
						correctFormat = true;
					} catch(NumberFormatException exception) {
						Alert alert = new Alert(AlertType.ERROR, "Enter a number please.");
						lengthAmount1.setText(null);
		    				convertedLength.setText(null);
		    				correctFormat = false;
						alert.showAndWait();
						
					}
			
				
				double lengthValue2 = 0;
				
					// Inches
			  		final double INCHES_TO_CENTI = 2.54; // MULTIPLY
			  		final double INCHES_TO_METERS = 39.37; // DIVIDE
			  		final double INCHES_TO_KILOMETERS = 39370.079; // DIVIDE
			  		final double INCHES_TO_FEET = 12; // DIVIDE
			  		final double INCHES_TO_MILE = 63360; // DIVIDE

			  		// Feet
					final double FEET_TO_CENTI = 30.48; // MULTIPLY
			  		final double FEET_TO_METERS = 3.281; // DIVIDE
			  		final double FEET_TO_KILOMETERS = 3280.84; // DIVIDE
			        final double FEET_TO_INCHES = 12; // MULTIPLY
			        final double FEET_TO_MILE = 5280; // DIVIDE

			  		// Mile
				    final double MILE_TO_CENTI = 160934.4; // MULTIPLY
			  		final double MILE_TO_METERS = 1609.34; // MULTIPLY
			  		final double MILE_TO_KILOMETERS = 1.60934; // MULTIPLY
			        final double MILE_TO_INCHES = 63360; // MULTIPLY
			        final double MILE_TO_FEET = 5280; // MULTIPLY

					// Centimeters
					final double CENTI_TO_INCHES = 2.54; // DIVIDE
			  		final double CENTI_TO_FEET = 30.48; // DIVIDE
			  		final double CENTI_TO_MILES = 160934.4; // DIVIDE
			        final double CENTI_TO_METERS = 100; // DIVIDE
			        final double CENTI_TO_KIL0METERS = 100000; // DIVIDE

			  		// Meters
			  		final double METERS_TO_INCHES = 39.37; // MULTIPLY
			  		final double METERS_TO_FEET = 3.281; // MULTIPLY
			  		final double METERS_TO_MILES = 1609.344; // DIVIDE
			        final double METERS_TO_CENTI = 100; // MULTIPLY
			        final double METERS_TO_KILOMETERS =  1000; // DIVIDE

			  		// Kilometers
			  		final double KILO_TO_INCHES = 39370.079; // MULTIPLY
			  		final double KILO_TO_FEET = 3280.84; // MULTIPLY
			  		final double KILO_TO_MILES = 1.609; // DIVIDE
			        final double KILO_TO_CENTI = 100000; // MULTIPLY
			        final double KILO_TO_METERS = 1000; // MULTIPLY


			    /*******************************
			    Calculations if INCH is Selected
			    ********************************/
			        if(correctFormat == true) {
			    	//INCHES AND FEET
				        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Feet") {
				          
				            lengthValue2 = lengthValue1 / INCHES_TO_FEET ;
				        }
				        
				        //INCHES TO MILES
				        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Miles") {
				            
				            lengthValue2 = lengthValue1 / INCHES_TO_MILE;
				        }
				        
				        //INCHES TO CENTIMETERS
				        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Centimeters") {
				            
				            lengthValue2 = lengthValue1 * INCHES_TO_CENTI;
				        }
				        
				        //INCHES TO METERS
				        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Meters") {
				            
				            lengthValue2 = lengthValue1 / INCHES_TO_METERS;
				        }
				        
				        //INCHES TO KILOMETERS
				        if (lengthSelection1.getValue() == "Inches" && lengthSelection2.getValue() == "Kilometers") {
				            lengthValue2 = lengthValue1 / INCHES_TO_KILOMETERS;
				        }
				        
				        //INCHES TO INCHES
				        if (lengthSelection1.getValue() == "Inches" & lengthSelection2.getValue() == "Inches") {
				            lengthValue2 = lengthValue1;
				        }
	
				    /********************************
				    Calculations if FEET is Selected
				    ********************************/
	
				        //FEET TO INCHES
				        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Inches") {
				            lengthValue2 = lengthValue1 * FEET_TO_INCHES;
				        }
				        
				        //FEET TO MILES
				        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Miles") {
				            lengthValue2 = lengthValue1 / FEET_TO_MILE;
				        }
				        
				        //FEET TO CENTIMETERS
				        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Centimeters") {
				            lengthValue2 = lengthValue1 * FEET_TO_CENTI;
				        }
	
				        //FEET TO METERS
				        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Meters") {
				            lengthValue2 = lengthValue1 / FEET_TO_METERS;
				        }
	
				        //FEET TO KILOMETERS
				        if (lengthSelection1.getValue() == "Feet" && lengthSelection2.getValue() == "Kilometers") {
				            lengthValue2 = lengthValue1 / FEET_TO_KILOMETERS;
				        }
				        
				        //FEET TO FEET
				        if (lengthSelection1.getValue() == "Feet" & lengthSelection2.getValue() == "Feet") {
				            lengthValue2 = lengthValue1;
				        }
				        
				    /*******************************
				    Calculations if MILE is Selected
				    ********************************/
	
				        //MILES TO INCHES
				        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Inches") {
				            lengthValue2 = lengthValue1 * MILE_TO_INCHES;
				        }
				        
				        //MILES TO FEET
				        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Feet") {
				            lengthValue2 = lengthValue1 * MILE_TO_FEET;
				        }
				        
				        //MILES TO CENTIMETERS
				        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Centimeters" ) {
				            lengthValue2 = lengthValue1 * MILE_TO_CENTI;
				        }
				        
				        //MILES TO METERS
				        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Meters") {
				            lengthValue2 = lengthValue1 * MILE_TO_METERS;
				        }
	
				        //MILES TO KILOMETERS
				        if (lengthSelection1.getValue() == "Miles" && lengthSelection2.getValue() == "Kilometers") {
				            lengthValue2 = lengthValue1 * MILE_TO_KILOMETERS;
				        }
				        
				        //MILES TO MILES
				        if (lengthSelection1.getValue() == "Miles" & lengthSelection2.getValue() == "Miles") {
				            lengthValue2 = lengthValue1;
				        }
				
	
				    /********************************
				    Calculations if CENTI is Selected
				    *********************************/
	
				        //CENTIMETERS TO INCHES
				        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Inches") {
				            lengthValue2 = lengthValue1 / CENTI_TO_INCHES;
				        }
	
				        //CENTIMETERS TO FEET
				        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Feet") {
				            lengthValue2 = lengthValue1 / CENTI_TO_FEET;
				        }
				        
				        //CENTIMETERS TO MILES
				        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Miles") {
				            lengthValue2 = lengthValue1 / CENTI_TO_MILES;
				        }
				        
				        //CENTIMETERS TO METERS
				        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Meters") {
				            lengthValue2 = lengthValue1 / CENTI_TO_METERS;
				        }
				       
				       	//CENTIMETERS TO KILOMETERS
				        if (lengthSelection1.getValue() == "Centimeters" && lengthSelection2.getValue() == "Kilometers") {
				            lengthValue2 = lengthValue1 / CENTI_TO_KIL0METERS;
				        }
				        
				        //CENTIMETERS TO CENTIMETERS
				        if (lengthSelection1.getValue() == "Centimeters" & lengthSelection2.getValue() == "Centimeters") {
				            lengthValue2 = lengthValue1;
				        }
				        
				    /********************************
				    Calculations if METER is Selected
				    ********************************/
				       
				        //METERS TO INCHES
				        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Inches") {
				            lengthValue2 = lengthValue1 * METERS_TO_INCHES;
				        }
				        
				        //METERS TO FEET
				        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Feet") {
				            lengthValue2 = lengthValue1 * METERS_TO_FEET;
				        }
	
				        //METERS TO MILES
				        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Miles") {
				            lengthValue2 = lengthValue1 / METERS_TO_MILES;
				        }
				        
				        //METERS TO CENTIMETERS
				        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Centimeters") {
				            lengthValue2 = lengthValue1 * METERS_TO_CENTI;
				        }
				        
				        //METERS TO KILOMETERS
				        if (lengthSelection1.getValue() == "Meters" && lengthSelection2.getValue() == "Kilometers") {
				            lengthValue2 = lengthValue1 / METERS_TO_KILOMETERS;
				        }
				        
				        //METERS TO METERS
				        if (lengthSelection1.getValue() == "Meters" & lengthSelection2.getValue() == "Meters") {
				            lengthValue2 = lengthValue1;
				        }
				        
				    /*******************************
				    Calculations if KILO is Selected
				    ********************************/
	
				        //KILOMETERS TO INCHES
				        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Inches") {
				            lengthValue2 = lengthValue1 * KILO_TO_INCHES;
				        }
				       
				        //KILOMETERS TO FEET
				        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Feet") {
				            lengthValue2 = lengthValue1 * KILO_TO_FEET;
				        }
				        
				        //KILOMETERS TO MILES
				        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Miles") {
				            lengthValue2 = lengthValue1 / KILO_TO_MILES;
				        }
				        
				        //KILOMETERS TO CENTIMETERS
				        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Centimeters") {
				            lengthValue2 = lengthValue1 * KILO_TO_CENTI;
				        }
				        
				        //KILOMETERS TO METERS
				        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Meters") {
				            lengthValue2 = lengthValue1 * KILO_TO_METERS;
				        }
				        
				        //KILOMETERS TO KILOMETERS
				        if (lengthSelection1.getValue() == "Kilometers" & lengthSelection2.getValue() == "Kilometers") {
				            lengthValue2 = lengthValue1;
				        }
				        
				        
				    //Displaying lengthValue2 into the convertedLength text feild
				    convertedLength.setText(String.valueOf(lengthValue2));
			        }
			}
		});
		
		clearButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				lengthAmount1.setText(null);
	    			convertedLength.setText(null);
			}
		});
		
		applicationStage.setScene(scene);
		applicationStage.setTitle("Length Converter");
		applicationStage.show();

	}
}
