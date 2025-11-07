package Streaming.util;
import Streaming.util.FileIO;
public class TextUI {



    public String promptText(String output) {
        displayMessage(output);
        String answer = FileIO.userInput(); // hardkode så denne!!
        return answer;
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }

    public boolean promptQuestion() { // user question yes or no metode
                String answer= FileIO.userInput(); // hardkode denne!!
        if (answer.equalsIgnoreCase("Y")) {
            return true;
        } else if (answer.equalsIgnoreCase("N")) {
            return false;
        } else {
            displayMessage("Illegal input. Try again");
        } return promptQuestion();
    }
}
