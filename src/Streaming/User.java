package Streaming;
import java.util.*;
import Streaming.util.FileIO;
import Streaming.util.TextUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private ArrayList<String> savedMedia; // instans variabel for arraylist
    private ArrayList<String> watchedMedia;
    String Username = "Hans";
    String Password = "ABC";
    //String fileName;
    String userSearch;
    FileIO fIO = new FileIO(userSearch);
    TextUI tUI = new TextUI();

    String password;


    boolean decision;

    public User() {
        this.savedMedia = new ArrayList<>();
        this.watchedMedia = new ArrayList<>();

    }
        //List of saved usernames.
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("Hans", "Grete", "Romeo", "Julie", "Ælling"));

        //list of saved passwords.
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("ABC", "BCA", "CAB", "AAA", "BBB"));


        //This method lets you login with your "Netflix" account.
        public String Login() {

            //Time to type in your username.
            String input1 = tUI.promptText("Hi this is Netflix. Type your username:");

            //Checking if the username already exist.
            if (!userNames.contains(input1)) {

                //You got here if you entered an incorrect username.
                String input2 = tUI.promptText("The account " + "'" + input1 + "'" + " was not found\nTry again: Y\nExit: X");

                //This method is now given us two options "Try again" or "Exit".
                while (!input2.equalsIgnoreCase("Y") && !input2.equalsIgnoreCase("X")) {
                    input2 = tUI.promptText("'" + input2 + "'" + " is not a valid argument\nTry again: Y\nExit: X");
                }
                switch (input2.toUpperCase(Locale.ROOT)) {
                    case "Y":
                        Login();       //Try Again
                    case "X":
                        exitCode();    //Exit
                }
            } else {

                String reTry = "RunItAgain";                 //reTry & while-loop is only created so we can-
                while (!reTry.equals("StopRunningIt")) {     //loop everything below over again. To use the-
                    //"Try again" option in the switch method 'line95'.
                    //Time to type the password.
                    String input3 = tUI.promptText("Welcome back " + input1 + "\nType password: ");

                    //Checking if the password is correct.
                    if (!passwords.get(userNames.indexOf(input1)).equals(input3)) {

                        //You got here if you entered an incorrect password.
                        String input4 = tUI.promptText("Incorrect password for the account " + "'" + input1 + "'\nGo Back: B\nTry again: Y\nExit: X");

                        //This method is now given us three options "Go Back", "Try again" or "Exit".
                        while (!input4.equalsIgnoreCase("B") && !input4.equalsIgnoreCase("Y") && !input4.equalsIgnoreCase("X")) {
                            input4 = tUI.promptText("'" + input4 + "'" + " is not a valid argument\nGo Back: B\nTry again: Y\nExit: X");
                        }

                        switch (input4.toUpperCase(Locale.ROOT)) {
                            case "B":
                                Login();                       //Go BAck
                                reTry = "StopRunningIt";       //This reTry is used to "close" the while-loop
                                break;
                            case "Y":
                                reTry = "RunItAgain";          //Try again - Is connected to the
                                break;                         //            while-loop in 'line68'.
                            case "X":
                                exitCode();                    //Exit
                                reTry = "StopRunningIt";       //This reTry is used to "close" the while-loop

                        }
                    } else {

                        //This just shows that you finally got through.
                        reTry = "StopRunningIt";
                        System.out.println("Welcome back to Netflix");

                    }
                }
            }
            return "";
        }

        //ExitCode's only function is to be called when we want to exit a method.
        public void exitCode() {
        }

    }



