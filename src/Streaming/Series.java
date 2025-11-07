package Streaming;

import java.util.Arrays;
import java.util.Collections;

public class Series extends Media implements IMedia {

    private String titel;
    private String categories;
    private double rating;
    private String year;
    protected String seriesLength;
    protected SeriesData[] series;
    private int counter;

    public Series (String titel, String year, String categories, double rating, String seriesLength){
        super();
        this.titel = titel;
        this.categories = categories;
        this.rating = rating;
        this.year = year;
        this.series = new SeriesData[series.length];
        this.counter = 0;
        this.seriesLength = seriesLength;
    }

    public Series getNextSeries() {
        if (counter >= series.length){
            counter = 0;
        } else {
            counter++;
        }
        return series[counter];
    }

    public void createSeries (String[] series){
        for (int i = 0; i <= series.length; i++){
            String[] position = series[i].split(";");
            String titel = position[0].trim();
            String year = position [1].trim();
            String categories = position[2].trim();
            double rating = Double.parseDouble(position[3].trim());
            String seriesLength = position[4].trim();

            String s = String.valueOf(new SeriesData(titel, year, categories, rating, seriesLength));
            series[i] = s;
        }
        Collections.shuffle(Arrays.asList(series));
    }


    @Override
    public String getTitel() {
        return titel;
    }

    @Override
    public String getCategories() {
        return categories;
    }

    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public String getYear() {
        return year;
    }

    public String getSeriesLength(){
        return seriesLength;
    }
}

