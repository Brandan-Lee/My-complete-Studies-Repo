package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public void start(Stage sWindow) throws Exception {
        
        BorderPane bpLayout = new BorderPane();
        
        Button btnJoke = new Button("Joke");
        Button btnAnswer = new Button("Answer");
        Button btnExplanation = new Button("Explanation");

        HBox hbMenu = new HBox();
        hbMenu.setPadding(new Insets(20, 20, 20, 20));
        hbMenu.setSpacing(10);
        hbMenu.getChildren().addAll(btnJoke, btnAnswer, btnExplanation);
        
        StackPane spJokeScreen = createView("What do you call a bear with no "
                + "teeth?");
        StackPane spAnswerScreen = createView("A gummy bear.");
        StackPane spExplanationScreen = createView("When you have no teeth "
                + "all a person can see is your gums");
        
        btnJoke.setOnAction((event) -> {
            bpLayout.setCenter(spJokeScreen);
        });
        btnAnswer.setOnAction((event) -> {
            bpLayout.setCenter(spAnswerScreen);
        });
        btnExplanation.setOnAction((event) -> {
            bpLayout.setCenter(spExplanationScreen);
        });
        
        bpLayout.setTop(hbMenu);
        bpLayout.setCenter(spJokeScreen);
        
        Scene scene = new Scene(bpLayout);
        
        sWindow.setScene(scene);
        sWindow.show();

    }//end start
    
    private StackPane createView(String text) {
        
        StackPane spLayout = new StackPane();
        spLayout.setPrefSize(300, 10);
        spLayout.getChildren().add(new Label(text));
        spLayout.setAlignment(Pos.CENTER);
        
        return spLayout;
        
    }//createView
    
    public static void main(String[] args) {
        
        launch(JokeApplication.class);
        
    }//end main

}//end class
