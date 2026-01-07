import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser{

    static String filename = "src/resources/word.txt";

    static Path path = Paths.get(filename);

    public static ArrayList<String> scannerParser() throws IOException {
        
        ArrayList<String> wordArray = new ArrayList<>();

        Scanner scnr = new Scanner(path);

        while (scnr.hasNextLine()) {

            String line = scnr.nextLine();

            wordArray.add(line);
        }

        scnr.close();

        return wordArray;
    }
}
