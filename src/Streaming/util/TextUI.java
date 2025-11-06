package Streaming.util;

public class TextUI {
    FileIO fIO = new FileIO();


    public String promptText(String output) {
        displayMessage(output);
        String answer = fIO.xxx();
        return answer;
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }

    public boolean promptQuestion() { // user question yes or no metode
                String answer= fIO.xxx();
        if (answer.equalsIgnoreCase("Y")) {
            return true;
        } else if (answer.equalsIgnoreCase("N")) {
            return false;
        } else {
            displayMessage("Illegal input. Try again");
        } return promptQuestion();
    }
}
