package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class Main extends Application {

    @Override public void start(Stage stage) {
        stage.setTitle("Total Sales of Product A");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Month");

        final LineChart<String,Number> lineChart =
                new LineChart<String,Number>(xAxis,yAxis);

        lineChart.setTitle("Total Sales of Product A");

        XYChart.Series series = new XYChart.Series();
        series.setName("Amount");

        series.getData().add(new XYChart.Data("Jan", 2500));
        series.getData().add(new XYChart.Data("Feb", 1600));
        series.getData().add(new XYChart.Data("Mar", 2000));
        series.getData().add(new XYChart.Data("Apr", 2700));
        series.getData().add(new XYChart.Data("May", 3200));
        series.getData().add(new XYChart.Data("Jun", 800));


        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}