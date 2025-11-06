
import java.util.Scanner;

public class Login {

    String Username = "Hans";
    String Password = "ABC";

    public String logIn() {

        System.out.println("Enter username");
        Scanner scan1 = new Scanner(System.in);
        String username = scan1.nextLine();

        if (Username == username) {
            System.out.println("Enter password");
            Scanner scan2 = new Scanner(System.in);
            String password = scan2.nextLine();
            if (Password == password) {
                System.out.println("Welcome");
            } else {
                System.out.println("password not existing \n vil du forsøge igen? y/n");
                Scanner scan3 = new Scanner()
            }
        }
        else{
            System.out.println("Username not existing");
            logIn();
        }


        if ((Username + Password).equals(username + password)) {
            System.out.println("Welcome to Netflix");
        } else {
            System.out.println("Password not existing");
        }
        return "";
    }
}
