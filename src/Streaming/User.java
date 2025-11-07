package Streaming;

import Streaming.util.FileIO;
import Streaming.util.TextUI;

import java.util.Scanner;

public class User extends MainMenu {

    String Username = "Hans";
    String Password = "ABC";
    TextUI tUI = new TextUI();
    FileIO fUI = new FileIO();
    String password;


    boolean decition;

    public User() {
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

            }return "Welcome " + Username + password;

        }
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