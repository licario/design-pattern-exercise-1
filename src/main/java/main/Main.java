package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart = new BarChart("Task types report",new ArrayList());
    }

    BarChart barChart1 = new BarChart.BarChartBuilder()
            .withBackgroundColor("black")
            .withTitle("koza na rowerze")
            .withDisplayTitle(false)
            .withHeight(787)
            .build();
}
