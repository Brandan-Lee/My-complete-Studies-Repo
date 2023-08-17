package smiley;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {


    public static void main(String[] args) {
        
        launch(SmileyApplication.class);
        
    }//end main
    
    @Override
    public void start(Stage stage) {
        
        Canvas paintingCanvas = new Canvas(300, 300);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        drawShapes(painter);
        
        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        
        Scene view = new Scene(paintingLayout);
        stage.setScene(view);
        stage.show();
        
    }//end start
    
    private void drawShapes(GraphicsContext gc) {
        
        gc.setFill(Color.BLACK);
        gc.fillRect(70, 60, 25, 25);
        gc.fillRect(200, 60, 25, 25);
        gc.fillRect(75, 200, 150, 25);
        gc.fillRect(75, 175, 25, 25);
        gc.fillRect(200, 175, 25, 25);
        
    }//end drawShapes
    
}//end class
