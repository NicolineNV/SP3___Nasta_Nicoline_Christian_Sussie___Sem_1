package Streaming.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO {
// new version of fileIO:

    //instansvariabler:
    private String userSearch;
    private String path = ("Data/movieData.csv" + "Data/seriesData.csv");
    private Scanner scan = new Scanner(System.in);

    public FileIO(String userSearch) {
        this.userSearch = userSearch;
        this.path = path;
    }

    public String readUserInput() {
        String userInput = scan.nextLine();
        return readUserInput();
    }

    public ArrayList<String> readData(String userSearch) {
        ArrayList<String> dataFile = new ArrayList<>();
        File file = new File(path);
        {
            try {
                Scanner scan = new Scanner(file);
                scan.nextLine(); // skips header "title; year; categories; rating;"

                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    dataFile.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println(TextUI.IOExceptionMessage("We are experiencing some technical difficulties - sorry for the inconvenience"));
            }
            return dataFile;
        }
    }
}

   /* protected String fileName;
    protected String userSearch;
    private TextUI tUI;


    public FileIO (String fileName, String userSearch) {
        this.fileName = fileName;
        this.userSearch = userSearch;
        this.tUI = new TextUI();
    }

    public Scanner scan = new Scanner(System.in);

    public String readUserInput(){
        userSearch = scan.nextLine();
        return userSearch;
    }


    public void String(fileName, String userSearch) {
        ArrayList<String> readDataFile (String path){
            ArrayList<String> dataFile = new ArrayList<>();
            File file = new File(path);
            try {
                Scanner scan = new Scanner(file);
                scan.nextLine(); // skips header "title; year; categories; rating;"

                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    dataFile.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println(tUI.IOExceptionMessage("We are experiencing some technical difficulties - sorry for the inconvenience"));
            }
            return dataFile;
        }
    }




    public String readFile (String fileName, String userSearch) {

        System.out.println("Here is som titels you can explore: \n");    // linje skal flyttes senere

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
                tUI.promptQuestion();
            }

        } catch (FileNotFoundException e) {
            System.out.println("We have technical difficulties - we are working on them and will be back shortly");
            throw new RuntimeException(e);
        }

        return "";
    }
}
*/


