package Streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Series extends Media implements IMedia {

    private String titel;
    String categories;
    private double rating;
    private String year;
    protected String seriesLength;
    protected Series[] series;
    private int counter;

    public Series (String titel, String year, String categories, double rating, String seriesLength){
        super();
        this.titel = titel;
        //this.categories = new ArrayList<>();
        this.categories = categories;
        this.rating = rating;
        this.year = year;
        this.series = new Series[100];
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

            Series s = new Series (titel, year, categories, rating, seriesLength);
            this.series[i] = s;
        }
        Collections.shuffle(Arrays.asList(series));
    }



    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public String getTitle() {
        return titel;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public String getCategory() {
        return categories;
    }

    public String getSeriesLength(){
        return seriesLength;
    }
}