package Streaming;

import Streaming.util.FileIO;
import Streaming.util.TextUI;

import java.util.Scanner;

public class User extends MainMenu {

    String Username = "Hans";
    String Password = "ABC";
    TextUI tUI = new TextUI();


    public User(){
    }

    public String user() {
        String username = tUI.promptText("Enter username");

        //System.out.println("Enter username");
        //Scanner scan1 = new Scanner(System.in);
        //String username = scan1.nextLine();

        //Control of username.
        if (!Username.equals(username)) {
            tUI.displayMessage("Username not existing");
            user();
        } else {

        //Control of password.
            String password = tUI.promptText( "Enter password");
            //Scanner scan2 = new Scanner(System.in);
            //String password = scan2.nextLine();

            while(!Password.equals(password)){
                tUI.promptQuestion( "password not existing");
               // scan2 = new Scanner(System.in);
               // password = scan2.nextLine();
            }
            System.out.println("Welcome to Netflix");
        }
        return "";
    }
}


