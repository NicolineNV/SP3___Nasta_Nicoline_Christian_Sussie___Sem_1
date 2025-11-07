package Streaming;

import java.util.ArrayList;

public class Saved extends User {

    private ArrayList<String> savedTitles; // instans variabel for arraylist

    public Saved(ArrayList<String> titles) { // contruktor with Arraylist
        if (titles != null) { // if there not are make a list to save on, this will make the list.
            this.savedTitles = new ArrayList<>(titles);
        } else {
            this.savedTitles = new ArrayList<>(); // if there is a saved list it vil save the list.
        }
    }

    public void addTitle(String title) { // this method add movies og serie titel to the list.
        savedTitles.add(title);
    }

    public ArrayList<String> getSavedTitles() { // make the privet Arraylist titles avaibel
        return savedTitles;
    }

    /* //////////////////////////////////*/
// eller denne metode


    private String[] titels;
    private int counter;

    public Saved(String[] titels) { // tilføj noget her til Array når
        super();
        this.titels = titels.clone(); // make a array in the same length that the other is
        this.counter = 0;
    }

    public String getNext() { // method to run the list.
        String nextTitle = titels[counter];
        counter++;
        if (counter >= titels.length) {
            counter = 0;
        }
        return nextTitle;
    }
}



