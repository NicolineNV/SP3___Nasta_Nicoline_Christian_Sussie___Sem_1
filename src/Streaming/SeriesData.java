package Streaming;

public class SeriesData extends Series implements ISpecification{

    private String titel;
    private String categories;
    private double rating;
    private int year;


    public SeriesData (String titel, String categories, double rating, int year, String seriesLength){
        super(seriesLength);
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

    public String getSeriesLength(){
        return seriesLength;
    }


}
