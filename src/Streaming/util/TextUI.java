package Streaming.util;
public class TextUI {

    FileIO fileIO = new FileIO("xxx?","xx?");

    public String displayMessage(String msg) {
        System.out.println(msg);
        return "";
    }

    public String promptText(String output) {
        displayMessage(output);
        String answer = fileIO.readUserInput(); // hardkode så denne!!
        return answer;
    }

    public boolean promptQuestion() { // user question yes or no metode
        String answer= fileIO.readUserInput(); // hardkode denne!!
        if (answer.equalsIgnoreCase("Y")) {
            return true;
        } else if (answer.equalsIgnoreCase("N")) {
            return false;
        } else {
            displayMessage("Illegal input. Try again");
        } return promptQuestion();
    }

    public String IOExceptionMessage(String exception){
        System.out.println();
        return exception;
    }
}

