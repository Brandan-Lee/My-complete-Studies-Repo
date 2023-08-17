
/*
In this exercise you will implement a program for calculating and displaying the
sum in a savings account. User can give the calculator a sum to save each month
and the yearly interest rate, and the calculator will display how the savings
will increase over 30 years.
*/

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        
        launch(SavingsCalculatorApplication.class);
        
    }//end main
    
    public void start(Stage stage) {
        
        BorderPane layout = new BorderPane();
        
        Slider savingsSlider = new Slider(25, 250, 50);
        savingsSlider.setSnapToTicks(true);
        savingsSlider.setBlockIncrement(500);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        
        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setMinorTickCount(10);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        
        Label savingsInfo = new Label();
        savingsInfo.setText("" + savingsSlider.getValue());
        
        Label interestInfo = new Label();
        interestInfo.setText("" + interestSlider.getValue());
        
        BorderPane savingsPane = new BorderPane();
        savingsPane.setLeft(new Label("Monthly savings"));
        savingsPane.setCenter(savingsSlider);
        savingsPane.setRight(savingsInfo);
        savingsPane.setPadding(new Insets(10));
        
        BorderPane interestPane = new BorderPane();
        interestPane.setLeft(new Label("Yearly interest rate"));
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestInfo);
        interestPane.setPadding(new Insets(10));
        
        VBox sliderVbox = new VBox();
        sliderVbox.getChildren().addAll(savingsPane, interestPane);
        sliderVbox.setPadding(new Insets(10));
        sliderVbox.setSpacing(10);
         
        layout.setTop(sliderVbox);
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        
        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);
        lineChart.setTitle("Savings calculator");
        
        layout.setCenter(lineChart);
        
        XYChart.Series savingsSeries = new XYChart.Series();
        XYChart.Series savingsWithInterestSeries = new XYChart.Series();
        
        lineChart.getData().add(savingsSeries);
        lineChart.getData().add(savingsWithInterestSeries);
        
        savingsSlider.setOnMouseReleased(e ->  {
            
            savingsInfo.setText("" + savingsSlider.getValue());
            updateSavings(savingsSlider.getValue(), interestSlider.getValue(),
                    savingsSeries, savingsWithInterestSeries);
            
        });
        
        interestSlider.setOnMouseReleased(e -> {
            
            String interestString = "" + interestSlider.getValue();
            
            if (interestString.length() > 4) {
                
                interestString = interestString.substring(0, 4);
                
            }//end if
            
            interestInfo.setText(interestString);
            updateSavings(savingsSlider.getValue(), interestSlider.getValue(),
                    savingsSeries, savingsWithInterestSeries);
            
        });
        
        Scene view = new Scene(layout, 640, 480);
        stage.setScene(view);
        stage.show();
        
    }//end start
    
    private void updateSavings(double savings, double interest, XYChart.Series
        savingsSeries, XYChart.Series savingsWithInterestSeries) {
        
        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();
        
        savingsSeries.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestSeries.getData().add(new XYChart.Data(0, 0));
        
        double previous = 0;
        
        for (int i = 1; i <= 30; i++) {
            
            savingsSeries.getData().add(new XYChart.Data(i, i * savings * 12));
            previous += savings * 12;
            previous *= (1 + interest / 100.0);
            savingsWithInterestSeries.getData().add(new XYChart.Data(i, previous));
            
        }//end for
        
    };//end updateSavings
        
}//end class
