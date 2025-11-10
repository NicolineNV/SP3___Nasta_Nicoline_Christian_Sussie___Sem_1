package Streaming;

import Streaming.util.FileIO;
import Streaming.util.TextUI;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends MainMenu {
    private ArrayList<String> savedTitles; // instans variabel for arraylist
    String Username = "Hans";
    String Password = "ABC";
    TextUI tUI = new TextUI();
    String password;


    boolean decition;

    public User() {
        this.savedTitles = new ArrayList<>();
    }

    public String user() {
        String username = tUI.promptText("Enter username");

        //System.out.println("Enter username");
        //Scanner scan1 = new Scanner(System.in);
        //String username = scan1.nextLine();

        //Control of username.

        if (!Username.equals(username)) {
            tUI.displayMessage("Username not existing");
            user(); // ændre til hovedmenu bliver kaldt
        } else {
            logincode();
        }
        return username;
    }

    //Control of password.
    public String logincode() { // login method
        boolean quest = true; // boolean variabel = true so if the users answer is yes they can try again.
        password = tUI.promptText("Enter password"); // messegen and a scanner call

        while (!Password.equals(password) && quest) {  // while loop so long it's wrong and the user want to try again it will run.
            tUI.displayMessage("Wrong password, would you try again?  y/n"); // boolean method call there ask the user about yes or no. turn true or false back.
            quest = tUI.promptQuestion(); // quest = the answer from the user in the line before.
            if (quest) {
                password = tUI.promptText("Enter password"); // saver new input to check
            }
        }
        if (Password.equals(password)) { // if
            tUI.displayMessage("Wellcome " + Username);

        }
        return "Welcome " + Username + password;

    }

        /*
            String password = tUI.promptText("Enter password");
            //Scanner scan2 = new Scanner(System.in);
            //String password = scan2.nextLine();
            if (Password == password) {
                System.out.println("Welcome to Netflix");
                // metode kald til menu
            } else if (tUI.promptQuestion()==true){
                password = tUI.promptText("Enter password");

            } else {
                tUI.displayMessage(" gå til menu");
            }
        }
        return username;
    }
}
*/
/*
            while (Password.equals(password) && (decition == true)) {
                decition = tUI.promptQuestion("Wrong password, would you like to try again?");
                password = tUI.promptText("Enter password");
                // scan2 = new Scanner(System.in);
                // password = scan2.nextLine();
            }

            }
        }
        return "";
    }
}

*/

    /* ////////////////////////// arraylist for saved film ////////////////////////////// */


    public User(ArrayList<String> titles) {

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

    public void copyLineFromDocToNewDoc(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wantedMediaName =  tUI.promptText("write name on the movie or serie");
        // indsæt søgning af dokument og return lokation

        String tagfraDoc = "Data/movieData.csv && Data/seriesData.csv"; // nok fejl her
        String rykTilDoc = "Data/savedData.csv";

        // we want to read the file and copy the info an add to doc if user want


        // Læs indholdet af filen
        // indsæt scaner der læser dokumenter

        // indsæt scanner der søger efter wantedMediaName
        // funktion der giver et output med den søgte film

        // Spørg brugeren
        tUI.displayMessage("would you like to add to wanted to watch list " + "funktion output insæt her" + "? (y/n): ");
        boolean answer = tUI.promptQuestion();


           }


}