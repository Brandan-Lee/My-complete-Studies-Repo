package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    
    private Dictionary dictionary;

    public void start(Stage sWindow) throws Exception {
        
        PracticeView practiceView = new PracticeView(this.dictionary);
        InputView inputView = new InputView(this.dictionary);
        
        BorderPane bpLayout = new BorderPane();
        
        Button btnEnterNewWords = new Button("Enter new words");
        Button btnPractice = new Button("Practice");
        
        HBox hbMenu = new HBox();
        hbMenu.setPadding(new Insets(20, 20, 20, 20));
        hbMenu.setSpacing(10);
        hbMenu.getChildren().addAll(btnEnterNewWords, btnPractice);
        
        bpLayout.setTop(hbMenu);
        
        btnEnterNewWords.setOnAction((event) -> {
            bpLayout.setCenter(inputView.getView());
        });
        btnPractice.setOnAction((event) -> {
            bpLayout.setCenter(practiceView.getView());
        });
        
        bpLayout.setCenter(inputView.getView());
        
        Scene view = new Scene(bpLayout, 400, 300);
        
        sWindow.setScene(view);
        sWindow.show();
        
    }//end start
    
    public void init() throws Exception {
        
        this.dictionary = new Dictionary();
        
    }//end init
    
    public static void main(String[] args) {
        
        launch(VocabularyPracticeApplication.class);
        
    }//end main
    
}//end class

