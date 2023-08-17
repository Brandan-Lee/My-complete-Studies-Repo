package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public void start(Stage window) throws Exception {

        BorderPane borderPane = new BorderPane();
        Label firstView = new Label("First view!");
        Button toTheSecondView = new Button("To the second view!");
        borderPane.setTop(firstView);
        borderPane.setCenter(toTheSecondView);

        VBox vBox = new VBox();
        Button toTheThirdView = new Button("To the third view");
        Label secondView = new Label("Second View!");
        vBox.getChildren().addAll(toTheThirdView, secondView);

        GridPane gridPane = new GridPane();
        Label thirdView = new Label("Third view!");
        Button toTheFirstView = new Button("To the first view!");
        gridPane.add(thirdView, 0, 0);
        gridPane.add(toTheFirstView, 1, 1);

        Scene firsScene = new Scene(borderPane);
        Scene secondScene = new Scene(vBox);
        Scene thirdScene = new Scene(gridPane);

        toTheSecondView.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        toTheThirdView.setOnAction((event) -> {
            window.setScene(thirdScene);
        });
        toTheFirstView.setOnAction((event) -> {
            window.setScene(firsScene);
        });

        window.setScene(firsScene);
        window.show();

    }//end start

    public static void main(String[] args) {

        launch(MultipleViews.class);

    }//end main

}//end class
