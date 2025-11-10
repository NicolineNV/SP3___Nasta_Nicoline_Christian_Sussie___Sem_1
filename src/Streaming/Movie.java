package Streaming;
import java.util.*;

public class Movie extends Media implements IMedia{

    private String titel;
    private String categories;
    private double rating;
    private String year;

    protected Movie[] movies;
    private int counter;

    public Movie(String titel, String year, String categories, double rating) {
        super();
        this.titel = titel;
        this.categories = categories;
        this.rating = rating;
        this.year = year;
        this.movies = new Movie [movies.length];
        this.counter = 0;
    }

    public Movie getNext(){
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

            Movie m = new Movie(titel, year, categories, rating);
            this.movies[i] = m;
        }
        Collections.shuffle(Arrays.asList(movies));

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


}