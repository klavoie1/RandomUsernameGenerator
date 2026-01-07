import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser{

    static void scannerParser() throws IOException {

        String filename = "src/resources/word.txt";

        Path path = Paths.get(filename);

        Scanner scnr = new Scanner(path);

        System.out.println("Reading the Word.txt File...");

        ArrayList<String> wordArray = new ArrayList<>();

        while (scnr.hasNextLine()) {

            String line = scnr.nextLine();

            wordArray.add(line);

        }

        // Here for testing purposes (DELETE LATER)
        System.out.println(wordArray);

        scnr.close();
    }





}
