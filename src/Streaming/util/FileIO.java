package Streaming.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileIO {

    protected String fileName;
    protected String userSearch;
    private TextUI ui = new TextUI();

    public FileIO (String fileName, String userSearch) {
        this.fileName = fileName;
        this.userSearch = userSearch;
    }

    private Scanner scan = new Scanner(System.in);

    public String userInput (){
        String kkk = scan.nextLine();
        return kkk;
    }


    public String readFile (String fileName, String userSearch) {

        System.out.println("Here is som titels you can explore: \n");


        try (Scanner scanner = new Scanner(new File(fileName))){
            boolean found = false;

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                if (line.contains(userSearch)){
                    System.out.println(line);
                    found = true;
                }
            }
            if (!found){
                System.out.println("The desired titel was not found \n" + "Would you like to search for another titel? (Y/N)");
                ui.promptQuestion();
            }

        } catch (FileNotFoundException e) {
            System.out.println("We have technical difficulties - we are working on them and will be back shortly");
            throw new RuntimeException(e);
        }


    }
}



