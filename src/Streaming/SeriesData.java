package Streaming;

public class SeriesData extends Series implements ISpecification{

    private String titel;
    private String categories;
    private double rating;
    private String year;


    public SeriesData(String titel, String year, String categories, double rating, String seriesLength) {
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
    public String getYear() {
        return year;
    }

    public String getSeriesLength(){
        return seriesLength;
    }


}
