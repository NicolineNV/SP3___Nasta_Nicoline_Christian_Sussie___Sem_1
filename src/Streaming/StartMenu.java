package Streaming;

import Streaming.*;
import Streaming.util.FileIO;
import Streaming.util.TextUI;

public class StartMenu {


    FileIO io = new FileIO("Hej"); // Userinput skal være noget andet
    TextUI ui = new TextUI();
    User use = new User();

    public StartMenu (){


    }

    public void welcome (){
        ui.displayMessage("Welcome to this Streaming service!");

        String resolved = ui.promptText("""
                Do you want to: A: Login to an existing account\s
                B: Create a new account""");

        switch (resolved.toUpperCase()) {
            case "A":
                use.logincode();
                break;

            case "B":
                //goBack();
                break;

            default:
                System.out.println("Nothing found");
        }


        //io.threeOptions("Do you want to:" + "A: Login to an existing account \n" + "B: Create a new account \n" + "C: ");

        io.readDataFile("");
    }
}


/*public void threeOptions(String messeng){
    String resolved = tUI.promptText(messeng);
    switch (resolved.toUpperCase()) {
        case "A":
            //tryAgaian();
            break;

        case "B":
            //goBack();
            break;

        case "C":
            //createAccount();
            break;

        default:
            System.out.println("Nothing found");
    }
}*/