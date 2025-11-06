package Streaming;

public class MovieData extends Movie implements ISpecification{

    private String titel;
    private String categories;
    private double rating;
    private int year;


    public MovieData (String titel, String categories, double rating, int year){
        this.titel = titel;
        this.categories = categories;
        this.rating = rating;
        this.year = year;

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
    public int getYear() {
        return year;
    }
}
