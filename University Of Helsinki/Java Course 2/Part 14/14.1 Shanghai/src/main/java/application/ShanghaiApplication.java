package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
       
        launch(ShanghaiApplication.class);
        
    }//end main
    
    @Override
    public void start(Stage stage) throws Exception {
        
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series uoHData = new XYChart.Series();
        uoHData.setName("testing");
        
        uoHData.getData().add(new XYChart.Data(2007, 73));
        uoHData.getData().add(new XYChart.Data(2008, 68));
        uoHData.getData().add(new XYChart.Data(2009, 72));
        uoHData.getData().add(new XYChart.Data(2010, 72));
        uoHData.getData().add(new XYChart.Data(2011, 74));
        uoHData.getData().add(new XYChart.Data(2012, 73));
        uoHData.getData().add(new XYChart.Data(2013, 76));
        uoHData.getData().add(new XYChart.Data(2014, 73));
        uoHData.getData().add(new XYChart.Data(2015, 67));
        uoHData.getData().add(new XYChart.Data(2016, 56));
        uoHData.getData().add(new XYChart.Data(2017, 56));
        
        lineChart.getData().add(uoHData);
        
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }//end start
    
}//end class
