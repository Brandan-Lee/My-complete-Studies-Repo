
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class PracticeView {
  
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary) {
        
        this.dictionary = dictionary;
        this.word = this.dictionary.getRandomWord();
        
    }//end constructor
    
    public Parent getView() {
        
        GridPane gpLayout = new GridPane();
        
        Label lblInstruction = new Label("Translate the word '" + this.word + "'");
        TextField tfInstruction = new TextField();
        Button btnCheck = new Button("Check");
        Label lblAnswer = new Label();
        
        gpLayout.setAlignment(Pos.CENTER);
        gpLayout.setVgap(10);
        gpLayout.setHgap(10);
        gpLayout.setPadding(new Insets(10, 10, 10, 10));
        gpLayout.add(lblInstruction, 0, 0);
        gpLayout.add(tfInstruction, 0, 1);
        gpLayout.add(btnCheck, 0, 2);
        gpLayout.add(lblAnswer, 0, 3);
        
        btnCheck.setOnMouseClicked((event) -> {
            String translation = tfInstruction.getText();
            
            if (this.dictionary.get(this.word).equalsIgnoreCase(translation)) {
                
                lblAnswer.setText("Correct");
                
            } else {
                
                lblAnswer.setText("Incorrect! The translation for the word '" +
                        this.word + "' is " + this.dictionary);
                return;
                
            }//end else if
            
            this.word = this.dictionary.getRandomWord();
            lblInstruction.setText("Translate the word '" + this.word + "'");
            tfInstruction.clear();   
        });
        
        return gpLayout;
        
    }
    
}//end class
