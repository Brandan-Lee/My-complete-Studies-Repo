package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public void start(Stage window) {

        BorderPane layout = new BorderPane();

        Label letters = new Label();
        Label wordsLabel = new Label();
        Label longestWord = new Label();

        HBox horizontalBox = new HBox();
        horizontalBox.setSpacing(10);
        horizontalBox.getChildren().add(letters);
        horizontalBox.getChildren().add(wordsLabel);
        horizontalBox.getChildren().add(longestWord);

        TextArea textField = new TextArea();

        textField.textProperty().addListener((ObservableValue<? extends String> change, String oldValue, String newValue) -> {

            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;

            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            letters.setText("Letters: " + characters);
            wordsLabel.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);

        });

        layout.setCenter(textField);
        layout.setBottom(horizontalBox);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }//end start

    public static void main(String[] args) {

        launch(TextStatisticsApplication.class);

    }//end main

}//end class
