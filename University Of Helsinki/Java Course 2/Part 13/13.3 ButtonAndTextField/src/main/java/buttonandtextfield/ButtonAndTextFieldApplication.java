package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {
    
    public void start(Stage window) {
        
        Button button = new Button("This is a button");
        TextField text = new TextField("Text element");
        
        FlowPane componentgroup = new FlowPane();
        componentgroup.getChildren().add(button);
        componentgroup.getChildren().add(text);
        
        Scene view = new Scene(componentgroup);
        
        window.setScene(view);
        window.show();
        
    }//end start


    public static void main(String[] args) {
        
        launch(ButtonAndTextFieldApplication.class);
        
    }//end main

}//end class
