
package application;



import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {
    
    private Dictionary dictionary;
    
    public InputView(Dictionary dictionary) {
        
        this.dictionary = dictionary;
        
    }//end constructor
    
    public Parent getView() {
        
        GridPane gpLayout = new GridPane();
        
        Label lblWord = new Label("Word");
        TextField tfWord = new TextField();
        Label lblTranslation = new Label("Translation");
        TextField tfTranslation = new TextField();
        Button btnAdd = new Button("Add the word pair");
        
        gpLayout.setAlignment(Pos.CENTER);
        gpLayout.setVgap(10);
        gpLayout.setHgap(10);
        gpLayout.setPadding(new Insets(20, 20, 20, 20));
        gpLayout.add(lblWord, 0, 0);
        gpLayout.add(tfWord, 0, 1);
        gpLayout.add(lblTranslation, 0, 2);
        gpLayout.add(tfTranslation, 0, 3);
        gpLayout.add(btnAdd, 0, 4);
        
        btnAdd.setOnMouseClicked((event) -> {
            String word = tfWord.getText();
            String translation = tfTranslation.getText();
            this.dictionary.add(word, translation);
            tfWord.clear();
            tfTranslation.clear();
        });
        
        return gpLayout;
        
    }//end getView
    
}//end class
