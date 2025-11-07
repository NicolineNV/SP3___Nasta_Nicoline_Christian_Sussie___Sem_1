package Streaming;

import java.util.Arrays;
import java.util.Collections;

public class Series extends Search {

    protected String seriesLength;
    protected SeriesData[] series;
    private int counter;

    public Series (String seriesLength){
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


}

