import Streaming.Search;
import Streaming.Series;
import Streaming.User;

public class StartMenu {

    public static void main (String[] args){

       //User test = new User();
       //test.user();


        Search test1 = new Search();
        test1.searchFile("Data/seriesData.csv", "Sci-fi");


    }
}
