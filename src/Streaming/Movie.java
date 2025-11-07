package Streaming;
import java.util.*;

public class Movie extends Media implements IMedia{

    private String titel;
    private String categories;
    private double rating;
    private String year;

    protected MovieData[] movies;
    private int counter;

    public Movie(String titel, String year, String categories, double rating) {
        super();
        this.titel = titel;
        this.categories = categories;
        this.rating = rating;
        this.year = year;
        this.movies = new MovieData [movies.length];
        this.counter = 0;
    }
    public MovieData getNext(){
        if (counter >=  movies.length){
            counter = 0;
        } else {
            counter++;
        }
        return movies[counter];
    }

    public void createMovies(String[] movies ){
        for (int i=0; i <= movies.length; i++){
            String[] position = movies[i].split(";");
            String titel = position[0].trim();
            String year = position[1].trim();
            String categories = position[2].trim();
            double rating = Double.parseDouble(position[3].trim());

            MovieData m = new MovieData(titel, year, categories, rating);
            this.movies[i] = m;
        }
        Collections.shuffle(Arrays.asList(movies));

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
}
