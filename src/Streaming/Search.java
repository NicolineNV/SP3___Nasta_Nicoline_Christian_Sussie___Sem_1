package Streaming;

import Streaming.util.FileIO;
import Streaming.util.TextUI;

import java.util.Objects;

public class Search {

    String fileName;
    String userSearchInput;
    FileIO fIO = new FileIO(fileName, userSearchInput);
    TextUI tUI = new TextUI();
    String title;
    String year;
    String cat;
    double rating;
    Movie mov;
    Series seri;

    public Search() {

    }

    public String userSearch(String filename, String userSearchInput) {
        fIO.readFile("Data\\movieData.csv", userSearchInput);

        /* Vi skal have readFile til at snakke sammen med .getCategory() - aner bare ikke hvordan dette skal gøres
        */

        mov.getCategory();
        seri.getCategory();

        String msg = "Explore titles in this category: ";

        String mediaCategory = tUI.promptText("What category do you want to explore?");

        if ((userSearchInput != mov.getCategory()) || (userSearchInput != seri.getCategory())) {
            tUI.IOExceptionMessage("No titles found in the searched category");
        } else {
            switch (mediaCategory.toUpperCase()) {

                case "ACTION", "HORROR", "DRAMA", "CRIME", "BIOGRAPHY", "HISTORY", "SPORT", "ROMANCE", "WAR", "MYSTERY",
                     "ADVENTURE", "FANTASY", "THRILLER", "FILM-NOIR", "MUSICAL", "FAMILY", "SCI-FI", "COMEDY",
                     "WESTERN",
                     "MUSIC", "TALK-SHOW", "DOCUMENTARY":
                    tUI.displayMessage(msg);
                    break;

                default:
                    tUI.displayMessage("Brain still no brain = Brain go bye bye");
            }
        }

        return mediaCategory;

    }
/*
    public void searchCategoryMovie(){
        mov.getCategory();
        System.out.println(mov.getCategory());



        fileName = fIO.readFile("Data/movieData.csv", userSearch);
        Movie movieCate = new Movie (title, year, cat, rating);
        String movieCategory;
        movieCategory = movieCate.getMovieCategoryIndex(fileName, 2);

        Search movieCate = new Search();
        mov = movieCate.createMovies(fIO.readFile("Data/movieData.csv", userSearch));

    }

    void searchTitelMovie (readFile()){

    }
    void searchCategorySeries (readFile()){

    }
    void searchTitelSeries (readFile()){

    }
    void searchRating (readFile()){

    }*/


}
