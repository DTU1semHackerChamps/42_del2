import java.io.*;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Language {

    public static HashMap<String, String> languageInit() throws IOException {
        Path path = Paths.get("English.txt");
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path.toAbsolutePath())));

        HashMap<String, String> langList = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            langList.put(reader.readLine(), reader.readLine()); // langList.put(keyWord, Data)

        }
        return langList;
    }

}
