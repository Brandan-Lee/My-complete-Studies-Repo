package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public void start(Stage window) throws Exception {
        
        Label lblInstructions = new Label("Enter your name and start");
        TextField tfInput = new TextField();
        Button btnStart = new Button("Start");
        Label lblError = new Label("");
        
        GridPane gpLayout = new GridPane();
        gpLayout.add(lblInstructions, 0, 0);
        gpLayout.add(tfInput, 0, 1);
        gpLayout.add(btnStart, 0, 2);
        gpLayout.add(lblError, 0, 3);
        gpLayout.setPrefSize(300, 180);
        gpLayout.setAlignment(Pos.CENTER);
        gpLayout.setVgap(10);
        gpLayout.setHgap(10);
        gpLayout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene sFirstScreen = new Scene(gpLayout);
        
        StackPane spWelcome = new StackPane();
        Label lblWelcome = new Label("");
        spWelcome.setPrefSize(300, 180);
        spWelcome.getChildren().add(lblWelcome);
        spWelcome.setAlignment(Pos.CENTER);
        
        Scene sWelcomeView = new Scene(spWelcome);
        
        btnStart.setOnAction((event) -> {
            
            
            
            if (tfInput.getText().isEmpty()) {
                
                lblError.setText("Please enter your name");
                
            } else {
                
                String name = tfInput.getText();
                lblWelcome.setText("Welcome " + name + "!");
                window.setScene(sWelcomeView);
                
            }//end else if
        });
        
        window.setScene(sFirstScreen);
        window.show();
        
    }//end start
    
    public static void main(String[] args) {
       
        launch(GreeterApplication.class);
        
    }//end main
    
}//end class