/*  version 2
    public String userName() {
        String username = tUI.promptText("Enter username");

        //Control of username.
        if (!Username.equals(username)) {
            tUI.displayMessage("This username does not exist");
            userName(); // ændre til hovedmenu bliver kaldt
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
            tUI.displayMessage("Wrong password, would you like to try again?  y/n"); // boolean method call there ask the user about yes or no. turn true or false back.
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
*/

        /*
        // the start version.
        //System.out.println("Enter username");
        //Scanner scan1 = new Scanner(System.in);
        //String username = scan1.nextLine();

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

    /* ////////////////////////// arraylist for saved Media ////////////////////////////// */


    public void usersSavedDataList(ArrayList <String> mediaTitles) {

        if (mediaTitles != null) { // if there not are make a list to save on, this will make the list.
            this.savedMedia = new ArrayList<>(mediaTitles);
        } else {
            this.savedMedia = new ArrayList<>(); // if there is a saved list it vil save the list.
        }
    }

    public void addTitleToSaved(String title) { // this method add movies og serie titel to the list.
        savedMedia.add(title);
    }

    public ArrayList<String> getSavedTitles() { // make the privet Arraylist titles avaibel
        return savedMedia;
    }

    public void copyLineFromDocToSavedArraylist() {
        userSearch = tUI.promptText("write name on the movie or serie"); // input from user
        String takeInfoFromDoc = "\\Data\\movieData.csv" + "\\Data\\seriesData.csv"; // the data over the movie and series.
        // String moveInfoToDoc = "\\Data\\savedData.csv"; // there the watched media shall turn to.

        // we want to read the file and see after the wanted title
        try (Scanner scan1 = new Scanner(new File(takeInfoFromDoc))) {
            boolean found = false;

            while (scan1.hasNextLine()) {
                String line = scan1.nextLine();

                if (line.contains(userSearch)) {
                    // ask the user would they like to add media to the savedlist.
                    tUI.displayMessage("would you like to add" + line + "to your saved list? y/n: ");
                    boolean answer = tUI.promptQuestion(); // call yes/ no boolean method.
                    if (answer == true) {
                        addTitleToSaved(line); // add the full line off the title to the arraylist.
                        found = true;
                    }
                    if (answer == false) {
                        // call tilbage filmens oversigt.
                        tUI.displayMessage("indsæt metode kald til filmens oversigt");
                    }

                }
                if (!found) {
                    tUI.displayMessage("The desired titel was not found \n" + "Would you like to search for another titel? (Y/N)");
                    boolean answer2 = tUI.promptQuestion();
                    if (answer2 == true) {
                        // kald efter metode til søgning af film
                        tUI.displayMessage("indsæt metode der kalder søg af film");
                    }
                    if (answer2 == false) {
                        // kald metode gå til hoved menu
                        tUI.displayMessage(" indsæt metode der kalder hovedmenu ");
                    }

                }

            }

        } catch (FileNotFoundException e) {
            tUI.displayMessage("We have technical difficulties - we are working on them and will be back shortly");
            throw new RuntimeException(e);
        }

    }

    /* /////////////////////////// Arraylist for Wacthed Media ////////////////////////////////////*/

    public void usersWatchedDataList(ArrayList<String> mediaTitles) {

        if (mediaTitles != null) { // if there not are make a list over the watched, this will make the list.
            this.watchedMedia = new ArrayList<>(mediaTitles);
        } else {
            this.watchedMedia = new ArrayList<>(); // if there is a watched list it will add to the list.
        }
    }

    public void addTitleToWatched(String title) { // this method add movies and series titel to the list.
        watchedMedia.add(title);
    }

    public ArrayList<String> getWatchedTitles() { // make the privet Arraylist titles avaibel
        return watchedMedia;
    }

    public void copyLineFromDocToWatchedArraylist() {
        userSearch = tUI.promptText("write name on the movie or serie"); // input from user
        String takeInfoFromDoc = "\\Data\\movieData.csv" + "\\Data\\seriesData.csv"; // the data over the movie and series.
        // we want to read the file and see after the wanted title
        try (Scanner scan = new Scanner(new File(takeInfoFromDoc))) {
            boolean found = false;

            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                if (line.contains(userSearch)) {
                    // ask the user would they like to watch the media.
                    tUI.displayMessage("would you like to Watch" + line + " ? y/n: ");
                    boolean answer = tUI.promptQuestion(); // call yes/ no boolean method.
                    if (answer == true) {
                        addTitleToWatched(line); // add the full line off the title to the arraylist.
                        tUI.displayMessage("you watch now " + line);
                        found = true;
                    }
                    if (answer == false) {
                        // call tilbage filmens oversigt.
                        tUI.displayMessage("indsæt metode kald til filmens oversigt");
                    }

                }
                if (!found) {
                    tUI.displayMessage("The desired titel was not found \n" + "Would you like to search for another titel? (Y/N)");
                    boolean answer2 = tUI.promptQuestion();
                    if (answer2 == true) {
                        // kald efter metode til søgning af film
                        tUI.displayMessage("indsæt metode der kalder søg af film");
                    }
                    if (answer2 == false) {
                        // kald metode gå til hoved menu
                        tUI.displayMessage(" indsæt metode der kalder hovedmenu ");
                    }

                }

            }

        } catch (
                FileNotFoundException e) {
            tUI.displayMessage("We have technical difficulties - we are working on them and will be back shortly");
            throw new RuntimeException(e);
        }

    }
    
    /* 
          ////////////////////////// Mangler stadig  ////////////////////////////// 
           
          * metode til fjerne fra array hvis bruger ikke ønsker medie på listen over gemt.
          * metode til at fjerne fra liste over saved når man trykker se og flyt til watched.(kald på metode addTitleToWatched)
          * måske lave varibel i top til at forkorte kode eksempel userseach.
          *
     
     */



}


