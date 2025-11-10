package Streaming;
import java.util.*;

public class Movie extends Media implements IMedia{

    double rating;
    String title;
    String year;
    String categories;



    protected Movie [] movies;
    private int counter;

    public Movie(String title, String year, String categories, double rating) {
        super();
        this.movies = new Movie [100];
        this.counter = 0;

        //this.categories = new ArrayList<>();

        //createMovies(Data);
    }

    public Movie getNext(){
        if (counter >=  movies.length){
            counter = 0;
        } else {
            counter++;
        }
        return movies[counter];
    }

    public void createMovies(String[] movies) {
        for( int i = 0; i <= movies.length; i++){
            String [] position = movies[i].split(";");
            String title = position[0].trim();
            String year = position[1].trim();
            String categories = position[2].trim();
            /*String [] cat2 = categories.split(",");
            for ( int c = 0; c <= cat2.length; c++){String

            }*/
            double rating = Double.parseDouble(position[3].trim());

            Movie m = new Movie(title, year, categories, rating);
            this.movies[i] = m;
        }
        Collections.shuffle(Arrays.asList(movies));
    }

    /*public String getMovieCategoryIndex (String [] Data, int index){
        String [] parts = Data[index].split(";");
        return parts[2].trim();
    }*/

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

    public Movie getMovie (int index){
        return this.movies[index];
    }
}